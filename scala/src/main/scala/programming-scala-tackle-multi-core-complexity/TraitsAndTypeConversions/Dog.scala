package animal {
  class Dog(val name : String) extends Animal with Friend {
    override def listen = println(name + "'s listening quietly")
  }
}
