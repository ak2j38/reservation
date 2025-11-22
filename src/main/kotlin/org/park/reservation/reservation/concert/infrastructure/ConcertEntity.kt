package org.park.reservation.reservation.concert.infrastructure

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class ConcertEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    var name: String,
    var seats: List<Long>, // TODO: Seat으로 변경
    var startDateTime: LocalDateTime,
    var endDateTime: LocalDateTime
) {

}
