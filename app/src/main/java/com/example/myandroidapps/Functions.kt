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