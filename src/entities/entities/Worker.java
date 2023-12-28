package entities.entities;

import enums.WorkerLevel;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Worker {
    String name;
    WorkerLevel level;
    Double baseSalary;
    Department department;
    private List<HourContract> contracts;
    public Worker(String name, WorkerLevel level, Double baseSalary){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract contract){
        contracts = new ArrayList<>();
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){

    }
    public Double income(Integer year, Integer month) {
        Double valorTotalContrato = 0.0; // Initialize to 0.0

        for (HourContract item : contracts) {
            int monthContract = item.getDate().getMonthValue();
            int yearContrat = item.getDate().getYear();

            if (monthContract == month && yearContrat == year) {
                Double valorContrato = item.getHours() * item.getValuePerHour();
                valorTotalContrato += valorContrato; // Accumulate the total
            }
        }

        valorTotalContrato += getBaseSalary(); // Add base salary to the total

        return valorTotalContrato;
    }


}
