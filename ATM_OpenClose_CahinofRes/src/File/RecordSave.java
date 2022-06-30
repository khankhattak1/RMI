
package File;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author BSE193121
 */
public class RecordSave {
    
    public RecordSave(){
    
    }
    
    public void saveRecord(String Record){
        
        //Variable Initialization
        File file;
        FileWriter fw; 
        BufferedWriter writer;
        
        //Exception Handling
        try{
            //File Creation with Path
            file = new File("D:\\OrderRecord.txt");
            
            if(!file.exists()){
                file.createNewFile();
            }
            
            fw = new FileWriter(file, true);
            writer = new BufferedWriter(fw);
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();    
            
            writer.write(dtf.format(now) + " " + Record + "\n");
            writer.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            System.out.println("Action Executed Finally");
        }
    }
}
