import br.com.prova.Quadrado;
import br.com.prova.Triangulo;
import br.com.prova.Circulo;


public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        quadrado.area(); 
        
        Triangulo triangulo = new Triangulo(3, 4);
        triangulo.area(); 
        
        Circulo circulo = new Circulo(2);
        circulo.area(); 
    }
}