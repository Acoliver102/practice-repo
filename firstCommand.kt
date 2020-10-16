class addInteger(arg: Int) : CommandBase() {
    var ranInt = 2

    init {

    }
    override fun initialize() {
        ranInt += 1
    }

    override fun end() {
        ranInt += 1
        println(ranInt)
    }

}
