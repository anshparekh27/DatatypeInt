// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int number=2;
        System.out.println(number);

        int value1= 9/2;
        System.out.println("value1="+value1);

        int max_range=Integer.MAX_VALUE;
        int min_range=Integer.MIN_VALUE;

        System.out.println(max_range);
        System.out.println(min_range);

        int sum1=max_range+1;
        int sum2=min_range-1;

        System.out.println(sum1); // Overflow occurs
        System.out.println(sum2); // Underflow occurs
        }
    }
