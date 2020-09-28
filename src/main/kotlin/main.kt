import java.time.LocalDate
import java.time.format.DateTimeFormatter


fun main() {

    //var scanner = "" // to get user input

    val today = LocalDate.now() // to get current date / time

    // set date format
    val formatter = DateTimeFormatter.ofPattern("M/d/yyyy")

    // display today's date formatted
    val textToday = today.format(formatter)

    println("Today's date is: $textToday")

    // get info from user
    println("What month were you born in? (Enter as number: January = 1)")
    val myMonth = readLine()!!.toInt()
    println("What day were you born? ")
    val myDay = readLine()!!.toInt()
    println("What year were you born? ")
    val myYear = readLine()!!.toInt()
    println("What is this month? ")
    val thisMonth = readLine()!!.toInt()

    // assign information to variable birthday
    var birthday = LocalDate.of(myYear, myMonth, myDay)


    // if birthday already happened this year, add one to year
    if (birthday.isAfter(today)) {
        birthday = birthday.plusYears(2)
    }


    val nextBirthday = birthday.format(formatter)
    // calculate days till next birthday


    val daysToBirthday = today.until(birthday)

    if (thisMonth and myDay == today.dayOfMonth) {
        println("Happy Birthday!")
    } else {
        println("Your next birthday is: $nextBirthday")
        println("There are $daysToBirthday days till your next birthday!")
    }

}


