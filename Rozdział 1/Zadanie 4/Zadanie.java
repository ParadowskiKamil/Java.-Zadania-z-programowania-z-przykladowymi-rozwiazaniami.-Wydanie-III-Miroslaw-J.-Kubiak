import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program oblicza objętość kuli.\nPodaj promień r.");
    final Scanner skaner = new Scanner(System.in);
    final double r = skaner.nextDouble();
    
    final double objetosc = 4 * Math.PI * Math.pow(r, 3) / 3;
    System.out.printf("Objętość kuli o promieniu r = %.2f wynosi %.2f.\n", r, objetosc);
  }
}