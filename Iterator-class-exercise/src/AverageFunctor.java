import java.util.List;

public class AverageFunctor implements Functor<Integer>  {
    int sum;
    Integer avg;

    public Integer doAll(MyVector<Integer> t){

        return compute(t);
    }


    @Override
    public Integer compute(MyVector<Integer> t) {
        SumFunctor sumFunctor = new SumFunctor();
        Integer sum = sumFunctor.compute(t);
        this.avg =  sum/t.size();
        return  this.avg;
    }

    @Override
    public Integer getValue() {
        return this.avg;
    }
}
