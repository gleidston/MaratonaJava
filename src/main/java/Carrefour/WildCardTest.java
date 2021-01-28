package Carrefour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


abstract class Animal {

  public abstract void consultar();
}

class Cachorro extends Animal{

  @Override
  public void consultar() {
    System.out.println("consultando cachorro  ");
  }

   }

class Gato extends Animal {


  @Override
  public void consultar() {
    System.out.println("consultando gato  ");
  }
}
public static class WindCardTeste {
  public static void main(String[] args) {
    Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
    Gato[] gatos = {new Gato(), new Gato()};
//        consultarAnimais(cachorros);
//        consultarAnimais(gatos);
    List<Cachorro> cachorroList = new ArrayList<>();
    cachorroList.add(new Cachorro());
    List<Gato> gatoList = new ArrayList<>();
    gatoList.add(new Gato());

    consultarAnimaisList(cachorroList);
    consultarAnimaisList(gatoList);
    ordernarLista((List<? extends Comparable>) cachorroList);
  }

  public static void consultarAnimais(Animal[] animals) {
    for (Animal animal : animals) {
      animal.consulta();
    }
//        animals[1] = new Gato();
  }

  //type erasure | ?
  public static void consultarAnimaisList(List<? extends Animal> animals) {
    for (Animal animal : animals) {
      animal.consulta();
    }
  }

  public static void consultarCachorrosList(List<? super Cachorro> cachorroList) {
    Cachorro c1 = new Cachorro();
    Animal c2 = new Cachorro();
    Object o = new Cachorro();
    cachorroList.add(new Cachorro());
  }

  public static void ordernarLista(List<? extends Comparable> lista) {
    Collections.sort(lista);


  }
}



