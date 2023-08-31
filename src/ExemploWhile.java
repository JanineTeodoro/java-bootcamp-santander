import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
  public static void main(String[] args) {
    double mesada = 50.0;

    while(mesada > 0){
      Double valorDoce = valorAleatorio();
      if(valorDoce > mesada)
        valorDoce = mesada;

        System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
        mesada = mesada - valorDoce;
    }
    System.out.println("Mesada: " + mesada);
    System.out.println("Joãozinho gastou toda a sua mesada em doces");
  }

  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 15);
  }

}

// Doce do valor: 14.503813433990706 adicionado no carrinho
// Doce do valor: 8.786573494602273 adicionado no carrinho
// Doce do valor: 2.423782958578172 adicionado no carrinho
// Doce do valor: 6.073635867167767 adicionado no carrinho
// Doce do valor: 2.8169214413094235 adicionado no carrinho
// Doce do valor: 9.283910562374874 adicionado no carrinho
// Doce do valor: 6.111362241976783 adicionado no carrinho
// Mesada: 0.0
// Joãozinho gastou toda a sua mesada em doces