package com.example.samsung.password_validator; /**
 * Created by Samsung on 5/22/2017.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class Password_Test {

    @Test
    public void notPasswordTest1(){
        assertTrue(Password.validate("PastWord"));
    }

    @Test
    public void notPasswordTest2() {
        assertFalse(Password.validate("PassWOrd"));

    }
    @Test
    public void over7CharTest1(){
        assertTrue(Password.validate("overSeven"));

    }
    @Test
    public void over7CharTest2(){

        assertFalse(Password.validate("under"));
    }

}