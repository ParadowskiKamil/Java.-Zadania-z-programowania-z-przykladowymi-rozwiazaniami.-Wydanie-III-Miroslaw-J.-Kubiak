import java.util.InputMismatchException;
import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program oblicza pole prostokąta.\nPodaj bok a.");
    final Scanner skaner = new Scanner(System.in);
    try
    {
      final double a = skaner.nextDouble();
      System.out.println("Podaj bok b.");
      final double b = skaner.nextDouble();
      
      final double pole = a * b;
      System.out.println("Pole prostokąta o boku a = " + a + " i boku b = " + b + " wynosi " + pole + ".");
    }
    catch (final InputMismatchException wyjatek)
    {
      System.out.println("Nie wczytano liczby. Koniec programu.");
    }
  }
}