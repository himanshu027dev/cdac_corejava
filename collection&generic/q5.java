import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class MyNum implements Serializable{
    private int num;
    public MyNum(int num){
        this.num=num;
    }
    @Override
    public String toString() {
        return "MyNum [num=" + num + "]";
    }
    

}

public class q5 {
    public static void main(String[] args) {
        MyNum mn1 = new MyNum(1);
        MyNum mn2 = new MyNum(2);
        MyNum mn3 = new MyNum(3);
        MyNum mn4 = new MyNum(4);
        MyNum mn5 = new MyNum(5);
    
        List<MyNum> l = new ArrayList<>();
        l.add(mn1);
        l.add(mn2);
        l.add(mn3);
        l.add(mn4);
        l.add(mn5);

        try{        
            FileOutputStream fos = new FileOutputStream("q5.txt");
            try{ObjectOutputStream oos = new ObjectOutputStream(fos);
                try{oos.writeObject(l);
                }catch(IOException i){
                    i.printStackTrace();
                }
                 
            }catch(IOException ie){
                ie.printStackTrace();
            }
            }catch(Exception e){
                e.printStackTrace();
            }
        
            List<MyNum> ref = null;
        
          try{        
            FileInputStream fis = new FileInputStream("q5.txt");
            try{ObjectInputStream ois = new ObjectInputStream(fis);
                try{
                    ref = (List<MyNum>)ois.readObject();
                }catch(ClassNotFoundException i ){
                    i.printStackTrace();
                }
                 
            }catch(IOException ie){
                ie.printStackTrace();
            }
            }catch(Exception e){
                e.printStackTrace();
            }
            
            Iterator<MyNum> itr = ref.iterator();
            while(itr.hasNext()){
            System.out.println(itr.next());  
            }


    }
    
}
