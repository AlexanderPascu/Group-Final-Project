 
 import java.util.Scanner;
 
 public class CountWords{
 
 public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String x = scan.nextLine();
        int count = 0;
        

        for (int i = 0; i < x.length(); i++){
            if (Character.isLetter(x.charAt(i))){
                    count++;
              while (i<x.length() && Character.isLetter(x.charAt(i))){
              i++;
            }
                }
                
            }
            System.out.println("There are " + count + " words in the string");
        }
  
    }
