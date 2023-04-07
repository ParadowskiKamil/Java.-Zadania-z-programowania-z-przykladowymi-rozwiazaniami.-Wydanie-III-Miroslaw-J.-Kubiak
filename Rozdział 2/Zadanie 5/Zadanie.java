import java.util.Random;
import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program losuje liczbę z przedziału od 0 do 9. Zgadnij tę liczbę.");
    final Scanner skaner = new Scanner(System.in);
    final int liczba = skaner.nextInt();
    final Random generatorLiczbLosowych = new Random();
    final int losowaLiczba = generatorLiczbLosowych.nextInt(10);
    System.out.println(liczba == losowaLiczba ? "Brawo!" : "Bardzo mi przykro, ale wylosowana liczba to " + losowaLiczba + ".");
  }
}