import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program oblicza pole prostokąta.\nPodaj bok a.");
    final Scanner skaner = new Scanner(System.in);
    final double a = skaner.nextDouble();
    System.out.println("Podaj bok b.");
    final double b = skaner.nextDouble();
    final double pole = a * b;
    System.out.println("Pole prostokąta o boku a = " + a + " i boku b = " + b + " wynosi " + pole + ".");
  }
}