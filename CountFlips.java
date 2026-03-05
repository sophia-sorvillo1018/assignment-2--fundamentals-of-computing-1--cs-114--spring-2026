public class CountFlips {
  public static void main(String[] args) {
    int headsCount = 0;
    int tailsCount = 0;

    Coin coin = new Coin();

    for (int i = 0; i < 100; i++ ){
      coin.flip();
      if (coin.isHeads()) {
        headsCount++;
      } else {
        tailsCount++;
      }
    }

    System.out.println("Number of heads: " + headsCount);
    System.out.println("Number of tails: " + tailsCount);
  }
}
