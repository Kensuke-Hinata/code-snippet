object UseResource {
  def main(args : Array[String]) : Unit = {
    Resource.use { resource =>
      resource.op1
      resource.op2
      resource.op3
      resource.op1
    }
  } 
}
