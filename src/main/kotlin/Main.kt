fun main(){
    val toyo=Car("Toyota","Prado","KDG 1128",0)
    val audi=Car("Audi","A4","KCT 300F",0)
    audi.start()
    println(audi.speed)
    audi.accelerate(60)
    println(audi.speed)
    audi.accelerate(35)
    println(audi.speed)

    audi.start()
    println(audi.speed)
    audi.deccelerate(60)
    audi.deccelerate(35)
    println(audi.speed)

    audi.stop()
    println(audi.speed)
    //

    val myBook=Book("Born a crime",288,"Trevor Noah",2017)
    println(myBook.title)
    println(myBook.pages)

//
println(ageCalculation(arrayOf(20,30,35,40,20)))



}
class Car(var make: String,var model: String,var registration: String,var speed: Int){
    fun start(){
        println("vuuuu,vroom")
        println("hooooott")

    }
    fun accelerate(acceleration:Int):Int{
        speed += acceleration
        return speed
    }
    fun deccelerate(decceleration:Int):Int{
        speed-=decceleration
        return speed

    }
    fun hoot(){
        println("hooooott")

    }
    fun stop(){
        speed=0
        println("boom")

    }


}

//Data class
data class Book(var title: String,var pages: Int,var author: String,var year: Int)
data class Agestats(var max:Int,var min:Int,var median:Double)
fun ageCalculation(age:Array<Int>):Agestats {
    var min = age.min()
    var max = age.max()
    val median = age.average()
    val stats = Agestats(min, max, median)
return stats
}
//    println(ageCalculation(1,2,3))






