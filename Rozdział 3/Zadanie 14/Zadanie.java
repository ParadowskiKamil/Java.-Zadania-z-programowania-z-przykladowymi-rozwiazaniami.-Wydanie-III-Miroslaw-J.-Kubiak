class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program sumuje liczby nieparzyste od 1 do 100.");
    int liczba = 1;
    int sumaLiczbNieparzystych = 0;

    do
    {
      sumaLiczbNieparzystych += liczba;
      liczba += 2;
    } while (liczba <= 100);
    System.out.println("Suma liczb nieparzystych od 1 do 100 wynosi " + sumaLiczbNieparzystych + ".");
  }
}