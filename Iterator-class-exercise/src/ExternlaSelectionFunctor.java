import java.util.ArrayList;
import java.util.List;

public class ExternlaSelectionFunctor implements Functor<Integer> {
    Integer sum;

    public Integer doAll(MyVector<Integer> t){

        return compute(t);
    }

    @Override
    public Integer compute(MyVector<Integer> t) {

        List<Integer> ints=t;
        //ints=t;
        for(Integer i: ints){
            if(i>2)
                sum=+ i;
        }

        return sum;
    }

    @Override
    public Integer getValue() {
        return sum;
    }
}
