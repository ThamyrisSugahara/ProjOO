import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        // contador de utilização dos objetos
        Map<Integer, Integer> uso = new HashMap<>();

        for (int i = 0; i <= 9; i++) {
            uso.put(i, 0);
        }

        System.out.println("Numeros gerados:\n");

        // gera 10 números cada um com 10 algarismos
        for (int i = 0; i < 10; i++) {

            StringBuilder numeroGrande = new StringBuilder();

            for (int j = 0; j < 10; j++) {

                int valor = random.nextInt(10);

                // reutiliza objeto Flyweight
                Algarismo alg = FabricaAlgarismo.getAlgarismo(valor);

                // adiciona ao número
                numeroGrande.append(alg.getNumero());

                // contabiliza uso do objeto
                uso.put(valor, uso.get(valor) + 1);
            }

            System.out.println(numeroGrande);
        }

        // amostragem dos objetos
        System.out.println("\nQuantidade de vezes que cada objeto foi utilizado:\n");

        for (int i = 0; i <= 9; i++) {
            System.out.println(
                    "Objeto Algarismo " + i +
                            " utilizado " + uso.get(i) + " vezes."
            );
        }

        System.out.println(
                "\nQuantidade de objetos realmente criados: "
                        + FabricaAlgarismo.quantidadeObjetos()
        );
    }
}