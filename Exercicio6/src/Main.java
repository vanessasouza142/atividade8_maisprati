/* Polimorfismo
6. Polimorfismo com Classes Abstratas
Objetivo: Crie uma classe abstrata Animal com um método abstrato emitirSom(). Crie subclasses Cachorro, Gato e Vaca, cada uma
implementando emitirSom() de maneira específica. Crie uma lista de Animal no método principal e adicione instâncias de cada subclasse. Itere
sobre a lista e invoque o método emitirSom() para cada animal, demonstrando o polimorfismo.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Animal> animais = new ArrayList<>();

    animais.add(new Cachorro());
    animais.add(new Gato());
    animais.add(new Vaca());

    for (Animal animal : animais) {
      animal.emitirSom();
    }
  }
}