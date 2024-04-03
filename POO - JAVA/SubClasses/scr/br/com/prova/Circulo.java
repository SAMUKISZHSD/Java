package br.com.prova;

public class Circulo extends FormaGeometrica {
    private double raio;
    private static final double PI = 3.14159265359;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void area() {
        double area = PI * raio * raio;
        System.out.println("Área do círculo: " + area);
    }
}