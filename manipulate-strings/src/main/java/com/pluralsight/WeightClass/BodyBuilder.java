package com.pluralsight.WeightClass;

public class BodyBuilder {
    String description;
    int weight;
    double height;
    double musclemass;

    @Override
    public String toString() {
        return "BodyBuilder{" +
                "description='" + description + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", musclemass=" + musclemass +
                '}';
    }
}
