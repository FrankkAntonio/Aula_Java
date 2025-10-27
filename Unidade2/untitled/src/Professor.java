 public class Professor extends Pessoa {
    private String especialidade;

     public String getEspecialidade() {
         return especialidade;
     }
     public void setEspecialidade(String especialidade) {
         this.especialidade = especialidade;
     }
     public String toString(){
         return super.toString() + ",Especialidade=" + especialidade;
     }




 }
