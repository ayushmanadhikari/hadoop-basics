import java.io._


class Point(val xc: Int, val yc: Int){
    var x: Int = xc
    var y: Int = yc

    def move(dx: Int, dy: Int){
        x = x + dx
        y = y + dy

        println("New location of x: " + x)
        println("New location of y: " + y)
    }

}


class Location(override val xc: Int, override val yc: Int, var zc: Int) extends Point(xc, yc){
    var z: Int = zc

    def move(dx: Int, dy: Int, dz: Int){
        x = x + dx
        y = y + dy
        z = z + dz

        println("New x: " + x)
        println("New y: " + y)
        println("New z: " + z) 

    }
}


object Demo {

    def main(args: Array[String]){
        var loc1 = new Location(10,20,30)

        //move the points from Location class
        loc1.move(10,20,30)

    }
}