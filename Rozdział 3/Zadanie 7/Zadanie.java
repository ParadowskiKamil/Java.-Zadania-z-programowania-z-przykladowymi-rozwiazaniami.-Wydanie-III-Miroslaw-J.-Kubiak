class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program sumuje liczby całkowite od 1 do 100.");
    int sumaLiczbCalkowitych = 0;

    for (int i = 1; i <= 100; i++)
      sumaLiczbCalkowitych += i;
    System.out.println("Suma liczb całkowitych od 1 do 100 wynosi " + sumaLiczbCalkowitych + ".");
  }
}