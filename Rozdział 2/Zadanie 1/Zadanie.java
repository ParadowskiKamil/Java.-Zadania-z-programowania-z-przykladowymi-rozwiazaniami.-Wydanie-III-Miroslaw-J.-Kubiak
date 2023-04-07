import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Podaj bok a.");
    final Scanner skaner = new Scanner(System.in);
    final int a = skaner.nextInt();
    System.out.println("Podaj bok b.");
    final int b = skaner.nextInt();
    System.out.println("Podaj bok c.");
    final int c = skaner.nextInt();
    final String odpowiedz = a * a + b * b == c * c ? "tworzą trójkąt prostokątny." : "nie tworzą trójkąta prostokątnego.";
    System.out.println("Boki:\na = " + a + "\nb = " + b + "\nc = " + c + "\n" + odpowiedz);
  }
}