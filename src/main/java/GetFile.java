import java.io.File;

/**
 * Created by ll on 17-12-10.
 */
public class GetFile {
    public static void main(String[] args) {
        getFiles("/home"," ");
    }

    public static void getFiles(String path, String tab){

        File file = new File(path);
        if (file.exists()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                System.out.println(tab+file1.getName());
                if (file1.isDirectory()){
                    getFiles(file1.getPath(),tab+"\t");
                }
            }
        }
    }
}
