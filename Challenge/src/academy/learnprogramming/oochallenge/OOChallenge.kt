package academy.learnprogramming.oochallenge

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        System.out.println(
            "Bike is in gear" + gear +
                    " with a cadence of " + cadence +
                    "travelling at a speed of " + speed + "."
        )
    }
}

class KotlinMTB(var seatHeight: Int, cadence: Int, speed: Int, gear: Int):
    KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription();
        System.out.println("The mountain bike has a seat height of $seatHeight inches")
    }
}

class KotlinRoadbike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int):
    KotlinBicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription();
        System.out.println("The mountain bike has a tire of $tireWidth inches")
    }
}
