abstract class MyAbstractClass {
    fun doSomething() { println("hello") }

    // By default all fun/classes are final need "open" keyword
    open fun doSomething2() { println("hello2") }
    protected open fun doSomething3() { println("hello3") }

    /*
        - Body cannot be abstract
        - Cannot have something like the following:
        abstract fun doSomething4() {}
        - These functions HAVE TO be overwritten in the child
    */
    abstract fun doSomething4()
    private fun doSomething5() { println("hello5") }
    protected fun doSomething6() { println("hello6") }
}

class ConcreteClass: MyAbstractClass() {
    /*
        Cannot have a function with the same name as the parent class
        - hides member of supertype needs 'override' modifier
    */
    // fun doSomething() {}

    // Do not need to overwrite
    override fun doSomething2() {
        println("modified hello2")
    }

    // Do not need to overwrite
    override fun doSomething3() { }

    // Need to overwrite
    override fun doSomething4() {
        println("overwritten hello4")
    }

    init {
        doSomething()
        doSomething2()
        doSomething4()
        // Cannot access because it's private
        // doSomething5()
        // super.doSomething5()
        doSomething6()
    }
}

fun main() {
    
}
