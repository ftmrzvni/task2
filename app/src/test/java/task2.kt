open class Animal(var Name : String, var Age : Int ){
    fun sleep() = println("$Name is sleeping now")
    fun isOld(): String {
        if (Age>20){
            return "$Name is old"
        }
        return ""
    }
}
class Dog(Name : String,Age : Int, var Breed : String) : Animal(Name,Age) {
    fun scratch()= println("$Name: is barking")
}
class Cat(Name : String,Age : Int, var Color : String) : Animal(Name,Age) {
    fun scratch()= println("$Name: is scratchig")

}
fun animalSpesifiction(animalsList:List<Animal>) {
    for (animal in animalsList){
        if (animal is Dog){
            println("${animal.Name} ${animal.Breed}")
        }
        else if (animal is Cat){
            println("${animal.Name} ${animal.Color}")
        }
    }
}
fun main() {
    val dog = Dog("Jack", 25, "Husky")
    val cat = Cat("Lucy", 8, "white")
    val animalsList = listOf(dog, cat)
    animalSpesifiction(animalsList)
    for (animal in animalsList){
        animal.sleep()
    }
    for (animal in animalsList){
        println(animal.isOld())
    }
}
