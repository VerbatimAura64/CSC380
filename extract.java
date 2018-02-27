package outwrite;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class extract {
        
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<String, String> map = new HashMap<String, String>();
        try {
        BufferedReader in = new BufferedReader(new FileReader("customer1.txt"));
        String line = "";
        while ((line = in.readLine()) != null) {
            String parts[] = line.split(":");
            map.put(parts[0], parts[1]);
        }
        
        in.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(map.toString());
    }
}
        
