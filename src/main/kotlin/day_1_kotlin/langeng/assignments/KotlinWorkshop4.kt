package day_1_kotlin.langeng.assignments

// Workshop #4 - classes

object KotlinWorkshop4 {

    // Don't touch! Given:
    @JvmStatic
    fun main(args: Array<String>) {
        testBus()
    }



    /* Exercise area */

    // ? Classes should be declared in the bottom of a file. Below functions.
    // There is an exception. We sort declarations by TODOs.
    // TODO 1: Declare a class Bus that will have integer amount of "passengersCount" as a property.
    class Bus(val passengersCount: Int) {

        // TODO 2: Add method "drive" without arguments that will print "Driving n passengers to the destination"
        //  where n - count of passengers.
        fun drive() {
            println("Drive on car with $passengersCount passengers")
        }
    }

    private fun testBus() {
        // TODO 3: Create an instance of your class.
         val bus = Bus(100)

        // TODO 4: Drive your bus to the destination and check out that the output is correct.
         bus.drive()
    }
}