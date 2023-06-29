package org.academiadecodigo.bootcamp;

public class Machine<T> {
    public T mono(T a,MonoOperation<T> mono) {
        return mono.monoOperation(a);
    }

    public T bi(T a, T b, BiOperation<T> bi) {
        return bi.biOperation(a, b);
    }

}
