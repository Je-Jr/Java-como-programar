public enum TrafficLight {
  RED(40),
  GREE(10),
  YELLOW(2);

  private final int sec;

  TrafficLight(int sec) {
    this.sec = sec;
  }

  public int getSec() {
    return sec;
  }

}
