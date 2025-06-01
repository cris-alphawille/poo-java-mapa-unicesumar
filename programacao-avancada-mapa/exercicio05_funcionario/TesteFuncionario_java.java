class Funcionario {
    String nome;
    double salario;

    public double calcularBonus() {
        return salario * 0.10;
    }
}

class Gerente extends Funcionario {
    public double calcularBonus() {
        return salario * 0.20;
    }
}

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.nome = "João";
        f.salario = 2000;

        Gerente g = new Gerente();
        g.nome = "Maria";
        g.salario = 5000;
        System.out.println(f.nome + " - Bônus: R$ " + f.calcularBonus());
        System.out.println(g.nome + " - Bônus: R$ " + g.calcularBonus());
    }
}

