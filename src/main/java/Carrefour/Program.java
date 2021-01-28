package Carrefour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
    public static  void  main (String [] args){

      List<String> nomes =  new ArrayList<>();






      nomes.add("carlos ");
      nomes.add("pedro ");
      nomes.add("joao  ");
      nomes.add("maria  ");
      nomes.add("joana  ");
      nomes.add("leona  ");
      nomes.add("mai  ");
      System.out.println(nomes);
      nomes.set(2,"larissa");
      System.out.println(nomes);
      Collections.sort(nomes);
      System.out.println(nomes);
      nomes.remove(4);
      System.out.println(nomes);
     String nome= nomes.get(0);
      System.out.println(nome);



    }



}
