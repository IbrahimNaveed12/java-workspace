public class MaximumOfTwoNumbers {

    // Method to find the maximum of two numbers
    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        return result;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 27;
        
        int highest = max(a, b);
        System.out.println("The maximum value is: " + highest);
    }
}