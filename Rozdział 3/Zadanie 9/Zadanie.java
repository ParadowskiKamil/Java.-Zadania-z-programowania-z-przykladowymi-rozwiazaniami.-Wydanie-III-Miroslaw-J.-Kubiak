class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program sumuje liczby całkowite od 1 do 100.");
    int liczba = 0;
    int sumaLiczbCalkowitych = 0;

    while (++liczba <= 100)
      sumaLiczbCalkowitych += liczba;
    System.out.println("Suma liczb całkowitych od 1 do 100 wynosi " + sumaLiczbCalkowitych + ".");
  }
}