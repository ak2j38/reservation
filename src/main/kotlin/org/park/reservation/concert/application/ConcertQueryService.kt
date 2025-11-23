package org.park.reservation.concert.application

import org.park.reservation.common.exception.DataNotFoundException
import org.park.reservation.concert.domain.Concert
import org.park.reservation.concert.infrastructure.ConcertQueryRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ConcertQueryService(
    private val concertQueryRepository: ConcertQueryRepository
) : ConcertFinder {

    @Transactional(readOnly = true)
    override fun findAvailableReservationDates(concertId: Long): Concert {
        return concertQueryRepository.findByIdOrNull(concertId)?.let {
            Concert.from(it)
        } ?: throw DataNotFoundException(concertId)
    }
}
