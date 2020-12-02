package AutoLoader;

public class Loading {
  private static Object load = new Object();
  public Loading(int time) throws InterruptedException {
    synchronized(load) {
      load.wait(time);
    }
  }
}