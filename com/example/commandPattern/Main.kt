package com.example.commandPattern

interface Commands {
    fun execute(currentValue: Int): Int
    fun undo(currentValue: Int): Int
}

class AddCommand(
    val valueToAdd: Int
): Commands {
    override fun execute(currentValue: Int): Int {
        return currentValue+valueToAdd
    }

    override fun undo(currentValue: Int): Int {
        return currentValue-valueToAdd
    }
}
class SubtractCommand(
    val valueToSubtract: Int
): Commands {
    override fun execute(currentValue: Int): Int {
        return currentValue-valueToSubtract
    }

    override fun undo(currentValue: Int): Int {
        return currentValue+valueToSubtract
    }
}
class MultiplyCommand(
    val valueToMultiply: Int
): Commands {
    override fun execute(currentValue: Int): Int {
        return currentValue*valueToMultiply
    }

    override fun undo(currentValue: Int): Int {
        return currentValue/valueToMultiply
    }
}
class DivideCommand(
    val valueToDivide: Int
): Commands {
    override fun execute(currentValue: Int): Int {
        return currentValue/valueToDivide
    }

    override fun undo(currentValue: Int): Int {
        return currentValue*valueToDivide
    }
}

class Calculator(
    var value:Int=0
) {
    fun executeCommand(commands: Commands): Int{
        value = commands.execute(value)
        return value
    }
    fun undoCommand(commands: Commands): Int{
        value = commands.undo(value)
        return value
    }
}

fun main() {
    val calc=Calculator()
    println(calc.executeCommand(AddCommand(4)))
    println(calc.executeCommand(AddCommand(20)))
    println(calc.executeCommand(AddCommand(4)))
}