
class addInteger(var number = 5) : CommandBase() {

    init {

    }

    override fun initialize() {
        number++
    }

    override fun end(interrupted: Boolean) {
        number++
        println(number)
        }
    }
