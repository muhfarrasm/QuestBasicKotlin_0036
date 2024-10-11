package com.example.myandroidapps

fun withoutParameter() {
    println("=== withoutParameter ===")
    println("Hello, Farras")
}

fun withParameter(name: String){
    println()
    println("=== withParameter ===")
    println("Hello, $name!")
}

// named argument
// named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("=== withNamedArgument ===")
    println("Hello, $name! You are $age years old")
}

// default parameter value
// default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "Farras", age: Int){
    println("=== withDefaultParameter ===")
    println("Hello, $name! You are $age years old")
}

fun withReturn(panjang: Int, lebar: Int): Int {
    return panjang * lebar // Mengembalikan hasil luas
}

fun main (){
    withoutParameter()
    withParameter("Farras")
    withNamedArgument("Farras", age = 21)
    withDefaultParameter (age = 21)
    val luas = withReturn(5, 10) // Memanggil fungsi dan menyimpan hasilnya
    println("Luas: $luas") // Mencetak hasil luas
}