package AutoLoader;

class Load {
  public Load(int time) {
    try {
      Loading loading = new Loading(time);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
 
}