package org.park.reservation.common.dto

data class ApiResponse<T>(
    val success: Boolean,
    val data: T? = null,
    val error: ErrorDetail? = null
) {
    companion object {
        fun <T> success(data: T): ApiResponse<T> {
            return ApiResponse(success = true, data = data)
        }

        fun <T> failure(code: String, message: String): ApiResponse<T> {
            return ApiResponse(
                success = false,
                error = ErrorDetail(
                    code = code,
                    message = message
                )
            )
        }
    }
}

data class ErrorDetail(
    val code: String,
    val message: String
)
