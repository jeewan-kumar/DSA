import java.util.Scanner;

public class MakeABill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pencile Price: ");
        int pencil = sc.nextInt();
        System.out.print("Enter Pen Price: ");
        int pen = sc.nextInt();
        System.out.print("Enter Eraser Price: ");
        int eraser = sc.nextInt();

        double bill = (pencil + pen + eraser)*1.18;

        System.out.println("Total Bill : "+bill);
    }
}
