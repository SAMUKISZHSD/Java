package br.com.prova;

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void area() {
        double area = (base * altura) / 2;
        System.out.println("Área do triângulo: " + area);
    }
}