package com.example.samsung.password_validator; /**
 * Created by Samsung on 5/22/2017.
 *
 * Tests the two methods('validate' and 'strength_message') from the Password class
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class Password_Test {
    Password input = new Password();
    @Test
    public void notPasswordTest1() {

        assertEquals(2, input.validate("pastword"));
    }

    @Test
    public void notPasswordTest2() {
        assertEquals(1, input.validate("password"));

    }

    @Test
    public void over7CharTest1() {
        assertEquals(1, input.validate("under"));

    }

    @Test
    public void over7CharTest2() {
        assertEquals(2, input.validate("definitelyoverseven"));
    }

    @Test
    public void specialCharTest() {
        assertEquals(3, input.validate("pastword!"));
    }

    @Test
    public void digitTest() {
        assertEquals(4, input.validate("pastword1!"));
    }

    @Test
    public void upAndLowTest() {
        assertEquals(5,input.validate("pastWord1!"));
    }

    @Test
    public void veryWeakTest(){
     assertEquals("Very weak", input.strength_message("input"));
    }

    @Test
    public void weakTest(){
        assertEquals("Weak", input.strength_message("input3"));
    }

    @Test
    public void moderate(){
        assertEquals("Moderate", input.strength_message("input3$"));
    }

    @Test
    public void strongTest(){
        assertEquals("Strong", input.strength_message("inputtext5*"));
    }

    @Test
    public void veryStrongTest(){
        assertEquals("Very strong", input.strength_message("inpuText9,"));
    }
}