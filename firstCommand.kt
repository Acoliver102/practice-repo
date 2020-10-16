class addInteger(arg: Int) : CommandBase() {
    var ranInt = arg

    init {

    }
    override fun initialize() {
        ranInt += 1
    }

    override fun end(interrupted: Boolean) {
        ranInt += 1
        println(ranInt)
    }

}
