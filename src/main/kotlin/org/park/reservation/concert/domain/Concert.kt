package org.park.reservation.concert.domain

import org.park.reservation.concert.infrastructure.ConcertEntity

class Concert(
    val id: Long,
    val name: String,
    val seats: List<Long>,
    val startDateTime: String,
    val endDateTime: String
) {

    companion object {
        fun from(concertEntity: ConcertEntity): Concert {
            return Concert(
                id = concertEntity.id,
                name = concertEntity.name,
                seats = concertEntity.seats,
                startDateTime = concertEntity.startDateTime.toString(),
                endDateTime = concertEntity.endDateTime.toString()
            )
        }
    }
}
