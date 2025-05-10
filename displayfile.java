import java.io.*;

class DisplayFile {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("sample.txt");
            int a;
            char ch;

            do {
                a = fin.read();
                if (a != -1) {
                    ch = (char) a;
                    System.out.print(ch); 
                }
            } while (a != -1);

            fin.close(); 
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e1) {
            System.out.println("IO error: " + e1);
        }
    }
}
