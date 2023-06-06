package pratica_02;

public class AplicacaoAutomovel {
    public static void main(String[] args) {
        Ferrari ferrari1 = new Ferrari();
        Rota rota1 = new Rota();
        rota1.ir(ferrari1);
        ferrari1.abrirPorta();
    }
}