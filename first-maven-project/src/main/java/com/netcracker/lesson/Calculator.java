package com.netcracker.lesson;

public class Calculator {
    float a;
    float b;

    public float add(float a, float b){
        this.a = a;
        this.b = b;
        return a + b;
    }

    public float minus(float a, float b){
        this.a = a;
        this.b = b;
        return a - b;
    }

    public float devide(float a, float b){
        this.a = a;
        this.b = b;
        return a / b;
    }

    public float multiple(float a, float b){
        this.a = a;
        this.b = b;
        return a * b;
    }
}
