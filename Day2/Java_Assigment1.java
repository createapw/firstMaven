import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;

public class Java_Assigment1 {
    public static void print2largest(int arr[], int arr_size) {
        int i, first, second;

        if (arr_size < 2)
        {
            System.out.printf(" Invalid Input ");
            return;
        }

        int largest = second = Integer.MIN_VALUE;

        for(i = 0; i < arr_size; i++)
        {
            largest = Math.max(largest, arr[i]);
        }

        for(i = 0; i < arr_size; i++)
        {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        if (second == Integer.MIN_VALUE)
            System.out.printf("There is no second " +
                    "largest element\n");
        else
            System.out.printf("The second largest " +
                    "element is %d\n", second);
    }
    public static int[] merge(int[] a, int[] b) {
        int a1 = a.length;
        int b1 = b.length;

        int c1 = a1 + b1;

        int[] c = new int[c1];

        for (int i = 0; i < a1; i = i + 1) {
            c[i] = a[i];
        }

        for (int i = 0; i < b1; i = i + 1) {
            c[a1 + i] = b[i];
        }
        return c;
    }
    public static int doSomething1(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
    public static void doSomething2() {
        Long datetime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(datetime);
        System.out.println("Current Time Stamp: "+ timestamp);
    }
    public static void doSomething3(int x) {
        try {
            String filename = (x -'0') + ".txt";
            File myFile = new File(filename);
            if (myFile.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or q to quit");
        String line = sc.nextLine();
        if (line.charAt(0) == 'q') {
            sc.close();
            return;
        } else {
            int num = line.charAt(0) -'0';
            if (num > 0) {
                doSomething1(num);
                doSomething2();
                doSomething3(num);
            } else {
                System.out.println("Error");
            }
        }
        sc.close();
    }

}
