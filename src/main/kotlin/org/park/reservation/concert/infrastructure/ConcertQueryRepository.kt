package org.park.reservation.concert.infrastructure

import org.springframework.data.jpa.repository.JpaRepository


interface ConcertQueryRepository : JpaRepository<ConcertEntity, Long> {

}
