
package Queue;
import java.lang.Object;

public class QueueLinearList extends ArrayLinearList implements Queue{
    
    @Override
    public boolean isEmpty();
        return super.isEmpty();

    @Override
    public Object getFrontElement(){
        return super.get(0);
}
    @Override
    public Object getRearElement(){
        return super.get(size-1);
}
    @Override
    public void put(Object theElement){
        return super.add(size(), Object theElement);
}
    @Override
    public Object remove(){
        return super.remove(0);
}
}
