public class Pessoa {
    private int idade ;
    private double peso ;
    private double altura ;
    private double IMC;

    public void niver () {
        idade++;
    }
    public void setPeso (double peso){
       this.peso = peso;
        }

    public double getPeso() {
    return peso;

        }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setIMC(double IMC){
        this.IMC = IMC;

    }

    public double getIMC(){
        return IMC;
    }

    }

