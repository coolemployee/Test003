package com.implemica.task.antsyferov;

import java.math.BigInteger;

/**
 * NOTE to Employer: I think the solving should use bignum arithmetic
 * implementation, but Java already has an implementation of bignum arithmetic.
 * So I've decided to keep it simple and just used java.math.BigInteger class to
 * get needed result.
 * 
 * @author Anton Antsyferov
 */
public class Test003 {
    private static final int NUMBER = 100; // number to calculate

    /**
     * @param args
     *            not used
     */
    public static void main(String[] args) {

	BigInteger factorial = new BigInteger("1");
	// calulating factorial
	for (int i = 1; i <= NUMBER; i++) {
	    factorial = factorial.multiply(new BigInteger(Integer.valueOf(i)
		    .toString()));
	}

	String stringFactorial = factorial.toString();
	int sumOfDigits = 0;
	// calculating sum of digits
	for (int i = 0; i < stringFactorial.length(); i++) {
	    sumOfDigits += Character.getNumericValue(stringFactorial.charAt(i));
	}
	System.out.println(sumOfDigits);

    }

}
