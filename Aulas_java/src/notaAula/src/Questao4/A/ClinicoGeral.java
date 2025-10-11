package Questao4.A;

public class ClinicoGeral extends Medico{
    private boolean atendeEmCasa;

    public ClinicoGeral(String nome, String crm, boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(nome, crm, trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public void tratarPaciente(){
        System.out.println(getNome() + "(ClinicoGeral) está tratando o paciente");
    }
    public void receitar(){
        System.out.println(getNome() + "está receitando um medicamento.");
    }
    public boolean isAtendeEmCasa(){
        return atendeEmCasa;
    }

}
