import java.util.Iterator;
import java.util.List;

public class SumFunctor implements Functor<Integer> {

    int sum=0;

    public Integer doAll(MyVector<Integer> t){

        return compute(t);
    }

    @Override
    public Integer compute(MyVector<Integer> t) {
        Iterator iterator = t.iterator();
        while (iterator.hasNext()){
            sum=sum + (int)iterator.next();
        }
        return sum;
    }

    @Override
    public Integer getValue() {
        return sum;
    }


}
