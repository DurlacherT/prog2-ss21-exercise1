//https://github.com/DurlacherT/prog2-ss21-exercise1

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordTest {

    @Test
    void checkPassword_too_short(){
        boolean actual = Password.checkPassword("1423");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_correct_length(){
        boolean actual = Password.checkPassword("Ab@Cd1EfGhr");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_too_long(){
        boolean actual = Password.checkPassword("12444@Gd444444444444444444423");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_has_no_capital_charackters(){
        boolean actual = Password.checkPassword("dddd1@dddddd");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_only_capital_letters(){
        boolean actual = Password.checkPassword("BBB1@BBBBBB");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_capital_and_small_letters(){
        boolean actual = Password.checkPassword("Ab@Cd1EfGhr");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_contains_numbers(){
        boolean actual = Password.checkPassword("Ab@Cd1EfGhr");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_contains_no_numbers(){
        boolean actual = Password.checkPassword("Ab@CdEfGhr");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_contains_special_characters(){
        boolean actual = Password.checkPassword("AbC2@dEfGh");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_contains_no_special_characters(){
        boolean actual = Password.checkPassword("AbC2dEfGh");
        boolean expected = false;
        assertEquals(expected, actual);
    }

}
