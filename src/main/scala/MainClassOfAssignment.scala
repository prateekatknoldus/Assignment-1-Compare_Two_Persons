// Creating object for performing the comparison between two persons
object MainClassOfAssignment {

  // Main method
  def main(args: Array[String]): Unit = {
    // creating person one
    val personOne = new Person("Prateek",21)
    // creating person two
    val personTwo = new Person("Prateek",25)

    // checking whether personOne <, >, <= or >= personTwo
    println(personOne < personTwo)
    println(personOne > personTwo)
    println(personOne <= personTwo)
    println(personOne >= personTwo)
  }
}
