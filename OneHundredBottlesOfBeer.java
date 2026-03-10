import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number of verses to print: ");
    int numOfVerses = input.nextInt();

    int bottlesOfBeer = 100;

    for (int i = 0; i < numOfVerses; i++ ){
      System.out.println(bottlesOfBeer + " bottles of beer on the wall");
      System.out.println(bottlesOfBeer + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall");
      --bottlesOfBeer;
      System.out.println(bottlesOfBeer + " bottles of beer on the wall");
      System.out.println();

    }

    input.close();
  }
}
