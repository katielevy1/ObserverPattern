
interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}

interface DisplayElement {
    fun display()
}

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}