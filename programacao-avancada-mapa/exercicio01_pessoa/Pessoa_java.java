public class Pessoa {
    String nome;
    int idade;
    String cidade;

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Cristian";
        pessoa.idade = 27;
        pessoa.cidade = "Toledo";

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Cidade: " + pessoa.cidade);
    }
}
