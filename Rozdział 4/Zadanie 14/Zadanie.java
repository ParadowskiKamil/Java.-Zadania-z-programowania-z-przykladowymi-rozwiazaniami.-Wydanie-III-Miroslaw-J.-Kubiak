import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program składa dwa łańcuchy.\nPodaj pierwszy łańcuch.");
    final Scanner skaner = new Scanner(System.in);
    final String pierwszyLancuch = skaner.nextLine();
    System.out.println("Podaj drugi łańcuch.");
    final String drugiLancuch = skaner.nextLine();

    System.out.println(pierwszyLancuch + " + " + drugiLancuch + " = " + pierwszyLancuch + drugiLancuch);
    System.out.println(drugiLancuch + " + " + pierwszyLancuch + " = " + drugiLancuch + pierwszyLancuch);
    System.out.println(pierwszyLancuch.equals(drugiLancuch) ? "Składanie dwóch równych łańcuchów jest przemienne." : 
                                                              "Składanie dwóch różnych łańcuchów nie jest przemienne.");
  }
}