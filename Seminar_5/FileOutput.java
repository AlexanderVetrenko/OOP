import java.io.File;
import java.io.FileWriter;

public class FileOutput implements FileOutputHelper {
    String pt;

    public FileOutput(String pt) {
        this.pt = pt;
    }

    @Override
    public void write(PhoneBook b) {
        File fl = new File(pt);
        try(FileWriter fw = new FileWriter(fl, false)){
            for (Contact item : b.getLs()) {
                fw.write(item.getFullNm());
                fw.write(":");
                fw.write(item.getPhone());
                fw.write("\n");
            }
            fw.flush();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }


    
}
