package propart1; 

public class DatabaseSystem implements PersistenceMechanism {
    String str;
    public void writeData(String ref){
        
        this.str = ref;
        System.out.println(" databasedata has been wrriten");
    }
	public String readData(){
        System.out.println(str);
        return str;
    }

}
