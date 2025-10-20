public class Pessoa {
    protected int idade ;
    protected String nome;

    public void aniversario(){
        idade++;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }


}

