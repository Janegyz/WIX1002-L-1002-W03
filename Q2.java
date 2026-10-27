/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author User
 */
public class Q2 {
    
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(6); // 0 to 5 inclusive

        String word;
        word = switch (n) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            default -> "unknown";
        };

        System.out.println(n + " is " + word);
    }
}

