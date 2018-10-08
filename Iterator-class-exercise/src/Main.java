import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args){

        MyVector<Integer> ints=new MyVector();

       for(int i=1;i<=10;i++)
           ints.add(i);

       System.out.println("1. Internal sum");

       SumFunctor sumFunctor=new SumFunctor();
       System.out.println(sumFunctor.doAll(ints));

       System.out.println("1.b Internal average");

       AverageFunctor averageFunctor=new AverageFunctor();
       System.out.println(averageFunctor.doAll(ints));

       System.out.println("2. External Selective");

       ExternlaSelectionFunctor external=new ExternlaSelectionFunctor();
       System.out.println(external.doAll(ints));

       System.out.println("3. Internal Selective");

       InternalSelectionFunctor internal=new InternalSelectionFunctor();
       System.out.println(internal.doAll(ints));

       System.out.println("4. External selective + Iterable");

       IterableFunctor iterableFunctor=new IterableFunctor();
       System.out.println(iterableFunctor.doAll(ints));







    }
}
