package easy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Create a program that will ask the users name, age, and reddit username. have it tell them the
 * information back, in the format: * your name is (blank), you are (blank) years old, and your
 * username is (blank) for extra credit, have the program log this information in a file to be
 * accessed later.
 */
public class Challenge1 {

   private String  name;
   private int     age;
   private String  userName;
   private Scanner sc;

   public static void main(String[] args) {
      Challenge1 c = new Challenge1();
      c.printOutput();
      c.saveFile();

   }

   private void saveFile() {
      try {
         File file = new File("C:\\Users\\stuart\\git\\DailyProgrammer\\DailyProgrammer\\printout\\challenge1.txt");
         if (!file.exists()) {
            file.createNewFile();
         }
         FileWriter writer = new FileWriter(file.getAbsoluteFile());
         BufferedWriter bufWriter = new BufferedWriter(writer);
         bufWriter.write("Your name is " + name + ", you are " + age + " years old, and your user name is " + userName);
         bufWriter.close();
      } catch (IOException ioe) {
         ioe.printStackTrace();
      }
   }

   public Challenge1() {
      sc = new Scanner(System.in);
      getName();
      getAge();
      getUserName();
   }

   public void printOutput() {
      System.out.printf("Your name is %s,  you are %d years old, and your user name is %s", name, age, userName);
   }

   private void getUserName() {
      System.out.println("Please enter your user name:");
      userName = sc.next();
   }

   private void getAge() {
      System.out.println("Please enter your age:");
      age = sc.nextInt();
   }

   private void getName() {
      System.out.println("Please enter your name:");
      name = sc.next();
   }

}
