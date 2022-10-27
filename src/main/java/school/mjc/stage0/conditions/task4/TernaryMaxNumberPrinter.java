package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int firstMax = first > second ? first : second;
        int max = firstMax > third ?
                        firstMax :
                        third;
        System.out.println(max);
    }
}
