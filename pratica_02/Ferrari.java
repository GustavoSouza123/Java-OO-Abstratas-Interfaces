package pratica_02;

public class Ferrari implements Carro {
    @Override
    public void virarEsquerda() {
        System.out.println("Ferrari virou à esquerda");
    }

    @Override
    public void virarDireita() {
        System.out.println("Ferrari virou à direita");
    }

    @Override
    public void acelerar() {
        System.out.println("Ferrari acelerou");
    }

    @Override
    public void abrirPorta() {
        System.out.println("Ferrari abriu a porta");
    }
}