import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program oblicza pierwiastki równania ax^2+bx+c = 0.\nPodaj a.");
    final Scanner skaner = new Scanner(System.in);
    final double a = skaner.nextDouble();
    System.out.println("Podaj b.");
    final double b = skaner.nextDouble();
    System.out.println("Podaj c.");
    final double c = skaner.nextDouble();
    System.out.printf("Dla a = %.2f, b = %.2f, c = %.2f\n", a, b, c);
    
    if (Math.pow(b, 2) - 4 * a * c > 0)
    {
      final double x1 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
      final double x2 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
      System.out.printf("trójmian ma dwa pierwiastki:\nx1 = %.2f, x2 = %.2f.\n", x1, x2);
    }
    else if (Math.pow(b, 2) - 4 * a * c == 0)
    {
      final double x1 = -b / (2 * a);
      System.out.printf("trójmian ma jeden pierwiastek podwójny x1 = %.2f.\n", x1);
    }
    else
      System.out.println("trójman ma zero pierwiastków.");
  }
}