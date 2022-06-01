//1.2 приклад
public class Main {

    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String hello = "abcdefghj";
        String hello2 = "bdfhjacegi";

        String crypted = "";
        String deCrypted = "";


        for (int i = 0; i < hello.length(); i++) {
            char letter = hello.charAt(i);
            int index = (int) letter;
            index += 5;
            letter = (char) index;
            crypted += letter;
        }
        System.out.println(crypted);

        for (int i = 0; i < crypted.length(); i++) {
            char letter = crypted.charAt(i);
            int index = (int) letter;
            index -=5;
            letter = (char) index;
            deCrypted += letter;
        }
        System.out.println(deCrypted);

        //1.3 приклад
        if (hello == null || hello.isEmpty()){
            return;
        }

        int i = 0;
        if (i<=0){
            return;
        }

    }
}