package DigitalCircuits{
  type Action = () => Unit
  abstract class Simulation{
    def currentTime: Int
    def afterDelay(delay: Int, action: => Action)
    def run()
  }
}
