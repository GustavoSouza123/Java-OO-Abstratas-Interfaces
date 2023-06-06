package pratica_03;

public class AplicacaoAuto {
    public static void main(String[] args) {
        Porsche porsche1 = new Porsche();
        Jaguar jaguar1 = new Jaguar();

        porsche1.derrapar();
        jaguar1.derrapar();

        System.out.println();

        // acesso ao método static
        int velMax = NovoAutomovel.getVelocidadeMaxima();
        System.out.println("A velocidade máxima é: " + velMax + " km/h");
    }
}