class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program sumuje liczby parzyste od 1 do 100.");
    int liczba = 2;
    int sumaLiczbParzystych = 0;

    while (liczba <= 100)
    {
      sumaLiczbParzystych += liczba;
      liczba += 2;
    }
    System.out.println("Suma liczb parzystych od 1 do 100 wynosi " + sumaLiczbParzystych + ".");
  }
}