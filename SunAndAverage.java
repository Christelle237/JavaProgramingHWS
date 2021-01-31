public class SunAndAverage {
    public static void main (String[] args) {
        int sum = 0;
        double average;
        int lowerbound = 1;
        double upperbound = 100;
        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;
        }
        average= sum/upperbound;
        System.out.println("The sum = "+sum);
        System.out.println("The average = "+ average);
    }
}
