import java.util.List;

public interface Functor<T> {
    public T compute(MyVector<T> t);
    public T getValue();

}
