package funcionarios;
import java.util.Scanner;

public class CriacaoDeFuncionarios {
    private final FuncionarioAssalariado[] assalariados;
    private final FuncionarioComissionado[] comissionados;
    private final FuncionarioComissionadoBaseSalario[] comissionadoBaseSalarios;
    private final FuncionarioHorista[] horistas;

//    private static final int quantFunPadrao = 10;

//    public CriacaoDeFuncionarios(){
//        CriacaoDeFuncionarios(quantFunPadrao);
//    }

    public CriacaoDeFuncionarios(int quantFun){
        this.assalariados = new FuncionarioAssalariado[quantFun];
        this.comissionados = new FuncionarioComissionado[quantFun];
        this.comissionadoBaseSalarios = new FuncionarioComissionadoBaseSalario[quantFun];
        this.horistas = new FuncionarioHorista[quantFun];
    }
    public void criandoFuncionarios(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja criar um funcionário assalariado? [S/N]");
        String resp = scanner.next();
        scanner.nextLine();
        if (resp.equalsIgnoreCase("s")) {
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o cpf: ");
            String cpf = scanner.nextLine();
            System.out.println("Digite o salário: ");
            double salario = scanner.nextDouble();
            FuncionarioAssalariado fa1 = new FuncionarioAssalariado(nome, cpf, salario);
            for (int i=0; i<assalariados.length; i++){
                if (assalariados[i] == null) assalariados[i] = fa1;
                break;
            }
            System.out.println(fa1);
        }
        System.out.println("Sem problema!");
        System.out.println("Deseja criar um funcionário comissionado? [S/N]");
        String resp2 = scanner.next();
        scanner.nextLine();
        if (resp2.equalsIgnoreCase("S")){
            System.out.println("Digite o nome: ");
            String nome2 = scanner.nextLine();
            System.out.println("Digite o cpf: ");
            String cpf2 = scanner.nextLine();
            System.out.println("Digite a comissão: ");
            double comissao = scanner.nextDouble();
            System.out.println("Digite as vendas brutas: ");
            double vendasBrutas = scanner.nextDouble();
            FuncionarioComissionado fc1 = new FuncionarioComissionado(nome2, cpf2, comissao, vendasBrutas);
            for (int i=0; i<comissionados.length; i++){
                if (comissionados[i] == null) comissionados[i] = fc1;
                break;
            }
            System.out.println(fc1);
        }
        System.out.println("Sem problema!");
        System.out.println("Deseja criar um funcionário comissionado com base salarial? [S/N]");
        resp = scanner.next();
        scanner.nextLine();
        if (resp.equalsIgnoreCase("S")){
            System.out.println("Digite o nome: ");
            String nome2 = scanner.nextLine();
            System.out.println("Digite o cpf: ");
            String cpf2 = scanner.nextLine();
            System.out.println("Digite a comissão: ");
            double comissao = scanner.nextDouble();
            System.out.println("Digite as vendas brutas: ");
            double vendasBrutas = scanner.nextDouble();
            System.out.println("Digite o salário base: ");
            double salario = scanner.nextDouble();
            FuncionarioComissionadoBaseSalario fcbs1 = new FuncionarioComissionadoBaseSalario(nome2, cpf2, comissao, vendasBrutas, salario);
            for (int i=0; i<comissionadoBaseSalarios.length; i++){
                if (comissionadoBaseSalarios[i] == null) comissionadoBaseSalarios[i] = fcbs1;
                break;
            }
            System.out.println(fcbs1);
        }
        System.out.println("Sem problema!");
        System.out.println("Deseja criar um funcionário horista? [S/N]");
        resp = scanner.next();
        scanner.nextLine();
        if (resp.equalsIgnoreCase("s")) {
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o cpf: ");
            String cpf = scanner.nextLine();
            System.out.println("Digite a quantidade de horas trabalhadas: ");
            double horasTrabalhadas = scanner.nextDouble();
            System.out.println("Digite o salário por hora: ");
            double salarioPorHora = scanner.nextDouble();
            FuncionarioHorista fh1 = new FuncionarioHorista(nome, cpf, horasTrabalhadas, salarioPorHora);
            for (int i=0; i<horistas.length; i++){
                if (horistas[i] == null) horistas[i] = fh1;
                break;
            }
            System.out.println(fh1);
        }
        scanner.close();
    }

    public void relacaoFuncionarios(){
        System.out.println("Funcionários assalariados: ");
        for (int i=0; i<assalariados.length; i++)
            if (assalariados[i] != null) System.out.println(" - "+assalariados[i].toString());
        System.out.println("Funcionários comissionados: ");
        for (int i=0; i<comissionados.length; i++)
            if (comissionados[i] != null) System.out.println(" - "+comissionados[i].toString());
        System.out.println("Funcionários comissionados com base salarial: ");
        for (int i=0; i<comissionadoBaseSalarios.length; i++)
            if (comissionadoBaseSalarios[i] != null) System.out.println(" - "+comissionadoBaseSalarios[i].toString());
        System.out.println("Funcionários horistas: ");
        for (int i=0; i<horistas.length; i++)
            if (horistas[i] != null) System.out.println(" - "+horistas[i].toString());
    }

}
