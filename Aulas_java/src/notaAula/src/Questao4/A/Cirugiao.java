package Questao4.A;

public class Cirugiao extends Medico{
    public Cirugiao(String nome, String crm, boolean trablhaNohospital){
        super(nome,crm,trablhaNohospital);
    }
    public void tratarPaciente(){
        System.out.println(getNome() + "(Cirugião) está preparando o Paciente para a cirugia.");

    }
    public void fazerIncisao(){
        System.out.println(getNome() + "está realizando uma incisão cirugica.");
    }



}
