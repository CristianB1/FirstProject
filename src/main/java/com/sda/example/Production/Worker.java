package com.sda.example.Production;

public class Worker {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (age != worker.age) return false;
        return profession.equals(worker.profession);
    }

    @Override
    public int hashCode() {
        int result = profession.hashCode();
        result = 31 * result + age;
        return result;
    }

    private String profession;
    private int age;

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

    @Override
    public String toString() {
        return "Worker{" +
                "profession='" + profession + '\'' +
                ", age=" + age +
                '}';
    }
}
