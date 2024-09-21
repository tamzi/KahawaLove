package com.kahawalove.mkahawa.utils

import java.time.LocalDate
import java.time.Month

// Season Enum with associated months
enum class Season {
    SPRING, SUMMER, FALL, WINTER;

    companion object {
        fun fromMonth(month: Month): Season {
            return when (month) {
                Month.DECEMBER, Month.JANUARY, Month.FEBRUARY -> WINTER
                Month.MARCH, Month.APRIL, Month.MAY -> SPRING
                Month.JUNE, Month.JULY, Month.AUGUST -> SUMMER
                Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER -> FALL
            }
        }

        fun getCurrentSeason(): Season = fromMonth(LocalDate.now().month)
    }
}