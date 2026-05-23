import java.util.HashMap;
import java.util.Map;

class FabricaEspecies {

    private static final Map<String, EspecieArvore> especies = new HashMap<>();

    public static EspecieArvore getEspecie(
            String especie,
            String textura,
            String sombra,
            String corFolha,
            String tipoCasca
    ) {

        if (!especies.containsKey(especie)) {

            especies.put(
                    especie,
                    new EspecieArvore(
                            especie,
                            textura,
                            sombra,
                            corFolha,
                            tipoCasca
                    )
            );
        }

        return especies.get(especie);
    }

    public static int totalEspecies() {
        return especies.size();
    }
}