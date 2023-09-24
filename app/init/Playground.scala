package init

object Playground extends App {

  trait Animal
  class Dog       extends Animal
  class Cat       extends Animal
  class Crocodile extends Animal

  class InvariantCage[T]

  class CovariantCage[+T] {
    def addAnimal[B >: T](animal: B): CovariantCage[B] = {
      println("TEST")
      new CovariantCage[B]
    }
  }

  class ContraCage[-T]

  val animal  = new Dog
  val animal2 = new Cat

  val cage: CovariantCage[Animal] = new CovariantCage[Dog]
  val mycage2                     = cage.addAnimal(animal2)

  class Vehicle
  class Bike extends Vehicle
  class Car  extends Vehicle
  class IList[T]

  class CParking[+T](vehicles: List[T]) {

    def park[B >: T](vehicle: B): CParking[B] = ???

    def impound[B >: T](vehicles: List[B]): CParking[B] = ???

    def checkVehicles(conditions: String): CParking[T] = ???
  }

}
