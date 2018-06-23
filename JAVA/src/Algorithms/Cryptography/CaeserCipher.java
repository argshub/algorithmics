package Algorithms.Cryptography;

/**
 * Created by argshub on 5/30/2018.
 */
public class CaeserCipher {

    public static String cipher(String data, int gap) {
        char character[] = data.toCharArray();
        for (int i = 0; i < character.length; i++) {
            int characterCode = (int) character[i];
            if(characterCode >= 65 && characterCode <= 90) {
                characterCode -= 65;
                characterCode = (characterCode + gap) % 26;
                characterCode += 65;
            }
            else if(characterCode >= 97 && characterCode <= 122) {
                characterCode -= 97;
                characterCode = (characterCode + gap) % 26;
                characterCode += 97;
            }
            character[i] = (char) characterCode;
        }
        return new String(character);
    }

    public static void main(String arg[]) {

        String data = "one if by land and two if by sea";
        data = cipher(data, 4);

        System.out.println("After Encrypt: " + data);


        System.out.println("Possible Decrypt: ");
        for (int i = 1; i <= 26 ; i++) {
            System.out.println(cipher(data, i));
        }




    }

}
