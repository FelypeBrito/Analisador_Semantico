@SuppressWarnings("all")
public class Programa2 {
  private static int argumento;

  private static int fatorial;

  public static void main(final String[] args) {
    Programa2.argumento = Integer.parseInt(System.console().readLine());
    Programa2.fatorial = Programa2.argumento;
    if ((Programa2.argumento == 0)) {
      Programa2.fatorial = 1;
    }
    while ((Programa2.argumento > 1)) {
      {
        Programa2.fatorial = (Programa2.fatorial * (Programa2.argumento - 1));
        Programa2.argumento--;
      }
    }
    System.out.println(("Fatorial = " + Integer.valueOf(Programa2.fatorial)));
  }
}
