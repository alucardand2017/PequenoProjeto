package dominio;

public class Pessoa {
    private String nome;
    private String idade;
    private Profissao profissao;
    private Endereco endereco;

    public Pessoa(String nome, String idade, Profissao profissao, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return  "\nNOME: "+getNome() +
                "\nIDADE: "+getIdade()+
                "\nPROFISSAO: "+getProfissao()+
                "\n"+getEndereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
