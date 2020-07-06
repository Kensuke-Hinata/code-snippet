abstract class Check {
  def check() : String = "Checked Application Details..."
}

trait CreditCheck extends Check {
  override def check() : String = "Checked Credit..." + super.check()
}

trait EmploymentCheck extends Check {
  override def check() : String = "Checked Employment..." + super.check()
}

trait CriminalRecordCheck extends Check {
  override def check() : String = "Checked Criminal Records..." + super.check()
}

object Decorator {
  def main(args : Array[String]) : Unit = {
    val apartmentApplication = new Check with CreditCheck
    with CriminalRecordCheck

    println(apartmentApplication.check)

    val employmentCheck = new Check with CriminalRecordCheck 
    with EmploymentCheck 

    println(employmentCheck.check)
  }
}
