import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int TOTAL_ARVORES = 100000;

        ArvoreSemFlyweight[] floresta = new ArvoreSemFlyweight[TOTAL_ARVORES];

        for (int i = 0; i < TOTAL_ARVORES; i++) {

            int especieId = random.nextInt(100);

            floresta[i] = new ArvoreSemFlyweight(

                    // mutáveis
                    10 + random.nextDouble() * 40,
                    0.5 + random.nextDouble() * 3,
                    random.nextInt(10000),
                    random.nextInt(10000),
                    random.nextInt(300),
                    random.nextDouble() * 45,
                    random.nextBoolean(),
                    random.nextInt(500),

                    // imutáveis
                    "Especie_" + especieId,
                    "TEXTURA_4K_" + especieId,
                    "SOMBRA_" + especieId,
                    "VERDE_" + especieId,
                    "CASCATIPO_" + especieId
            );
        }

        /* caculo memoria - mutáveis
            altura              8
            larguraTronco       8
            posX                4
            posY                4
            idade               4
            inclinacao          8
            possuiFrutos        1
            quantidadeGalhos    4

            41 bytes
        */

        int memoriaMutavel = 41;

        /* caculo memoria - imutáveis
            especie             40
            textura            200
            sombra             100
            corFolha            50
            tipoCasca           80

            470 bytes
        */

        int memoriaImutavel = 470;

        long memoriaPorArvore = memoriaMutavel + memoriaImutavel;

        long memoriaTotal = memoriaPorArvore * TOTAL_ARVORES;

        System.out.println("Memória total SEM Flyweight: " + memoriaTotal + " bytes");

        double mb = memoriaTotal / (1024.0 * 1024.0);

        System.out.printf("Aproximadamente %.2f MB\n", mb);
    }
}