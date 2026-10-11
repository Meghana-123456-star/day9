import java.util.Scanner;
public class ArrayIndexValidation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter array index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Value: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }

    }
}