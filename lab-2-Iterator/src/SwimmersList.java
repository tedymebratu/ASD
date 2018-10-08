import java.util.*;

public class SwimmersList implements Aggregate
{

    private Vector slist= new Vector();


    public void addSwimmer(Swimmer swimmer){
        slist.addElement(swimmer);
    }
    
    public Vector getVector(){
        return slist;
    }


    @Override
    public IteratorA createIterator() {
        return new ConcereteIterator(slist) ;
    }

    @Override
    public IteratorA createReverseIterator() {
        return new ReverseConcreteIterator(slist) ;

    }
}
