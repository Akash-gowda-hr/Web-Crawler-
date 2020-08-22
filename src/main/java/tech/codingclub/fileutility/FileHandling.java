package tech.codingclub.fileutility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {

    public static ArrayList<String> readFileAsList(String path)
    {
        File file = new File(path);
        ArrayList<String> arraylist = new ArrayList<String>();

        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String s = sc.nextLine();
                arraylist.add(s);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally
        {
            if(sc != null)
            {
                sc = null;
            }
        }

        return arraylist;

    }


}
