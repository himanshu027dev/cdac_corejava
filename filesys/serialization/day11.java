package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student{
    private  int rollno;
    private  String name;
    private  String qualification;
    private  String hobbies;
    private  String bloodgroup;
    private  String emailid;

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getHobbies() {
        return hobbies;
    }
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
    public String getBloodgroup() {
        return bloodgroup;
    }
    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }
    public String getEmailid() {
        return emailid;
    }
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public String toString(){
        return "roll no.="+ rollno+",name =" + name+",qualification = " +qualification+",hobbies="+hobbies+",bloodgroup ="+bloodgroup+",email ="+emailid ;
    }
}
class hidem extends student implements Externalizable{
    public String toString(){

    }
}

public class day11 {
    public static void main(String[] args) throws Exception {
        
       car c =new car();
       Engine e = new Engine();
       e.setType("v8");
       e.setSpeed(240);
       c.setModelname("Audi A6");
       c.setEngine(e);
       
        
        FileOutputStream fos = new FileOutputStream("car&engine.txt");  //create object of fileoutputstream to write

        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(c);
        

         

        

         FileInputStream fis = new FileInputStream("car&engine.txt");

         ObjectInputStream ois =new ObjectInputStream(fis);
         
          c = (car)ois.readObject();
          
         System.out.println(c.toString());
         


        
    
    }
}