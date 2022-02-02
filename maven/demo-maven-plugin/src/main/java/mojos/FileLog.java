package mojos;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.io.*;
import java.util.Properties;

public class FileLog {

    public void createFile()  {

        File fileLog = new File("D:fileLog.txt");
        try {
            if (fileLog.createNewFile()) {
                System.out.println("fileLog.txt file created");
            } else
                System.out.println("file.txt file already exists");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printData( final String groupId, final String artifactId, final String version) throws FileNotFoundException {
       Properties prop = new Properties();

        PrintWriter pw = new PrintWriter("D:fileLog.txt");
        pw.println(groupId + artifactId + version);
    }


}
