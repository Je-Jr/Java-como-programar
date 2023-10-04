public class TrafficLightTest {
  public static void main(String[] args) {
    for(TrafficLight light : TrafficLight.values()) {
      System.out.printf("Light %s will be on for %d seconds%n", light, light.getSec());
    }
  }
}
