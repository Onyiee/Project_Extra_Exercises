package com.financial;

public class CreditCardNumberValidation {


    private Long number;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public int getNumberLength() {
        String numberConvertedToString= number.toString();
        int length =numberConvertedToString.length();

       return length;
    }

    public boolean isValid() {
        boolean validity = false;
       if (getNumberLength()==13 || getNumberLength()==14 ||
               getNumberLength()==15 || getNumberLength()==16){
           validity = true;
       }
        return validity;

    }


//    public int sumOfDoubleEvenPlace() {
//       return 0;
//
//    }


}
