import java.util.Iterator;

public class InternalSelectionFunctor implements Functor<Integer> {
    Integer sum;

    public Integer doAll(MyVector<Integer> t){

        return compute(t);
    }

    @Override
    public Integer compute(MyVector<Integer> t) {

        Iterator iterator=t.iterator();
        while(iterator.hasNext()){
            Integer i=(Integer)iterator.next();
            if(i > 2)
                sum=+ i;
        }
        return sum;
    }

    @Override
    public Integer getValue() {
        return sum;
    }

    Iterator IteratorMethod(MyVector<Integer> t){
        MyVector<Integer> newInts=new MyVector<>();
        for(Object i:t){
            if((int)i>2)
                newInts.add(i);
        }
        Iterator iterator=newInts.iterator();
        return iterator;
    }
}
