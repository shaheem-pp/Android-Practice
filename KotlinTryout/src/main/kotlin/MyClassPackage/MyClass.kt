package MyClassPackage

class MyClass {
    init {
        println("Used MyClass")
    }
}

open class Chef(name: String) {
    init {
        println("Hello Chef $name")
    }

    fun makeDish() {
        println("Making Dish")
    }

    open fun makeSpecialDish() {
        println("Chicken Pasta")
    }
}

class ItalianChef(name: String) : Chef(name) {
    init {
        println("Hello I'm an Italian Chef, $name")
    }

    override fun makeSpecialDish() {
        println("Chicken Parmassan")
    }
}


fun main() {
    var me = MyClass()

    var ikkuya = Chef("Kujaan")
    ikkuya.makeDish()
    ikkuya.makeSpecialDish()

    var maadhu = ItalianChef("Maadu")
    maadhu.makeSpecialDish()

}