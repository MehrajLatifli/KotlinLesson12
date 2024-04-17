import Task4.IParameter
import java.util.Scanner

open class Mathematic(override var inlineRadius: Double?) : IParameter {


    fun calculateArea(choose: Int?, scanner: Scanner?): String {
        return when (choose) {
            1 -> {
                inlineRadius?.let { r ->
                    val circleArea = Math.PI * (r * r)
                    "Area of Circle: $circleArea"
                } ?: "Invalid input. Please ensure radius is provided."
            }
            2 -> {
                print("\nEnter side_1: ")
                val side1: Double? = scanner?.nextDouble()

                print("Enter side_2: ")
                val side2: Double? = scanner?.nextDouble()

                print("Enter side_3: ")
                val side3: Double? = scanner?.nextDouble()

                val triangleArea = inlineRadius?.let { r ->

                    side1?.let { s1 ->
                        side2?.let { s2 ->
                            side3?.let { s3 ->
                                val area = ((s1 + s2 + s3) / 2)*r

                                area
                            }
                        }
                    }
                }

                triangleArea?.let {
                    "Area of Triangle: $it"
                } ?: "Invalid input. Please ensure all values are provided."
            }
            3 -> {
                print("\nEnter squareSide: ")
                val squareSide: Double? = scanner?.nextDouble()

                val result = inlineRadius?.let { r ->
                    squareSide?.let { side ->
                        val squareArea =  4 * (r * r)
                        "Area of Square: $squareArea"
                    }
                } ?: "Invalid input. Please ensure all values are provided."

                result
            }
            else -> "Invalid choice."
        }
    }
}
