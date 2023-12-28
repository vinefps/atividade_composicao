package Aplication;
import entities.entities.Department;
import entities.entities.HourContract;
import entities.entities.Worker;
import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        List<HourContract> hc = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual departamento? ");
        String dpName = sc.next();
        Department dp = new Department(dpName);
        System.out.println("Entre com os dados do funcionario: ");
        System.out.println("Nome do Funcionario: ");
        String funcName = sc.next();
        System.out.println("Qual o level? ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(sc.next().toUpperCase());
        System.out.println("Base salarial: ");
        Double bs = sc.nextDouble();

        Worker w1 = new Worker(funcName,workerLevel,bs);
        w1.setDepartment(dp);
        //----------------
        System.out.println("Numero de contratos: ");
        Integer n = sc.nextInt();
        //-----------------
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Entre com dados do contrato: ");

        for(int i = 0;i<n;i++){
            System.out.println("Entre com os dados do contrato: " + "#"+i);
            System.out.println("Data dd/MM/yyyy");
            String date = sc.next();
            LocalDate dataContract = LocalDate.parse(date, fmt);
            System.out.println("Valor por hora: ");
            Double valorPh = sc.nextDouble();
            System.out.println("Duracao/horas");
            Integer hours = sc.nextInt();

            HourContract hourContract = new HourContract(dataContract,valorPh,hours);
            w1.addContract(hourContract);
        }

        System.out.println("Entre com o mes e ano do pagamento: mm/yyyy");
        String dataIncome = sc.next();
        String[] parts = dataIncome.split("/");
        Integer mes = Integer.parseInt(parts[0]);
        Integer ano = Integer.parseInt(parts[1]);

        Double valorTotal = w1.income(mes,ano);

        System.out.println("Name: " + w1.getName() + "\nDepartment: "+ w1.getDepartment() + "\n Income: " + mes +"/"+ ano + valorTotal);

    }
}
