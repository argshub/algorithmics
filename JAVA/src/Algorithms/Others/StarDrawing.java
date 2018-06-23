package Algorithms.Others;

/**
 * Created by argshub on 5/30/2018.
 */
public class StarDrawing {

    public static void draw(int n, int total) {
        if(n == total) {
            drawStar(n);
            return;
        }
        drawStar(n);
        draw(n + 1, total);
        drawStar(n);
    }

    public static void drawStar(int n) {
        for (int i = 0; i < n; i++) System.out.print("*");
        System.out.println();
    }

    public static void main(String arg[]) {

        draw(1, 8);
    }
}
