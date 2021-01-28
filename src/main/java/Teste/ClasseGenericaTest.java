package Teste;

import Carrefour.ZZAGenerics.classes.Barco;
import Carrefour.ZZAGenerics.classes.Carro;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
  public static void main(String[] args) {


    // parte barcos

    BarcoAlugavel barcoAlugavel = new BarcoAlugavel();
    Barco  barcoAlugado = barcoAlugavel.getBarcoDisponivel();
    System.out.println("esta ultilizando o Barco por um mes ");
    //BarcoAlugavel.devolverBarco(barcoAlugavel);



    CarroAlugado carroAlugado = new CarroAlugado();
    Carro carroAlugavel = carroAlugado.getCarroDisponivel();
    System.out.println("esta ultilizando o carro por um mes ");
    carroAlugavel.devolverCarro(carroAlugavel);
  }

  static class CarroAlugado {
    private List<Carro> carrosDisponiveis = new ArrayList<>();

    {
      carrosDisponiveis.add(new Carro("gol"));
      carrosDisponiveis.add(new Carro("palio"));
      carrosDisponiveis.add(new Carro("jetta"));
      carrosDisponiveis.add(new Carro("colbalt"));
    }

    public Carro getCarroDisponivel() {
      Carro c = carrosDisponiveis.remove(0);
      System.out.println("alugando o carro " + c);
      System.out.println("Carros disponiveis " + carrosDisponiveis);
      return c;
    }

    public void devolverCarro(Carro c) {

      carrosDisponiveis.add(c);
      System.out.println("Devolvendo carro  " + c);
      System.out.println("Carros disponiveis " + carrosDisponiveis);

    }
  }

  //  exercicio pratico adicional pega codigo acima e replicar com a classe barco
  static class BarcoAlugavel {
    private List<Barco> barcosDisponiveis = new ArrayList<>();

    {
      barcosDisponiveis.add(new Barco("yate"));
      barcosDisponiveis.add(new Barco("canoa"));
      barcosDisponiveis.add(new Barco("sky"));
      barcosDisponiveis.add(new Barco("cruzeiro"));
    }
    public Barco getBarcoDisponivel() {
      Barco d = barcosDisponiveis.remove(0);
      System.out.println("alugando o Barco " + d);
      System.out.println("Barco disponiveis " + barcosDisponiveis);
      return d;
    }
    public void devolverBarco(Barco d) {

      barcosDisponiveis.add(d);
      System.out.println("Devolvendo Barco  " + d);
      System.out.println("Barcos  disponiveis " + barcosDisponiveis);

    }

  }
}
