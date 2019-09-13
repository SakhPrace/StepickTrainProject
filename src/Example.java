import java.util.Optional;

public class Example<X> {
    public void someMethod(Object obj) {
        Optional<X> smth = Optional.empty();
        //if (obj instanceof X){}
        //if (obj instanceof Optional<X>){}
        X massiv = (X)obj;
    }
}