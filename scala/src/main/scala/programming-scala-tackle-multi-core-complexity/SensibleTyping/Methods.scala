object Methods {
  def printMethodInfo(methodName : String) = {
    println("The return type of " + methodName + " is " +
      getClass().getDeclaredMethod(methodName)
        .getReturnType().getName())
  }

  def method0() { 6 }
  
  def method1() = { 6 }

  def method2() = 6

  def method3() : Double = 6

  def main(args : Array[String]) : Unit = {
    printMethodInfo("method0")
    printMethodInfo("method1")
    printMethodInfo("method2")
    printMethodInfo("method3")
  }
}
