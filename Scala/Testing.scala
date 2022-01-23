class Dog(var breed: String, var Name: String, var Age: Int){
    

    def bark(){
        println("The dog barked.")
    }

    def rollOver() : Int = {
        println("The dog rolled over.")
        return 1
    }

    def printinfo(){
        println("The Dog's name is " +Name + ". It is " +Age + " years old.")
    }


}


object Testing{

    def main(args: Array[String]){
        var tommy = new Dog("German Shepherd", "Tommy", 5)
        tommy.printinfo()
        tommy.rollOver()
        tommy.bark()


    }
}