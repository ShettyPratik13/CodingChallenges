/**
 * Created by pratikshetty on 11/9/17.
 */
public class House {
    private int prev;
    private int value;
    private int next;

    public House(int prev, int value, int next)
    {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

    public int getPrevious()
    {
        return prev;
    }

    public int getValue()
    {
        return value;
    }

    public int getNext()
    {
        return next;
    }
}
