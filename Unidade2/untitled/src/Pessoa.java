public class Pessoa {
    protected int idade ;
    protected String nome;

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public String getNome() {
        return this.nome;
    }

    public String toString(){
        return "Nome:" + nome + "Idade:" + idade;
    }


}

