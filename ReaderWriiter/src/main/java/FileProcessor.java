/**
 * Created by Kevin on 2017/5/1.
 */
public abstract class FileProcessor implements IFileProcessor {
    public void openFile(){
        System.out.println("Open File");
    }

    public void closeFile(){
        System.out.println("Close File");
    }
}
