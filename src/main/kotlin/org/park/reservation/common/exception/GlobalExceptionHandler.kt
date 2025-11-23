package org.park.reservation.common.exception

import mu.KotlinLogging
import org.park.reservation.common.dto.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {
    private val log = KotlinLogging.logger {}

    @ExceptionHandler(DataNotFoundException::class)
    fun DataNotFoundExceptionHandler(e: DataNotFoundException): ResponseEntity<ApiResponse<Unit>> {
        log.error { e.message }

        return ResponseEntity.ok(ApiResponse.failure("DATA_NOT_FOUND", e.message!!)) // TODO: error enum 관리
    }
}
