import capitulo5.TabelasHash;
import capitulo5.ListaTelefonica;
import capitulo5.VerificaEleitor;

public class Main {
    public static void main(String[] args) {
        TabelasHash th = new TabelasHash();
        th.exploraDicionario();

        ListaTelefonica lt = new ListaTelefonica();
        lt.adicionaContato("João", "1234-5678");
        lt.adicionaContato("Maria", "8765-4321");
        System.out.println(lt.buscaContato("João"));

        VerificaEleitor ve = new VerificaEleitor();
        ve.verificaEleitor("João");
        ve.verificaEleitor("Maria");
        ve.verificaEleitor("João");
    }
}