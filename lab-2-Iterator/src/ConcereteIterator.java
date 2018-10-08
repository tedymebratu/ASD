import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ConcereteIterator implements IteratorA {

    private List<Aggregate> aggregate = new Vector<>();
    private int index;

    public ConcereteIterator(List<Aggregate> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void current() {
        index=0;
       // return index;
    }

    @Override
    public void next() {
        index++;

    }

    @Override
    public boolean isDone() {
        return index > aggregate.size()-1;
    }

    @Override
    public Object currentItem() throws Exception {
        if(isDone()){
            throw new Exception("Iterator out of bound exception");
        }
        return aggregate.get(index);
    }

    /*@Override
    public int size() {
        return aggregate.size()-1;
    }*/

    @Override
    public void setCurrent(int x) {
        index=x;
    }

    public List<Aggregate> getAggregate() {
        return aggregate;
    }

    public void setAggregate(List<Aggregate> aggregate) {
        this.aggregate = aggregate;
    }
}
