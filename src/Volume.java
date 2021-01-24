public class Volume {
    public static void main(String[] args) {
        double PI = 3.14;
        int R = 4;
        int h = 9;
        double V = PI*Math.pow(R,2)*h;
        double S = 2*PI*Math.pow(R,2)+2*PI*Math.pow(R,2);
        System.out.println("V = " + V);
        System.out.println("S = " + S);
    }
}
