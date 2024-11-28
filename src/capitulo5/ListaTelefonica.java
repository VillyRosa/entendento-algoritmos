package capitulo5;

import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, String> listaTelefonica = new HashMap<>();

    public void adicionaContato(String nome, String telefone) {
        listaTelefonica.put(nome, telefone);
    }

    public String buscaContato(String nome) {
        return listaTelefonica.get(nome);
    }

}
