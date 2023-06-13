package org.academiadecodigo.bootcamp;

import java.util.Iterator;


public class Potato implements Iterator<Integer> {

    private Integer minNumber;
    private Integer maxNumber;

    public Potato(Integer min, Integer max) {
        this.minNumber = min;
        this.maxNumber = max;
    }

    @Override
    public boolean hasNext() {
        if (minNumber.equals(maxNumber +1)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Integer next() {

        if (hasNext()){
            minNumber = minNumber + 1;
        }
        return minNumber -1;

    }

}