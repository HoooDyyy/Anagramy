import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj 1 wyraz: ");
    String a = scanner.nextLine();
    System.out.println("Podaj 2 wyraz: ");
    String b = scanner.nextLine();
    
    a = a.toLowerCase();
    b = b.toLowerCase();

    // sprawdza dlugosc
    if(a.length() == b.length()) {

      // convertuje stringa na znaki
      char[] charArray1 = a.toCharArray();
      char[] charArray2 = b.toCharArray();

      // sortuje znaki
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(a + " i " + b + " sa anagrami.");
      }
      else {
        System.out.println(a + " i " + b + " nie sa anagrami.");
      }
    }
    else {
      System.out.println(a + " i " + b + " nie sa  anagrami.");
    }
  }
}