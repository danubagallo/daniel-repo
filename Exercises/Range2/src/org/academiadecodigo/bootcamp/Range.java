package org.academiadecodigo.bootcamp;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

    private int min;
    private int max;
    private boolean clockwise;

    public Range(int min, int max, boolean clockwise) {
        this.min = min;
        this.max = max;
        this.clockwise = clockwise;
    }


    public Iterator<Integer> iterator() {

        if (clockwise == true) {
            return new Iterator() {
                @Override
                public boolean hasNext() {
                    if (min == max + 1) {
                        return false;
                    } else {
                        return true;
                    }
                }

                @Override
                public Integer next() {
                    if (hasNext()) {
                        min = min + 1;
                    }
                    return min - 1;
                }
            };
        } else {
            return new Iterator() {

                @Override
                public boolean hasNext() {
                    if (max == min - 1) {
                        return false;
                    } else {
                        return true;
                    }
                }
                @Override
                public Integer next() {
                    if(hasNext()){
                        max = max - 1;
                    }
                    return max + 1;
                }
            };
        }
    }
}