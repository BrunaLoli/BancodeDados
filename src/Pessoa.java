class Pessoa{

    String nome;
    int idade;
    String endereco;
     
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "Pessoa:" +
                " Nome " + getNome() + 
                " Idade " + getIdade() +
                " Endereco " + getEndereco();
    }

}