package com.sda.example.Production;

public class Tool {
    private int weight;
    private String name;

    public Tool(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tool tool = (Tool) o;

        if (weight != tool.weight) return false;
        return name.equals(tool.name);
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + name.hashCode();
        return result;
    }
}
