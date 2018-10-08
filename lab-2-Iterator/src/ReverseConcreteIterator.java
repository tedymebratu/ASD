import java.util.List;
import java.util.Vector;

public class ReverseConcreteIterator implements IteratorA {

    private List<Aggregate> aggregate = new Vector<>();
    private int index;

    public ReverseConcreteIterator(List<Aggregate> aggregate) {
        this.aggregate = aggregate;
        index = aggregate.size()-1;
    }

    @Override
    public void current() {
        index = aggregate.size() - 1;
        //return index;
    }

    @Override
    public void next() {
        index--;

    }

    @Override
    public boolean isDone() {
        //return index > aggregate.size()-1;
        return index < 0 ;
    }

    @Override
    public Object currentItem() throws Exception {
//        if (isDone()) {
//            throw new Exception("Iterator out of bound exception");
//        }

            return aggregate.get(index);
        }

    /*@Override
    public int size() {
        return 0;
    }*/

    @Override
    public void setCurrent(int x) {

    }


}
