package Carrefour;

import java.util.*;

public class Heranca {
  public static  void  main (String [] args){

    Queue <String> FilaDeBanco = new LinkedList<>();

    FilaDeBanco.add("luana ");
    FilaDeBanco.add("patricia  ");
    FilaDeBanco.add("roberto  ");
    FilaDeBanco.add("pamela  ");
    FilaDeBanco.add("anderson ");
    System.out.println(FilaDeBanco);
    String ClienteAserAtendido = FilaDeBanco.poll();
    System.out.println(ClienteAserAtendido);
    System.out.println(FilaDeBanco);
  }
}
