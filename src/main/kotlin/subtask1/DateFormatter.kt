package subtask1

import java.time.LocalDate


class DateFormatter {


    fun toTextDay(day: String, month: String, year: String): String {

      var  outputString=""



       outputString = findData(day,month,year)
            println(outputString)

      return outputString
    }

    private fun findData(day: String, month: String, year: String): String {
        var outputString=""

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
        outputString = if (dayOfWeek != "Такого дня не существует") {
            "$day $outputString, $dayOfWeek"
        } else{
            dayOfWeek

        }

        return outputString


    }
    private fun findDayOfWeek(day: String, month: String, year: String): String {
        var outputString = ""
        try{
        var date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
        val day = date.dayOfWeek.toString()

        when(day){

            "SUNDAY" -> outputString ="воскресенье"
            "TUESDAY" -> outputString ="вторник"
            "Wednesday" -> outputString ="среда"
            "THURSDAY" -> outputString ="четверг"
            "Friday" -> outputString ="пятница"
            "Saturday" -> outputString ="суббота"

        }}
        catch (e: Exception){
            outputString = "Такого дня не существует"
        }

        return outputString

    }


}
