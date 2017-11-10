/**
 * Created by pratikshetty on 11/10/17.
 */
public class VarArray {
    private int sum;
    private int[] arr;
    public VarArray(int n){
        this.sum = 0;
        this.arr = new int[n];
    }

    public VarArray(int sum, int arr[]){
        this.sum = sum;
        this.arr = arr;
    }

    public int getSum()
    {
        return sum;
    }

    public void setSum(int sum)
    {
        this.sum = sum;
    }

    public int getElement(int i)
    {
        return arr[i];
    }

    public void setElement(int i,int value)
    {
        arr[i] = value;
    }

    public int[] getArray()
    {
        return arr;
    }

    public void setArray(int arr[])
    {
        this.arr = arr;
    }
}
