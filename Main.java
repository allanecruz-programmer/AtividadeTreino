package AtividadeCachorro;

public class Main {
    public static void main(String[] args) {
        //inicializar e criar o construtor com os parameetros desejados
        Cachorro cachorro = new Cachorro("Bob",  3);

        System.out.println(cachorro.mostrarInformacoes());

        System.out.println("O cachorro faz o som: " + cachorro.latir());

    }
}
