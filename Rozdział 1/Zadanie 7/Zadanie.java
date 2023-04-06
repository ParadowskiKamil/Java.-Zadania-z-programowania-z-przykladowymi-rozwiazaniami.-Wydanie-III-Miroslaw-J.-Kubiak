import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program oblicza sumę, różnicę, iloczyn i iloraz\ndla dwóch liczb x i y wprowadzonych z klawiatury.");
    System.out.println("Podaj x.");
    final Scanner skaner = new Scanner(System.in);
    final float x = skaner.nextFloat();
    System.out.println("Podaj y.");
    final float y = skaner.nextFloat();
    final double suma = x + y;
    final double roznica = x - y;
    final double iloczyn = x * y;
    final double iloraz = x / y;
    System.out.printf("Dla liczb: x = %.2f i y = %.2f\n", x, y);
    System.out.printf("Suma = %.2f,\nRóżnica = %.2f,\nIloczyn = %.2f,\nIloraz = %.2f.\n", suma, roznica, iloczyn, iloraz);
  }
}