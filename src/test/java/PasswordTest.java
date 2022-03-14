import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordTest {

    @Test
    void checkPassword_tooshort(){
        boolean actual = Password.checkPasswordLenght("1423");
        boolean expected = false;
        assertEquals(expected, actual);

    }
    @Test
    void checkPassword_correct_lenght(){
        boolean actual = Password.checkPasswordLenght("1246565423");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_too_long(){
        boolean actual = Password.checkPasswordLenght("12444444444444444444444423");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_has_no_capital_charackters(){
        boolean actual = Password.checkUpperAndLowerCharacter("dddddddddd");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_only_capital_letters(){
        boolean actual = Password.checkUpperAndLowerCharacter("BBBBBBBBB");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_capital_and_small_letters(){
        boolean actual = Password.checkUpperAndLowerCharacter("AbCdEfGh");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_contains_numbers(){
        boolean actual = Password.checkNumbers("AbC2dEfGh");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_special_characters(){
        boolean actual = Password.checkSpecialCharacters("AbC2dEfGh");
        boolean expected = false;
        assertEquals(expected, actual);
    }


}
