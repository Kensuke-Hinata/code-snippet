object MultipleAssignment {
  def getPersonInfo(primaryKey : Int) = {
    ("Kensuke", "Hinata", "xxx@gmail.com")
  }

  def main(args : List[String]) = {
    val (firstName, lastName, emailAddress) = getPersonInfo(0)

    println("First Name is " + firstName)
    println("Last Name is " + lastName)
    println("Email Address is " + emailAddress)
  }
}
