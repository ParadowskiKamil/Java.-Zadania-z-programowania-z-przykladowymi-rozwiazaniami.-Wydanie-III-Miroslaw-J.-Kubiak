import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program mierzy długość łańcucha imię i nazwisko.\nPodaj imię.");
    final Scanner skaner = new Scanner(System.in);
    final String imie = skaner.nextLine();
    System.out.println("Podaj nazwisko.");
    final String nazwisko = skaner.nextLine();

    System.out.println("Imię " + imie + " zawiera " + imie.length() + " liter(y).");
    System.out.println("Nazwisko " + nazwisko + " zawiera " + nazwisko.length() + " liter(y).");
  }
}