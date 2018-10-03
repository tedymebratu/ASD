import java.util.ArrayList;
import java.util.List;

public class Counter
{
    private TextFrame textframe;
    private RectFrame rectframe;
    private OvalFrame ovalframe;
    private int count;
    private List<Observer> observers=new ArrayList<>();

    public Counter (TextFrame tf, RectFrame rf, OvalFrame of){

        addObserver(tf);
        addObserver(rf);
        addObserver(of);
        count = 0;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void increment(){
        count++;
        for(Observer observer: this.observers)
            observer.update(count);
            }
    
    public void decrement(){
        if (count >0){
            count--;
            for(Observer observer: this.observers)
                observer.update(count);

        }
    }
}