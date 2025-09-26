public class Cuadrado {
    int lado;

    Cuadrado(int lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return Math.pow(lado,2);
    }

    double calcularPerimetro() {
        return 4*lado;
    }
}
