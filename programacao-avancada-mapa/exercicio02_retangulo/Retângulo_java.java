public class Retângulo {
    double largura;
    double altura;

    public double calcularArea(){
        return largura * altura;
    }

    public static void main (String[] args){
        Retângulo ret = new Retângulo();
        ret.largura = 5;
        ret.altura = 3;
    System.out.println("Área do retângulo: " + ret.calcularArea());
    }
}
