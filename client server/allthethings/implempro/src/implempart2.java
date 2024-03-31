import propart1.PersistenceMechanism;

import java.util.Scanner;

import propart1.BigdataSystem;
import propart1.DatabaseSystem;
import propart1.FileSystem;

public class implempart2 {

    public static void main(String[] abc){
        
        Scanner  sc = new Scanner(System.in);

        PersistenceMechanism[]  pm = new PersistenceMechanism[3];
        pm[0] = new BigdataSystem();
        pm[1] = new DatabaseSystem();
        pm[2] = new FileSystem();

        for(int i=0;i<3;i++){
            String ref = sc.nextLine();
            pm[i].writeData(ref);
            System.out.println(pm[i].readData());
        }
        // for(int j=0;j<3;j++){
        //     System.out.println(pm[j].readData());
        // }

        //creating object

    }
}