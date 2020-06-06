import observers.CurrentConditionsDisplay
import observers.ForecastDisplay
import observers.HeatIndexDisplay
import observers.StatisticsDisplay

    fun main(args: Array<String>) {
        val weatherData = WeatherData()

        val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
        val forecastDisplay = ForecastDisplay(weatherData)
        val heatIndexDisplay = HeatIndexDisplay(weatherData)
        val statisticsDisplay = StatisticsDisplay(weatherData)

        println("setting new measurements")
        weatherData.setMeasurements(80f, 65f, 30.4f)
        println("setting new measurements")
        weatherData.setMeasurements(90f, 35f, 20.4f)

    }

