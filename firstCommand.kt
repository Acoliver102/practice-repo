class addInteger(arg: Int) : CommandBase() {
    var mArg = arg

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
