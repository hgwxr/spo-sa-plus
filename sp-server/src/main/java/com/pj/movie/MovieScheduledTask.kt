package com.pj.movie

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class MovieScheduledTask {
    var temp: Int = 0

    @Scheduled(cron = "*/15 * * * * ?")
    fun run() {
        printHello(temp++)
    }
}