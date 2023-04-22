class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program sumuje liczby całkowite od 1 do 100.");
    int liczba = 1;
    int sumaLiczbCalkowitych = 0;

    do
      sumaLiczbCalkowitych += liczba;
    while (++liczba <= 100);
    System.out.println("Suma liczb całkowitych od 1 do 100 wynosi " + sumaLiczbCalkowitych + ".");
  }
}