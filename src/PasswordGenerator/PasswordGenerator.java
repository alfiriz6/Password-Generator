/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PasswordGenerator;

/**
 *
 * @author FRIDAY
 */
import java.util.Random;

public class PasswordGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Your password is: ");
        System.out.print(generatePassword(12));
        System.out.println();
    }

    private static char[] generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "`-=[];',./~!@#$%^&*()_+{}:|<>?";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = combinedChars.charAt(random.nextInt(combinedChars.length()));
//        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
//        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
//        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
//        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for (int i = 1; i < length; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }

        return password;
    }
}
