package org.park.reservation.concert.presentation

import org.park.reservation.concert.application.ConcertFinder
import org.park.reservation.concert.presentation.dto.ConcertReservationAvailableDatesResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ConcertController(
    private val concertFinder: ConcertFinder
) {

    @GetMapping("/api/v1/concerts/{concertId}/dates")
    fun getAvailableDates(concertId: Long): ResponseEntity<ConcertReservationAvailableDatesResponse> {
        val concert = concertFinder.findAvailableReservationDates(concertId)

        return ResponseEntity.ok(
            ConcertReservationAvailableDatesResponse.of(
                concert.id,
                concert.name,
                listOf()
            )
        )
    }
}
