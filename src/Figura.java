public class Figura {
    String color;
    double posicionX;
    double posicionY;

    public void dibujar() {
        System.out.println("Se llamó al método dibujar()");
    }

    public void mover(double x, double y) {
        System.out.println("Se llamó al método mover() a posición (" + x + ", " + y + ")");
    }
}
