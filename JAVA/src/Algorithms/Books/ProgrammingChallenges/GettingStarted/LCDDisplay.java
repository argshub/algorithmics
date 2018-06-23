package Algorithms.Books.ProgrammingChallenges.GettingStarted;

/**
 * Created by argshub on 6/2/2018.
 */
public class LCDDisplay {

    public static void drawUpperHand(int size) {
        System.out.print(" ");
        for (int i = 0; i < size; i++) System.out.print("-");
        System.out.print(" ");
    }

    public static void drawLeftBar(int size) {
        System.out.print("|");
        for (int i = 0; i <= size; i++) System.out.print(" ");
    }

    public static void drawRightBar(int size) {
        for (int i = 0; i <= size; i++) System.out.print(" ");
        System.out.print("|");
    }

    public static void drawBothBar(int size) {
        System.out.print("|");
        for (int i = 0; i < size; i++) System.out.print(" ");
        System.out.print("|");
    }

    public static void drawEmptyHorizontal(int size) {
        System.out.print(" ");
        for (int i = 0; i < size; i++) System.out.print(" ");
        System.out.print(" ");
    }


    public static void drawDigit(int number, int size, int symbol) {
        switch (number) {
            case 1:
                switch (symbol) {
                    case 1:
                        drawEmptyHorizontal(size);
                        break;
                    case 2:
                        drawRightBar(size);
                        break;
                    case 3:
                        drawEmptyHorizontal(size);
                        break;
                    case 4:
                        drawRightBar(size);
                        break;
                    case 5:
                        drawEmptyHorizontal(size);
                        break;
                }
                break;
            case 2:
                switch (symbol) {
                    case 1:
                        drawUpperHand(size);
                        break;
                    case 2:
                        drawRightBar(size);
                        break;
                    case 3:
                        drawUpperHand(size);
                        break;
                    case 4:
                        drawLeftBar(size);
                        break;
                    case 5:
                        drawUpperHand(size);
                        break;
                }
                break;
            case 3:
                switch (symbol) {
                    case 1:
                        drawUpperHand(size);
                        break;
                    case 2:
                        drawRightBar(size);
                        break;
                    case 3:
                        drawUpperHand(size);
                        break;
                    case 4:
                        drawRightBar(size);
                        break;
                    case 5:
                        drawUpperHand(size);
                        break;
                }
                break;
            case 4:
                switch (symbol) {
                    case 1:
                        drawEmptyHorizontal(size);
                        break;
                    case 2:
                        drawBothBar(size);
                        break;
                    case 3:
                        drawUpperHand(size);
                        break;
                    case 4:
                        drawRightBar(size);
                        break;
                    case 5:
                        drawEmptyHorizontal(size);
                        break;
                }
                break;
            case 5:
                switch (symbol) {
                    case 1:
                        drawUpperHand(size);
                        break;
                    case 2:
                        drawLeftBar(size);
                        break;
                    case 3:
                        drawUpperHand(size);
                        break;
                    case 4:
                        drawRightBar(size);
                        break;
                    case 5:
                        drawUpperHand(size);
                        break;
                }
                break;
            case 6:
                switch (symbol) {
                    case 1:
                        drawUpperHand(size);
                        break;
                    case 2:
                        drawLeftBar(size);
                        break;
                    case 3:
                        drawUpperHand(size);
                        break;
                    case 4:
                        drawBothBar(size);
                        break;
                    case 5:
                        drawUpperHand(size);
                        break;
                }
                break;
            case 7:
                switch (symbol) {
                    case 1:
                        drawUpperHand(size);
                        break;
                    case 2:
                        drawRightBar(size);
                        break;
                    case 3:
                        drawEmptyHorizontal(size);
                        break;
                    case 4:
                        drawRightBar(size);
                        break;
                    case 5:
                        drawEmptyHorizontal(size);
                        break;
                }
                break;
            case 8:
                switch (symbol) {
                    case 1:
                        drawUpperHand(size);
                        break;
                    case 2:
                        drawBothBar(size);
                        break;
                    case 3:
                        drawUpperHand(size);
                        break;
                    case 4:
                        drawBothBar(size);
                        break;
                    case 5:
                        drawUpperHand(size);
                        break;
                }
                break;
            case 9:
                switch (symbol) {
                    case 1:
                        drawUpperHand(size);
                        break;
                    case 2:
                        drawBothBar(size);
                        break;
                    case 3:
                        drawUpperHand(size);
                        break;
                    case 4:
                        drawRightBar(size);
                        break;
                    case 5:
                        drawUpperHand(size);
                        break;
                }
                break;
            case 0:
                switch (symbol) {
                    case 1:
                        drawUpperHand(size);
                        break;
                    case 2:
                        drawBothBar(size);
                        break;
                    case 3:
                        drawEmptyHorizontal(size);
                        break;
                    case 4:
                        drawBothBar(size);
                        break;
                    case 5:
                        drawUpperHand(size);
                        break;
                }
                break;
        }
    }

    public static void draw(int number, int size, int symbol) {
        if(number == 0) return;
        draw(number / 10, size, symbol);
        drawDigit(number % 10, size, symbol);
        System.out.print(" ");
    }

    public static void drawNumber(int number, int size) {
        draw(number, size, 1);
        System.out.println();
        for (int i = 0; i < size; i++) {
            draw(number, size, 2);
            System.out.println();
        }
        draw(number, size, 3);
        System.out.println();
        for (int i = 0; i < size; i++) {
            draw(number, size, 4);
            System.out.println();
        }
        draw(number, size, 5);
        System.out.println();
    }


    public static void main(String arg[]) {
        drawNumber(12345, 2);
        System.out.println();
        drawNumber(67890, 3);
    }
}
