
// Simple console Massage
fun main() {
    println("Hello, World!")

    // factorial
    fun factorial(num: Int): Int {
        var results = 1
        for (i in 1..num) {
            results *= i
        }
        return results
    }

    val num = 5
    if (num < 0) {
        println("factorial not defined")
    } else {
        val factorial = factorial(num)
        println("factorial of $num is $factorial")
    }

    // Even odd
    fun checker(n: Int) = n % 2==0

    val n = 6
    val evenOdd = checker(n)
    if (evenOdd) println("Number $n is even")
    else println("Number $n is odd")

    //reverse string
    fun reverse(str: String): String = str.reversed()
    val text = "Shanza"
    val reverse = reverse(text)
    println("original string is : $text")
    println("reversed string is : $reverse")

    //vowel count
    fun countVowels(input: String): Unit {
        val vowel = listOf('a', 'e', 'i', 'o', 'u')
        var count = 0
        for (char in input.lowercase()) {
            if (char in vowel) {
                count++
            }
        }
        println("vowels in $input is $count")
    }

    val string = "Shanzakhan"
    countVowels(string)

    //max of two number
    fun max(a: Int, b: Int,c: Int): Int {
        var largest = a
        if (b > largest) {
            largest = b
        }
        if (c > largest) {
            largest = c
        }
        return largest
    }

    val a = 1
    val b = 20
    val c = 15
    val maxN = max(a,b,c)
    println("Max num of $a,$b,$c is $maxN")

    //palindrome
    fun palindrome(str: String) {
        val filterstring = str.filter { it.isLetterOrDigit() }.lowercase()
        if(filterstring == filterstring.reversed())
            println("$str is palindrome")
        else
            println("$str is not palindrome")

    }

    val stringChecker = "hyhyy"
    palindrome(stringChecker)

    //Prime number checker
    fun primeChecker(N: Int): Boolean {
        if (N <= 1)
            return false
        for (i in 2 until N) {
            if (N % i === 0)
                return false
        }
        return true
    }

    val P = 3
    val prime = primeChecker(P)
    if (prime) {
        println("The $P number is prime")
    } else {
        println("The $P number is not prime")
    }

    //Fibonacci series
    fun fibonacci(z: Int) {
        var x = 0
        var y = 1
        println("First $z fabionacci series")
        while (x <= z) {
            println("$x")
            val sum = x + y
            x = y
            y = sum
        }
    }
    fibonacci(4)

    //Sum of Array Elements
    fun sumOfArrayElements(array: IntArray): Int {
        var sum = 0
        for (element in array) {
            sum += element
        }
        return sum
    }

    val numbers = intArrayOf(10,20,30,40,50)
    val sum = sumOfArrayElements(numbers)
    println("The sum of the array elements is: $sum")

    //Minimum value in list
    fun findMinimum(list: List<Int>): Int {
        var min = list[0] // Assume the first element is the minimum
        for (element in list) {
            if (element < min) {
                min = element
            }
        }
        return min
    }

    val number = listOf(5, 2, 8, 1, 7)
    val minimum = findMinimum(number)
    println("The minimum value in the list $number is: $minimum")

    //Celsius to Fahrenheit
    fun celsiusToFahrenheit(celsius: Double) = (celsius * 9 / 5) + 32

    val celsius = 50.0
    val fahrenheit = celsiusToFahrenheit(celsius)
    println("$celsius degrees Celsius is equal to $fahrenheit degrees Fahrenheit")

    //Common Element from two lists
    fun findCommonElements(list1: List<Int>, list2: List<Int>): List<Int> {
        val commonElements = mutableListOf<Int>()
        for (element in list1) {
            if (list2.contains(element)) {
                commonElements.add(element)
            }
        }
        return commonElements
    }
    val list1 = listOf(1, 2, 4, 5)
    val list2 = listOf(3, 4, 5, 6, 7)
    val common = findCommonElements(list1, list2)
    println("Common elements: $common")

    //Build Calculator
    println("Enter Num1")
    val InputNumber1 = readln()
    val num1 = InputNumber1.toDouble()

    println("Enter Num2")
    val InputNumber2 = readln()
    val num2 = InputNumber2.toDouble()

    println("Choose an operation:")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")


    println("Enter Choice")
    val choice = readln().toInt()

    var result: Double = 0.0

    when (choice) {
        1 -> result = num1 + num2
        2 -> result = num1 - num2
        3 -> result = num1 * num2
        4 -> result = num1 / num2
        else -> println("Invalid choice")
    }

    println("Result: $result")

    //Arthematic Operations
    fun basicArithmeticOperations(num1: Int, num2: Int): List<Any> {
        val sum = num1 + num2
        val difference = num1 - num2
        val product = num1 * num2
        val quotient = num1.toDouble() / num2.toDouble()

        return listOf(sum, difference, product, quotient)
    }

    val results = basicArithmeticOperations(10, 5)
    println("Sum: ${results[0]}")
    println("Difference: ${results[1]}")
    println("Product: ${results[2]}")
    println("Quotient: ${results[3]}")
}




