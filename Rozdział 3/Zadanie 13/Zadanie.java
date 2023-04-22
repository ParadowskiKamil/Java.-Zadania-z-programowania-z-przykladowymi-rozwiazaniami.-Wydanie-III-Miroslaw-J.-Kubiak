class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program sumuje liczby nieparzyste od 1 do 100.");
    int sumaLiczbNieparzystych = 0;

    for (int i = 1; i <= 100; i += 2)
      sumaLiczbNieparzystych += i;
    System.out.println("Suma liczb nieparzystych od 1 do 100 wynosi " + sumaLiczbNieparzystych + ".");
  }
}