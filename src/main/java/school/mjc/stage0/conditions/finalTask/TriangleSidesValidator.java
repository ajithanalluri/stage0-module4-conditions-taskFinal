package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        int i ;
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            i = 1;
        } else if (firstSide + secondSide <= thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide) {
            i = 2;
        } else {
            i = 3;
        }
        switch (i) {
            case 1:
                System.out.println("it's not a triangle");
                break;
            case 2:
                System.out.println("it's not a triangle");
                break;
            case 3:
                System.out.println("this is a valid triangle");
                break;
        }
    }
}
