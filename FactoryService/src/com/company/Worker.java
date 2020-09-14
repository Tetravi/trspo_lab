package com.company;

final public class Worker {
    final private String name;
    final private String job;
    private int salary;

    public Worker(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public void giveSalary(double _salary){
        salary += _salary;
    }

    public int getSalary() { return salary; }

    public String getName() { return name; }

    @Override
    public String toString(){
        return job +"  " + name;
    }
}
