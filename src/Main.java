//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Carro carro = new Carro();
      Moto moto = new Moto();
      carro.acelerar();
      carro.frear();
      System.out.println("-----------------------------------------");
      moto.acelerar();
      moto.frear();
      moto.darGrau();


    }
}