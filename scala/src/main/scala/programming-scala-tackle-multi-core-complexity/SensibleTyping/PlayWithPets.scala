class Pet(val name : String) {
  override def toString() = name
}

class Dog(override val name : String) extends Pet(name)

object Pet {
  def playWithPets[T <: Pet](pets : Array[T]) =
    println("Playing with pets : " + pets.mkString(", "))

  def copyPets[S, D >: S](fromPets : Array[S], toPets : Array[D]) = {

  }

  def main(args : Array[String]) : Unit = {
    val dogs = Array(new Dog("Rover"), new Dog("Comet"))
    playWithPets(dogs)

    val pets = new Array[Pet](10)
    copyPets(dogs, pets)
  }
}
