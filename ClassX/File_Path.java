package ClassX;

import java.util.Scanner;
class File_Path
{public static void main(String args[])
    {Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path: ");
        // Example: C:\\PKM\Abd.jpg
        String str = sc.next();
        int p1 = str.lastIndexOf('\\');
        int p2 = str.lastIndexOf('.');
        String path = str.substring(0, p1);
        String file = str.substring(p1 + 1, p2);
        String ext = str.substring(p2 + 1);
        System.out.println("path = " + path + "\nfile = " + file + "\next = " + ext);
    }
}