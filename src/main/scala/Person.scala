//Implementation of Person class which extends the Ordered trait to do the comparison between two Persons
class Person(val name: String, val age: Int)  extends Ordered[Person]{

  /** Overriding the compare method of Ordered trait to compare two Persons based on their:
  * age if their names are same
  * name's length if their names are not same
  */
  override def compare(that: Person): Int = {
    if(this.name.equals(that.name)) {
      if(this.age < that.age) -1
      else if(this.age > that.age) 1
      else 0
    }
    else {
      if(this.name.length < that.name.length) -1
      else if(this.name.length > that.name.length) 1
      else 0
    }
  }

}

