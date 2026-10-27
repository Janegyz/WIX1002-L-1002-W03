/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    import java.util.Scanner;
/**
 *
 * @author User
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        System.out.print("Enter the point (x y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Distance from the center (0, 0) to the point (x, y)
        double distance = Math.sqrt(x * x + y * y);

        if (distance < radius) {
            System.out.println("Point (" + x + ", " + y + ") is inside the circle");
        } else if (distance == radius) {
            System.out.println("Point (" + x + ", " + y + ") is on the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is outside the circle");
        }

    }

}
