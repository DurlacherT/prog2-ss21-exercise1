package package1;


public class Password {

    public static boolean checkPassword(String string) {

        boolean output;
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
                count++;
        }
        if (count < 8 || count > 25){
            output = false;
        } else output = true;
        return output;


    }
}