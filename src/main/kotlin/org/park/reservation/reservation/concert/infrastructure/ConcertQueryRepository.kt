package org.park.reservation.reservation.concert.infrastructure

import org.springframework.data.jpa.repository.JpaRepository


interface ConcertQueryRepository : JpaRepository<ConcertEntity, Long> {

}
