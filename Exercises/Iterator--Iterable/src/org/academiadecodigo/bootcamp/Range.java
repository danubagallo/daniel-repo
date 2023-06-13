package org.academiadecodigo.bootcamp;

public class Range implements Iterable<Integer> {

    private int min;
    private int max;


    public Range(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }


    @Override
    public Potato iterator() {

        return new Potato( min,max);

    }

}