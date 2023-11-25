import java.util.Scanner;
import java.io.*;

public class Main
{
   public static void main(String[] args) throws IOException
   {

      //creates scanner object
      Scanner keyboard = new Scanner(System.in);
     
      //gets name of input file
      System.out.print("What is the name of the first file?");
      String firstFileName = keyboard.nextLine();

      //gets name of ouput file
      System.out.print("what is the name of the second file?");
      String secondFileName = keyboard.nextLine();

     //opens input file
     File fileOne = new File(firstFileName);
     Scanner inputFile = new Scanner(fileOne);
     
     //Opens output file.
     PrintWriter outputFile = new PrintWriter(secondFileName);

     //reads the input and stores it in line
     while (inputFile.hasNext())
     {
        String line = inputFile.nextLine();
        //changes line to upper case and stores it in ouputLine
        String newLine = (line.toUpperCase());
        //prints ouputLine into output file
        outputFile.println(newLine);
       
     }
      inputFile.close();
      outputFile.close();



     
   }
}
