package com.example.calculator.model

sealed class CalculateOperation(val symbol:String){
    object Add:CalculateOperation("+")
    object Minus:CalculateOperation("-")
    object Multiply:CalculateOperation("x")
    object Divide:CalculateOperation("÷")
    object None:CalculateOperation("")
}
