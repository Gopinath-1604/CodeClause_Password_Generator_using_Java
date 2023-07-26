package CodeClause_Password_Generator;


import java.util.Random;

public class passwordGenerator {
    public static void main(String[] args) {
        String name= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String number="1234567890";

        String Special_Character="@#%&";

        String Combination=name + number + Special_Character;

        int len=8;

        char[] password = new char[len];

        Random r = new Random();

        for (int i = 0; i < len; i++) {

            password[i] = Combination.charAt(r.nextInt(Combination.length()));

        }
        System.out.println(password);


    }
}
