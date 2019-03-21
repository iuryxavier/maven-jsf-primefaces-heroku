@ManagedBean
@ViewScoped
public class CounterView implements Serializable {
     
    private int number;
 
    public int getNumber() {
        return number;
    }
 
    public void increment() {
        number++;
    }
}
