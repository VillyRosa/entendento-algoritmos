package capitulo5;

import java.util.HashMap;

public class VerificaEleitor {

    private HashMap<String, Boolean> eleitores = new HashMap<>();

    public void verificaEleitor(String nome) {
        if (eleitores.get(nome) == null) {
            eleitores.put(nome, true);
            System.out.println("Deixe votar!");
        } else {
            System.out.println("Mande embora!");
        }
    }

}
