package EasyProblems;

public class BasicCalculator {

    public int calculate(String s) {
            int x = Integer.parseInt(s);
            return x;
    }

    /// not working
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        System.out.println(basicCalculator.calculate("1+1"));
    }
}
