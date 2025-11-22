package org.park.reservation.reservation.concert.presentation.dto

import java.time.LocalDate

data class ConcertReservationAvailableDatesResponse(
    val id: Long,
    val name: String,
    val availableDates: List<LocalDate>
) {
    companion object {
        fun of(id: Long, name: String, availableDates: List<LocalDate>) =
            ConcertReservationAvailableDatesResponse(
                id = id,
                name = name,
                availableDates = availableDates
            )
    }
}
