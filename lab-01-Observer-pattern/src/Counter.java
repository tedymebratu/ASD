import java.util.ArrayList;
import java.util.List;

public class Counter implements Subject
{
    private int count;
    private List<Observer> observers=new ArrayList<>();

    public Counter (TextFrame tf, RectFrame rf, OvalFrame of){

        attach(tf);
        attach(rf);
        attach(of);
        count = 0;
    }

    @Override
    public void attach(Object observer){
        observers.add((Observer) observer);
    }

    @Override
    public void detach(Object observer){
        observers.remove((Observer) observer);
    }
    public void increment(){
        count++;
        notify(count);

            }
    
    public void decrement(){
        if (count >0){
            count--;
            notify(count);
        }
    }

    @Override
    public void notify(Object value) {
        for(Observer observer: this.observers)
            observer.update((int)count);
    }

}