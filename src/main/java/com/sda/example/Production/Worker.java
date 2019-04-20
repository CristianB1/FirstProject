package com.sda.example.Production;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Worker {
    private String profession;
    private int age;
    private List<Tool> tools;

    // private WorkerMotto workerMotto;
    @Autowired private WorkerMotto workerMotto; //creeaza dependenta din WorkerConfig @Bean

    public Worker(String profession, int age, WorkerMotto workerMotto) {
        this.profession = profession;
        this.age = age;
        this.workerMotto = workerMotto;
    }

    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WorkerMotto getWorkerMotto() {
        return workerMotto;
    }
    public void setWorkerMotto(WorkerMotto workerMotto) {
        this.workerMotto = workerMotto;
    }

    public List<Tool> getTools() {
        return tools;
    }
    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (age != worker.age) return false;
        if (!profession.equals(worker.profession)) return false;
        if (!workerMotto.equals(worker.workerMotto)) return false;
        return tools.equals(worker.tools);
    }

    @Override
    public int hashCode() {
        int result = profession.hashCode();
        result = 31 * result + age;
        result = 31 * result + workerMotto.hashCode();
        result = 31 * result + tools.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "profession='" + profession + '\'' +
                ", age=" + age +
                ", workerMotto=" + workerMotto +
                ", tools=" + tools +
                '}';
    }

}
