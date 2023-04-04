package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int i = 0;
        if(divider == 0)
            i = -1;
        else if (dividend / divider * divider == dividend)
            i = 1;
        switch (i) {
            case -1:
                System.out.println("division by zero");
                break;
            case 1:
                System.out.println("can be divided completely");
                break;
            case 0:
                System.out.println("cannot be divided completely");
                break;
        }
    }
}
