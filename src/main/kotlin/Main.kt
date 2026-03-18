
fun main() {


    // --- Variables ---
    //println("--- Variables ---")


    // String
    var userName: String = "Jota" // changeable variable
    val userName2: String = "Jao" // unique variable, not changeable

    // Integer type
//    val age = 22
//    val integerMaxValue = Int.MAX_VALUE
//    val integerMinValue = Int.MIN_VALUE
//
//    val byteMaxValue = Byte.MAX_VALUE
//    val byteMinValue = Byte.MIN_VALUE
//
//    val longMaxValue = Long.MAX_VALUE
//    val longMinValue = Long.MIN_VALUE

    //println("This is a String: $userName. This is an int: $age\n")

    // Float and Double type
    val myNumber: Float = 2.5f // float = f suffix | precision ~7
    val pi = 3.14159265358979 // double | precision ~15

    //println("This is a Float number: $myNumber, and this is a double number: $pi")



    // Char and Boolean type
    val myCharValue: Char = 'A'
    //println("My char value is $myCharValue")

    val myBooleanValue: Boolean = true
    //println(myBooleanValue)
    val BooleanTrue = true
    val BooleanFalse = false
    //println("Operators: &&, || and ! \nUsing BooleanTrue and BooleanFalse. \n&&: ${BooleanTrue && BooleanFalse} \n||: ${BooleanTrue || BooleanFalse} \n!: ${!BooleanTrue}")



    // --- Operators ---
//    println("--- Operators ---")
//
//    println("Arithmetic: ")
//    println("Y = 3 and X = 5")
//    val x = 5
//    val y = 3
//
//    println("Y + X = ${x + y}")
//    println("Y - X = ${x - y}")
//    println("Y * X = ${x * y}")
//    println("Y / X = ${x / y}")
//    println("Y % X = ${x % y}")
//    println("Priority: ")
//    println("3 + 5 * 2 = ${ 3 + 5 * 2}")
//    println("(3 + 5) * 2 = ${ (3 + 5) * 2}")
//
//    println("Assignment: ")
//    var result = 2
//
//    result += 2
//    println("result +=: $result")
//    result -= 2
//    println("result -=: $result")
//    result *= 2
//    println("result *=: $result")
//    result /= 2
//    println("result /=: $result")
//    result %= 2
//    println("result %=: $result")


//    println("Comparison: ")
//    val isActive = true
//    if (isActive == true) {
//        println("Active | equal to: ==")
//    }
//
//    var x = 5
//    var y = 4
//    var z = 3
//
//    if (x != y) {
//        println("X is different from y")
//    }
//    if (x > y) {
//        println("X is greater than y")
//    }
//    if (z < y) {
//        println("Z is less than y")
//    }
//    if (x >= z) {
//        println("X is greater or equal to z")
//    }
//    if (z <= y) {
//        println("Z is less or equal to y")
//    }

//
//    println("Conditional operations: ")
//    var a = 5
//    var b = 3
//    var c = 6
//    if (a >= 4 && c >= 4) {
//        println("&&: A and C is more or equal than 4")
//    }
//    if (a >= 4 || b <= 4) {
//        println("||: A is more or equal than 4 or B is less or equal than 4")
//    }
//
//    var isTrue = false
//    if (!isTrue) {
//        println("isTrue = false, but !isTrue is true!")
//    }


//    println("Increment and Decrement")
//    var a = 3
//    println("A = $a")
//    a++
//        println("A++ = $a")
//    print("A = $a\n")
//    a--
//    println("A-- = $a")


//    println("if and else:")
//    //IF
//    var height = 180
//    if (height >= 170) {
//        println("Tall")
//    } else {
//        println("Not tall")
//    }
//
//    //IF and Else
//    var grade = 7
//    if (grade >= 9) {
//        println("Excellent")
//    } else if (grade >= 7) {
//        println("Approved")
//    } else if (grade >= 5) {
//        println("Recovery")
//    } else {
//        println("Not approved")
//    }
//
//    val connection = 10
//    val status = if (connection >= 8) "Great" else "Bad"
//    println(status)

//    println("Loop When = Switch")
//    val day = 3
//    when (day) {
//        1 -> println("Moonday")
//        2 -> println("Tuesday")
//        3 -> println("Wednesday")
//        4 -> println("Thursday")
//        5 -> println("Friday")
//        6 -> println("Saturday")
//        7 -> println("Sunday")
//    }
//
//    println("While")
//    var i = 1
//    while (i <= 5) {
//        println(i)
//        i++
//    }
//
//
//    println("Do While")
//    var o = 1
//    do {
//        println(o)
//        o++
//    } while (o <= 5)
//
//    println("For")
//    for (i in 1..7) {
//        println(i)
//    }
//
//    println("For | until: excludes the last one ")
//    for (i in 1 until 5) {
//        println(i)
//    }
//
//    println("For | downTo: regressive")
//    for (i in 5 downTo 1) {
//        println(i)
//    }
//
//    print("For | Step: number for jump")
//    for (i in 1..10 step 2) {
//        println(i)
//    }
//
//    print("Flow controller: Break and Continue")
//    for (i in 1..10) {
//        if (i == 5) break
//        println(i)
//    }
//    for (i in 1..10) {
//        if (i == 5) continue // Cancel everything below and return to the iteration
//        println(i)
//    }



//    sayHello("Jota", 22)
//    sum(3, 6)

//
//    println("Arrays")
//    //val names: Array<String> = arrayOf("Jota", "Megan", "Marcos")
//    val names= arrayOf("Jota", "Megan", "Marcos")
//    val mixedElements = arrayOf(4, 6, 3, 5, 7, 9, 3, 6, "sabado", 3.51, 'M')
//
//    names[0] = "Bato"
//    println("First Element: ${names[1]}")
//    println("The size of the array is: ${names.size}")
//
//    for (i in mixedElements) {
//        if (i is String) {
//            println(i)
//        }
//    }

//    val max = findMax(arrayOf(3,5,7,3,2,6,4))
//    val min = findMin(arrayOf(3,5,7,3,2,6,4))
//
//    println("Max value = $max")
//    println("Min value = $min")

//    val max = findMinAndMax(arrayOf(10,20,30,40,50), true)
//    println("The max value = $max")
//    val min = findMinAndMax(arrayOf(10,20,30,40,50), false)
//    println("The max value = $min")

//    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//
//    println("Max numbers = ${numbers.max()}")
//    println("Min numbers = ${numbers.min()}")
//    println("Sum of numbers = ${numbers.sum()}")
//    println("Average of numbers = ${numbers.average()}")
//    println("Sorted list of numbers = ${numbers.sorted()}")
//    println("Contains number 7? ${numbers.contains(7)}")
//
//    for (number in numbers) {
//        println(number)
//    }





    println("--- OOP ---")
    //cars()
    //people()
    calcul()


}

//fun sayHello(name: String, age: Int) {
//    println("Hello $name, you age is $age!")
//}
//
//fun sum(a: Int, b: Int)  {
//    println(a+b)
//}

//fun findMax( numbers: Array<Int>): Int {
//    var max = numbers[0]
//    for (number in numbers) {
//        if (number > max) {
//            max = number
//        }
//    }
//    return max
//}
//fun findMin( numbers: Array<Int>): Int {
//    var min = numbers[0]
//    for (number in numbers) {
//        if (number < min) {
//            min = number
//        }
//    }
//    return min
//}

//fun findMinAndMax(numbers: Array<Int>, searchMax: Boolean): Int {
//    var max = numbers[0]
//    var min = max
//    if (searchMax) {
//        for (number in numbers) {
//            if (number > max) {
//                max = number
//            }
//        }
//        return max
//    } else {
//        for (number in numbers) {
//            if (number < min) {
//                min = number
//            }
//        }
//        return min
//    }
//}