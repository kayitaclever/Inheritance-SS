fun main() {
 val car = Vehicles.Car("Toyota","modelY","Red",6)
    car.carry(8)
    car.identity()
    println(car.parkingFees(5))
    var volcano= Vehicles.Bus("Volcanoes","Model Y","White", 24)
    println(volcano.maxTripFare(100.45))
    println(volcano.parkingFees(5))
}

 open class Vehicles(var make: String,var model: String,var color: String,var capacity: Int){
 class Car(make:String, model:String,color:String, capacity:Int):Vehicles(make, model, color, capacity){

    fun carry(people:Int) {
        var x= people-capacity
        if (people<= capacity)
            println("carrying$people")

        else println("over capacity by $x people")
    }
    fun identity(){
        println("I'm a $color $make $model")

    }
    open fun parkingFees(hours:Int):Int{
        var fees= hours*20
        return fees
    }


}
class Bus( make: String, model: String, color: String, capacity: Int): Vehicles(make, model, color, capacity){
    fun maxTripFare(fare:Double):Double{
        return fare
    }
    fun parkingFees(hours:Int):Int{


       var fees= capacity*hours
       return fees
    }
}
}