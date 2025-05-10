import java.util.*;
import java.net.*;
import java.io.*;

class tcpserver
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket s1 = new ServerSocket(1520);
            Socket s2 = s1.accept();

            DataInputStream dis;
            DataOutputStream dos;

            InputStream is;
            OutputStream os;

            is = s2.getInputStream();
            os = s2.getOutputStream();

            dis = new DataInputStream(is);
            dos = new DataOutputStream(os);

            Scanner sc = new Scanner(System.in);

            String str;
            do
            {
                System.out.println("Data Received:");
                str = dis.readUTF();
                System.out.println(str);

                // Factorial logic
                try {
                    int num = Integer.parseInt(str);
                    long fact = 1;
                    for(int i = 1; i <= num; i++) {
                        fact *= i;
                    }
                    str = "Factorial of " + num + " is " + fact;
                } catch(NumberFormatException e) {
                    str = "Invalid input. Please send a number.";
                }

                System.out.println("Data is send:");
                System.out.println(str);
                dos.writeUTF(str);
            }while(!str.equals("STOP"));

        }
        catch(Exception e)
        {
        }
    }
}
