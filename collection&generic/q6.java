import java.lang.*;
import java.io.*;
import java.util.*;
class myclass implements Serializable{
    private String  name;
    private int age;
    private double salary;
    
    public myclass(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "myclass [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }

    
    

}


public class q6 {
    public static void main(String[] args)throws Exception {
        // create object 
        myclass obj1 = new myclass("ganesh",23,400000);
        myclass obj2 = new myclass("brijesh",29,1200000);
        myclass obj3 = new myclass("lokesh",20,300000);
        myclass obj4 = new myclass("shubham",26,700000);
        myclass obj5 = new myclass("yash",25,600000);

        List<myclass> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        try{        
        FileOutputStream fos = new FileOutputStream("q6.txt");
        try{ObjectOutputStream oos = new ObjectOutputStream(fos);
            try{oos.writeObject(list);
            }catch(IOException i){
                i.printStackTrace();
            }
             
        }catch(IOException ie){
            ie.printStackTrace();
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Data written successfully!");
        List<myclass> ref = null;
        try{        
            FileInputStream fis = new FileInputStream("q6.txt");
            try{ObjectInputStream ois = new ObjectInputStream(fis);
                try{
                    ref = (List<myclass>)ois.readObject();
                }catch(ClassNotFoundException i){
                    i.printStackTrace();
                }
                 
            }catch(IOException ie){
                ie.printStackTrace();
            }
            }catch(Exception e){
                e.printStackTrace();
            }
            Iterator itr = ref.iterator();
             while(itr.hasNext()) {
                 System.out.println(itr.next());
                 
             }

    }
    
}
