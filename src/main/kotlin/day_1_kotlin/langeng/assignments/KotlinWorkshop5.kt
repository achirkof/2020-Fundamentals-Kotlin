@file:Suppress("unused")

package day_1_kotlin.langeng.assignments

// Workshop #5 - inheritance, abstract, interface

// Don't touch! Given:
// Declare a contract for a transport ability.
interface Driveable {
    fun drive()
}

// Declare a transport class which describes passenger transport of all types.
// Give this transport an ability to drive.
abstract class Transport(protected var passengersCount: Int): Driveable

// Create a Bicycle transport which can carry a single person.
class Bicycle: Transport(1) {
    override fun drive() {
        println("Ride a bicycle.")
    }
}



/* Exercise area */

// TODO 1: Create a new interface that will be appropriate for new classes below.
// ? By convention, names of Classes and Interfaces start with an upper case letter and use the camel case.
// Example: "SomeLongClassName".
interface Carrieable {
    fun isFull(): Boolean
}

// TODO 2: Write your own class Bus and some Car.
//  Instead of writing it from scratch, extend it from the Transport class and your new interface.
// ? Class can extends only one other class, but implements many interfaces, i.e.:
// class Kitty(): Cat, Cuteable, Sleepable, Furryable {}

class Bus(passengersCount: Int): Transport(passengersCount), Carrieable {
    private val maxCapacity = 25

    override fun isFull(): Boolean {
        return passengersCount > maxCapacity
    }

    override fun drive() {
        if (!isFull()) {
            println("Can add more passengers")
        } else {
            println("We are full. Let's drive!")
            drive()
        }
    }
}


class Car(passengersCount: Int): Transport(passengersCount), Carrieable  {
    private val maxCapacity = 5

    override fun isFull(): Boolean {
        return passengersCount > maxCapacity
    }

    override fun drive() {
        println("drivind Car")
    }
}

// TODO 3: Test your transport in appropriate sections
object VehiclesTest {

    // You can run the main function to test the code
    @JvmStatic
    fun main(args: Array<String>) {
        testBus()
        testCar()
        testBicycle()
    }

    private fun testBus() {
        println("Testing how bus drives...")
        val bus = Bus(25)
        bus.drive()
    }

    private fun testCar() {
        println("Testing how car drives...")
        val car = Car( 3)
        car.drive()
    }

    private fun testBicycle() {
        println("Testing how bicycle drives...")
        val bike = Bicycle()
        bike.drive()
    }



    /* Exercise bonus area */

    // TODO 4: Test bus abilities as separate features.
    private fun testBusParts() {
        val car = Car(5)

        val capacity: Carrieable = car
        println("Capacity is full? :${capacity.isFull()}")
    }
}