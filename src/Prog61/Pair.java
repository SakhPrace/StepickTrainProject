package Prog61;

import java.util.Objects;
import java.util.Optional;

class Pair<T, X> {
    private T first;
    private X second;

    private Pair(T first, X second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public X getSecond(){
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(first) + Objects.hashCode(second);
    }

    public static<T, X> Pair<T, X> of(T first, X second){
        return new Pair<>(first, second);
    }
}
