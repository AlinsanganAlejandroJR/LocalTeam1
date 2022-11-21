package com.academy.LocalTeam1.util;

public class AutoGeneratorId {
    public static String generateAccountNumber() {
        /* return a random long of 16 length */
        long smallest = 1000_0000_0L;
        long biggest =  8999_9999_9L;
        long acctNumber = smallest + (long) (Math.random() * (biggest - smallest));
        return String.valueOf(acctNumber);
    }
}
