package devpack;

public class q2dev<T>{
    private  T anytype;

    public T getAnytype() {
        return anytype;
    }

    public void setAnytype(T anytype) {
        this.anytype = anytype;
    }

    @Override
    public String toString() {
        return "dev [anytype=" + anytype + "]";
    }
    
    
}
