
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        Professor p = new Professor();
        Disciplina d = new Disciplina();

        System.out.println("Digite o nome da disciplina: ");
        d.setNome(sc.next());
        d.cadastrarAluno(a);
        d.ministrarDisplina(p);

        System.out.println("Digite o nome do Professor: ");
        p.setNome(sc.next());

        System.out.println("Digite a especialiade do professor: ");
        p.setEspecialidade(sc.next());

        System.out.println("Digite o nome do aluno: ");
        a.setNome(sc.next());

       // System.out.println("Digite a matricula do aluno: ");
       // a.setMatricula(sc.nextInt());

        System.out.println("Imformações do professor:");
        System.out.println(p);

        System.out.println("Imformações do aluno:");
        System.out.println(a);

        System.out.println("\nInformações da disciplina: ");
        System.out.println(d);

        sc.close();




    }
}