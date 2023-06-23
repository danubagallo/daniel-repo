package org.academiadecodigo.bootcamp;

import java.util.HashMap;
import java.util.Iterator;

public class WordHistogramInher extends HashMap<String, Integer> implements Iterable<String> {  // INHERITANCE

    public WordHistogramInher(String text) {
        //Extends from HashMap no need to instance new HashMap. (INHERITANCE)
        String[] array = text.split(" "); // SEPARA AS PALAVRAS
        for (String word : array) { //Iterate on text over array.
            if (containsKey(word)) { //If words is already mapped
                replace(word, get(word) + 1); // replaces the word and increases the count
            } else {
                put(word, 1); // if it's not mapped it maps the word(KEY=STRING) with a value(VALUE = INT)
            }

        }
    }

    @Override
    public Iterator<String> iterator() { //CREATES THE ITERATOR
        return keySet().iterator();
    }
}
