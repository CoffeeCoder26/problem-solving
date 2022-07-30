package leetcode.mediumproblems;

public class PowerClass {

    public double myPow(double x, int n) {
        String s = String.format("%.5f" , Math.pow(x,n));

        return Double.parseDouble(s);
    }
    public static void main(String[] args) {
        PowerClass powerClass = new PowerClass();
        System.out.println(powerClass.myPow(2.10000,3));
    }
}
