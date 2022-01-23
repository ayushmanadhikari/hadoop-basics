import java.io._


class Point(var xc: Int, var yc: Int){
    var x: Int = xc
    var y: Int = yc

    def move(dx: Int, dy: Int){
        x = x + dx
        y = y + dy

        println("New location of x: " + x)
        println("New location of y: " + y)
    }

}

object Demo {

    def main(args: Array[String]){
        val pt = new Point(10, 20)

        //move to new location
        pt.move(10, 10)
    }
}