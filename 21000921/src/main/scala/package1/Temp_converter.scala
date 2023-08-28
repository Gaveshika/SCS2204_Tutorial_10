
object Temp_converter {
  def calculateAverage(temps: List[Double]): Double = {
    val fahren_temps = temps.map(C => ((C*9)/5) + 32)
    val total_fahren = fahren_temps.reduce(_ + _)
    val average_fahren = total_fahren / fahren_temps.length

    average_fahren
  }

  def main(args: Array[String]): Unit = {
    val input_temperatures = List(0.0, 10.0, 20.0, 30.0)
    val average_fahren = calculateAverage(input_temperatures)
    println(s"Average Fahrenheit temperature: $average_fahren")
  }
}


