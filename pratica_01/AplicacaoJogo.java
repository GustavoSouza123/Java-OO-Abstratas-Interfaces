package pratica_01;

public class AplicacaoJogo {
    public static void main(String[] args) {
        Diamante diamante1 = new Diamante();
        diamante1.pegar();

        Cogumelo cogumelo1 = new Cogumelo();
        cogumelo1.pegar();

        Moeda moeda1 = new Moeda();
        moeda1.pegar();

        // outro modo de instanciar
        Item fruta1 = new Fruta();
        fruta1.pegar();
    }
}