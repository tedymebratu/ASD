import java.util.List;

public interface IteratorA {
    public void current();
    public void next();
    public boolean isDone();
    public Object currentItem() throws Exception;
    //public int size();
    public void setCurrent(int x);
}
