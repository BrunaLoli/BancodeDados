import java.util.HashSet;
import java.util.Set;

class BancoDados {

    private Set<Pessoa> pessoasCadastro = new HashSet<>();
   

    public Set<Pessoa> getPessoasCadastro() {
        return pessoasCadastro;
    }

    public void setPessoasCadastro(Set<Pessoa> pessoasCadastro) {
        this.pessoasCadastro = pessoasCadastro;
    }
    public String toString() {
        return "PessoasCadastro = " + pessoasCadastro + "]";
    }
}