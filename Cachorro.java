package AtividadeCachorro;

public class Cachorro {

    //ATRIBUTOS DA FÔRMA CACHORRO
    String nome;
    int idade;

    //CRIANDO O CONTRUTOR, que vai precisar passar como parametro o nome e a idade
    public Cachorro(String nome, int idade){
        //THIS REPRESENTA O ATRIBUTO DO OBJETO QUE SAO INICIALIZADOS PELO THIS
        this.nome = nome;
        this.idade = idade;
    }

    // criando o metodo latir, retornara uma String e nao sera void
    public String latir(){
        return  "Au au";
    }

    //criando o metodo mostrar informacoes que vai retornar informacao, entoa nao sera void
    public String mostrarInformacoes() {
        return "Nome: " + nome + ", idade: " + idade;
    }
}
