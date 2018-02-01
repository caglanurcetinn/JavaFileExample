import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("data.txt");

            int c;
            while((c = fileInputStream.read()) != -1){
                //write from test.txt to data.txt
                fileOutputStream.write(c);
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
