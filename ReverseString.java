import java.util.*;
  public class ReverseString{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      
      // input a string
      System.out.println("Enter a string: ");
      String str= sc.nextLine();
      
      //reverse the string
      String reversed= "";
      for(int i= str.length() - 1; i>=0; i--){
        reversed += str.charAt(i);
      }
      //output
      System.out.print("Reversed String: "+ reversed);
    }
  }



//// input:hello
//// output:olleh
