public class App {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Bruna");
        pessoa1.setEndereco("Blumenau, SC");
        pessoa1.setIdade(23);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Nicolas");
        pessoa2.setEndereco("Indaial,SC");
        pessoa2.setIdade(24);

        BancoDados bancodados1 = new BancoDados();
        bancodados1.getPessoasCadastro() .add(pessoa1);
        bancodados1.getPessoasCadastro() . add(pessoa2);
        System.out.println(bancodados1);



    }
}
