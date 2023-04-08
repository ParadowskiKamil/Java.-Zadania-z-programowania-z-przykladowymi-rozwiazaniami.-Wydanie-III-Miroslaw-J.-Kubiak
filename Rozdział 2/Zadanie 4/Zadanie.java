import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program oblicza wartość x z równania liniowego ax+b = 0.\nPodaj a.");
    final Scanner skaner = new Scanner(System.in);
    final double a = skaner.nextDouble();
    if (a == 0.0)
    {
      System.out.println("Wprowadzona liczba dla współczynnika a uniemożliwia obliczenie wartości x - koniec programu!");
      System.exit(0);
    }
    System.out.println("Podaj b.");
    final double b = skaner.nextDouble();
    System.out.println("Podaj c.");
    final double c = skaner.nextDouble();
    
    final double x = (c - b) / a;
    System.out.printf("Dla a = %.2f, b = %.2f, c = %.2f wartość x = %.2f.\n", a, b, c, x);
  }
}