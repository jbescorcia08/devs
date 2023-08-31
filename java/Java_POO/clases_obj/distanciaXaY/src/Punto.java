public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public float Distacia(){
        return (float) Math.sqrt(Math.pow(x,2)  +  Math.pow(y,2));
    }

    public float Distancia(int x1, int y1){
        return (float) Math.sqrt(Math.pow(x1 - x,2)  +  Math.pow(y1 - y,2));
    }
}
