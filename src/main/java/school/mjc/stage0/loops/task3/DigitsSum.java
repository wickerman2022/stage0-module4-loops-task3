package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        int len = String.valueOf(t).length();
        for (int i = 0; i < len; i++) {
            int digit = t % 10;
            sum += digit;
            t /= 10;
        }
        System.out.println(Math.abs(sum));
    }
}
