package propart1; 

public class FileSystem implements PersistenceMechanism {
    String str;
    public void writeData(String ref){
        
        this.str = ref;
        System.out.println(" data has been wrriten");
    }
	public String readData(){
        System.out.println(str);
        return str;
    }

}
