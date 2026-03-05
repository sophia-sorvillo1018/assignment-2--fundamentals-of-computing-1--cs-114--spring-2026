import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String randomString = input.nextLine();

    int countA = 0;
    int countE = 0;
    int countI = 0;
    int countO = 0;
    int countU = 0;
    int nonVowelCount = 0;

    for (int i = 0; i < randomString.length(); i++ ){
      char character = randomString.charAt(i);

      switch (character){
        case 'a':
          countA++;
          break;

        case 'e':
          countE++;
          break;

        case 'i':
          countI++;
          break;

        case 'o':
          countO++;
          break;

        case 'u':
          countU++;
          break;

        default:
          nonVowelCount++;

      }
    }

    System.out.println("Number of lowercase 'a' vowels: " + countA);
    System.out.println("Number of lowercase 'e' vowels: " + countE);
    System.out.println("Number of lowercase 'i' vowels: " + countI);
    System.out.println("Number of lowercase 'o' vowels: " + countO);
    System.out.println("Number of lowercase 'u' vowels: " + countU);
    System.out.println("Number of lowercase nonvowels: " + nonVowelCount);

    input.close();
  }
}
