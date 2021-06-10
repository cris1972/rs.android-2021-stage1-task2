package subtask1

import java.time.LocalDate


class DateFormatter {

    // дни недели написать большими буквами
    fun toTextDay(day: String, month: String, year: String): String {
        println("метод отработал")
      var  outputString=""
        var date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
        val dow = date.dayOfWeek


       outputString = findData(day,month,year)
            println(dow)

      return outputString
    }

    private fun findData(day: String, month: String, year: String): String {
        var outputString=""
        outputString = testOnCorektDate(day, month, year)
        when(month){
            "1"-> outputString = "января"
            "2"-> outputString ="февраля"
            "3"-> outputString ="марта"
            "4"-> outputString ="апреля"
            "5"-> outputString ="мая"
            "6"-> outputString ="июня"
            "7"-> outputString ="июля"
            "8"-> outputString ="августа"
            "9"-> outputString ="сеньтября"
            "10"-> outputString ="октября"
            "11"-> outputString ="ноября"
            "12"-> outputString ="декабря"

        }

        var dayOfWeek = "воскресенье"
            dayOfWeek = findDayOfWeek(day,month,year)
        outputString = "$day $outputString, $dayOfWeek"

        return outputString


    }
    private fun findDayOfWeek(day: String, month: String, year: String): String {
        var date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
        val day = date.dayOfWeek.toString()
        var outputString = ""
        when(day){

            "SUNDAY" -> outputString ="воскресенье"
            "TUESDAY" -> outputString ="вторник"
            "Wednesday" -> outputString ="среда"
            "THURSDAY" -> outputString ="четверг"
            "Friday" -> outputString ="пятница"
            "Saturday" -> outputString ="суббота"

        }

        return outputString

    }

    private fun testOnCorektDate(day: String, month: String, year: String): String {
        var outputString = ""
        when(month){


        }

        return outputString

    }
}
