package org.example.lecture3;

import java.util.Objects;

public class Habitat {
    private String environment;
    private double temperature;

    public Habitat(String environment, double temperature) {
        this.environment = environment;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "lecture3.Habitat{" +
                "environment='" + environment + '\'' +
                ", temperature=" + temperature +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Habitat habitat)) return false;
        return Double.compare(temperature, habitat.temperature) == 0 && Objects.equals(environment, habitat.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment, temperature);
    }

    public String getEnvironment() {
        return environment;
    }

}

