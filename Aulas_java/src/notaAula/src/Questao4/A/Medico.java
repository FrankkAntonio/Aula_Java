package Questao4.A;

public class Medico {
    private String nome;
    private String crm;
    protected boolean trabalhaNoHospital;

    public Medico(String nome, String crm, boolean trabalhaNoHospital) {
        this.nome = nome;
        this.crm = crm;
        this.trabalhaNoHospital = trabalhaNoHospital;
    }
    public void tratarPaciente(){
        System.out.println("Tratando Paciente");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public boolean isTrabalhaNoHospital() {
        return trabalhaNoHospital;
    }
    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

}
