package org.park.reservation.reservation.exception

class DataNotFoundException(
    val id: Long,
    message: String = "데이터를 찾을 수 없습니다. id : $id"
) : RuntimeException(message)
