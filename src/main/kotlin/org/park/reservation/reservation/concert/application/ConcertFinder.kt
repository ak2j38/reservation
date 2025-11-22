package org.park.reservation.reservation.concert.application

import org.park.reservation.reservation.concert.domain.Concert

interface ConcertFinder {
    fun findAvailableReservationDates(concertId: Long): Concert
}
