import java.util.HashMap;
import java.util.Map;

class FabricaAlgarismo {

    // pool de objetos reutilizados
    private static final Map<Integer, Algarismo> pool = new HashMap<>();

    public static Algarismo getAlgarismo(int numero) {

        // cria apenas se ainda não existir
        if (!pool.containsKey(numero)) {
            pool.put(numero, new Algarismo(numero));
        }

        return pool.get(numero);
    }

    // quantidade de objetos realmente criados
    public static int quantidadeObjetos() {
        return pool.size();
    }
}