
package outwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.out;


public class InRead {


    public static void main(String[] args) {
try{
    FileReader fr = new FileReader("customer1.txt");
    BufferedReader br = new BufferedReader(fr);
    String str;
    while( (str = br.readLine()) != null){
        out.println(str + " \n");
    } br.close();
} catch (IOException e){
    System.out.println("File Error");
}
    }
    
}
