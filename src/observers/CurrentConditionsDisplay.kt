package observers

import DisplayElement
import Observer
import WeatherData

class CurrentConditionsDisplay(private val weatherData: WeatherData): Observer, DisplayElement {
    var temperature = 0.0f
    var humidity = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and $humidity% humidity")
    }
}