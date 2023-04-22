class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program sumuje liczby parzyste od 1 do 100.");
    int sumaLiczbParzystych = 0;

    for (int i = 2; i <= 100; i += 2)
      sumaLiczbParzystych += i;
    System.out.println("Suma liczb parzystych od 1 do 100 wynosi " + sumaLiczbParzystych + ".");
  }
}