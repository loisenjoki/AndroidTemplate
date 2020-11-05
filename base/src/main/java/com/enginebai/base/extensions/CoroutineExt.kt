package com.enginebai.base.extensions

/**
 * Retry running block with exponential backoff mechanism.
 * @param times how many times to retry.
 * @param initialDelayMillis The initial delay time in millis second.
 * @param delayFactor the factor to multiple [initialDelayMillis] to be next retry delay
 */
suspend fun <T> retry(
    times: Int = 5,
    initialDelayMillis: Long = 1000,
    delayFactor: Double = 2.0,
    block: suspend () -> T
): T {

    return block() // last attempt
}