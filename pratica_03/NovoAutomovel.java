package pratica_03;

public interface NovoAutomovel {
    void acelerar();
    void frear();

    // implementar um novo metodo com default
    default void derrapar() {
        acelerar();
        acelerar();
        frear();
    }

    // implementar metodo static
    static int getVelocidadeMaxima() {
        return 300;
    }
}