fun main() {

    println("Hello World")
    print("Enter 2 Numbers: ")

    val n1 = readLine()?.toFloat()
    val n2 = readLine()?.toFloat()

    val sum = add(num1 = n1!!, num2 = n2!!)
    val dif = sub(num1 = n1, num2 = n2)
    val prod = mul(num1 = n1, num2 = n2)
    val quo = div(num1 = n1, num2 = n2)

    println("$sum $dif $prod $quo")

}