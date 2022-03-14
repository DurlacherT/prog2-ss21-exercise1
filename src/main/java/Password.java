
public class Password {

    public static boolean checkPassword(String password) {

        if (!checkPasswordLenght(password))
            return false;

        if (!checkUpperAndLowerCharacter(password))
            return false;

        if (!checkNumbers(password))
            return false;

        if (!checkSpecialCharacters(password))
            return false;

        return true;
    }

    static boolean checkPasswordLenght(String password) {
        return (password.length() >= 8 & password.length() <= 25);
    }

    static boolean checkUpperAndLowerCharacter(String password) {
        for (int q = 0; q < password.length(); q++) {
            if (Character.isLowerCase(password.charAt(q))) {
                for (int p = 0; p < password.length(); p++) {
                    if (Character.isUpperCase(password.charAt(p))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

   static boolean checkNumbers(String password) {
       for (int q = 0; q < password.length(); q++) {
           if (Character.isDigit(password.charAt(q))) {
               return true;
           }
       }
       return false;
   }

    static boolean checkSpecialCharacters(String password) {
        String specialCharacters = "()#$?!%/@";
        for (int i=0; i < password.length() ; i++)
        {
            char character = password.charAt(i);
            if(specialCharacters.contains(Character.toString(character))) {
                return true;
            }
            else if(i == password.length()-1)
                return false;
        }
        return false;
    }

}

