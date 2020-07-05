package top.gaoch.demo;

public class Parcel10 {
  public Destination destination(final String dest, final float price) {
    return new Destination() {
      private int cost;
      {
        cost = Math.round(price);
        if (cost > 100) {
          System.out.println("Over Budget!");
        }
      }
      private String labe = dest;
      @Override
      public String readLabe() {
        return labe;
      }
    };
  }

  public static void main(String[] args) {
    Parcel10 p = new Parcel10();
    Destination d = p.destination("Tasmania", 101.333F);
  }
}
