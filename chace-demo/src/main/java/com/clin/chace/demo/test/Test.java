package com.clin.chace.demo.test;

import com.clin.chace.demo.utils.Util;

public class Test {

    public static void main(String[] args) {
        int COUNT_BITS = Integer.SIZE - 3;
        int CAPACITY   = (1 << COUNT_BITS) - 1;
        int RUNNING    = -1 << COUNT_BITS;
        int SHUTDOWN   =  0 << COUNT_BITS;
        int STOP       =  1 << COUNT_BITS;
        int TIDYING    =  2 << COUNT_BITS;
        int TERMINATED =  3 << COUNT_BITS;
        System.out.println("CAPACITY:   " + Integer.toBinaryString(CAPACITY));
        System.out.println("RUNNING:    " + Integer.toBinaryString(RUNNING) + " | " + RUNNING);
        System.out.println("SHUTDOWN:   " + Integer.toBinaryString(SHUTDOWN) + " | " + SHUTDOWN);
        System.out.println("STOP:       " + Integer.toBinaryString(STOP) + " | " + STOP);
        System.out.println("TIDYING:    " + Integer.toBinaryString(TIDYING) + " | " + TIDYING);
        System.out.println("TERMINATED: " + Integer.toBinaryString(TERMINATED) + " | " + TERMINATED);

        System.out.println(Integer.toBinaryString(~CAPACITY));
    }
}
