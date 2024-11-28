package capitulo5;

import java.util.HashMap;

public class TabelasHash {

    public void exploraDicionario() {
        HashMap<String, Double> caderno = new HashMap<>();

        caderno.put("maçã", 0.67);
        caderno.put("leite", 1.49);
        caderno.put("abacate", 1.49);

        System.out.println(caderno);
        System.out.println("Preço leite: " + caderno.get("leite"));
    }

}
