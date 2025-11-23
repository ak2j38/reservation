package org.park.reservation.concert.application

import org.park.reservation.concert.domain.Concert

interface ConcertFinder {
    fun findAvailableReservationDates(concertId: Long): Concert
}
