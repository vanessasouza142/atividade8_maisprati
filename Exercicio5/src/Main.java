/* Polimorfismo
5. Polimorfismo com Interfaces
Objetivo: Crie uma interface IMeioTransporte com métodos acelerar() e frear(). Implemente essa interface em classes Carro, Bicicleta e Trem.
No método principal, crie um array de IMeioTransporte e percorra-o chamando acelerar() e frear() para cada objeto. Utilize polimorfismo
para que cada tipo de transporte implemente acelerar() e frear() de maneira diferente.
 */

public class Main {
  public static void main(String[] args) {
    // Criando um array de IMeioTransporte
    IMeioTransporte[] transportes = new IMeioTransporte[3];

    // Adicionando diferentes tipos de transporte ao array
    transportes[0] = new Carro();
    transportes[1] = new Bicicleta();
    transportes[2] = new Trem();

    // Percorrendo o array e chamando os métodos acelerar e frear para cada meio de transporte
    for (IMeioTransporte transporte : transportes) {
      transporte.acelerar();
      transporte.frear();
      System.out.println();
    }
  }
}