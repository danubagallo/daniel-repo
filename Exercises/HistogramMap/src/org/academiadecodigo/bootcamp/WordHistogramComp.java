package org.academiadecodigo.bootcamp;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;
import java.util.*;

public class WordHistogramComp implements Iterable<String> {

    public Map<String, Integer> histogramText;

    public WordHistogramComp(String string) {
        this.histogramText = new HashMap<>(); //Instanceate because it doesnt extend (COMPOSITION)
        String[] array = string.split(" "); // SEPARA AS PALAVRAS
        for (String word : array) { //Iterate on text over array.
            if(histogramText.containsKey(word)) { //If words is already mapped
                histogramText.replace(word, get(word) + 1); // replaces the word and increases the count
            } else {
                histogramText.put(word, 1); //if it's not mapped it maps the word(KEY=STRING) with a value(VALUE = INT)
            }

        }
    }
    public int get(String word){
        return histogramText.get(word); //Specefies a value to a key
    }
    public int size(){
        return histogramText.size(); // Returns the number of key-value mappings in this map.
    }

    @Override
    public Iterator<String> iterator() {
        return histogramText.keySet().iterator();
    }
}