package com.financial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardNumberValidationTest {
    CreditCardNumberValidation creditCardNumberValidation;

    @BeforeEach
    void setUp() {
        creditCardNumberValidation = new CreditCardNumberValidation();
    }

    @AfterEach
    void tearDown() {
        creditCardNumberValidation = null;
    }

    @Test
    void testToCheckForNumberEntered(){
        creditCardNumberValidation.setNumber(4388576018402626L);
        long number= 4388576018402626L;
        assertEquals(number, creditCardNumberValidation.getNumber());
    }

    @Test
    void testForLengthOfNumbersEntered(){
        creditCardNumberValidation.setNumber(4388576018402626L);
        long number= 4388576018402626L;
        assertEquals(16,creditCardNumberValidation.getNumberLength());
    }

    @Test
    void testForValidLength(){
        creditCardNumberValidation.setNumber(4388576018402626L);
        assertTrue(creditCardNumberValidation.isValid());
    }

//    @Test
//    void testForSumOfDoubleEvenPlace(){
//        creditCardNumberValidation.setNumber(4388576018402626L);
//        assertEquals(37, creditCardNumberValidation.sumOfDoubleEvenPlace());
//    }




}