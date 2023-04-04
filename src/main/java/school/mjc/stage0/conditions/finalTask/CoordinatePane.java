package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        int i;
        if (x == 0 && y == 0) {
            i=0;
        } else if (x > 0 && y > 0) {
            i=1;
        } else if(x < 0 && y > 0) {
            i=2;
        } else if (x < 0 && y < 0) {
            i=3;
        } else {
            i = 4;
        }
        switch (i) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("first");
                break;
            case 2:
                System.out.println("second");
                break;
            case 3:
                System.out.println("third");
                break;
            case 4:
                System.out.println("fourth");
                break;
        }

    }
}
