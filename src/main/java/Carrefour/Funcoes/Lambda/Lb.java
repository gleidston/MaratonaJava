package Carrefour.Funcoes.Lambda;

public class Lb {
  public static void main(String[] args) {
 // logica sem lambda
   /* Funcao colocarPrefixoSenhorNaString = new Funcao() {
      @Override
      public String gerar(String valor) {
        return "Sr ."+ valor;
      }
    };

    */
    // logica coom a lambda
    Funcao colocarPrefixoSenhorNaString = valor -> "Sr."+valor;

   System.out.println(colocarPrefixoSenhorNaString.gerar("joao"));
  }

}

