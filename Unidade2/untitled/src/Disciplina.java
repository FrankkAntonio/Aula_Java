public class Disciplina {
    private String nome;
    private Aluno aluno;
    private Professor professor;


    public String getNome() {
        return nome;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void cadastrarAluno (Aluno aluno) {
        this.aluno = aluno;
    }
    public void ministrarDisplina(Professor professor) {
        this.professor = professor;
    }
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", professor=" + professor + '}';
    }


}
