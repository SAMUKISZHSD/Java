package br.com.prova;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void area() {
        double area = lado * lado;
        System.out.println("Área do quadrado: " + area);
    }
}