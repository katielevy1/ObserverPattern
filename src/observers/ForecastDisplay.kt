package observers

import DisplayElement
import Observer
import WeatherData

class ForecastDisplay(private val weatherData: WeatherData): Observer, DisplayElement {
    var currentPressure = 29.92f
    var lastPressure = 0f
    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        lastPressure = currentPressure
        currentPressure = pressure
        display()
    }

    override fun display() {
        println("Forecast:")
        when {
            currentPressure > lastPressure -> {
                println("Improving weather!")
            }
            currentPressure < lastPressure -> {
                println("Things are getting worse")
            }
            else -> {
                println("A lot more of the same")
            }
        }
    }

}