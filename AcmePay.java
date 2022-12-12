import java.util.*;

public class AcmePay {
    public static void main(String[] args) throws Exception 
    {
        int retire = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter shift - 1 , 2 , or 3");
        int shift = input.nextInt();

      //ask for hours worked
      System.out.println("How many hours have you worked?");
      int hours = input.nextInt();
      System.out.println(); 
      
      //ask for participation in retirement plan if the second or third shift are selected
      if (shift == 2 || shift == 3){

      
      System.out.println("Would you like to participate in our retirement plan? Enter 1 for yes.");
        int choice = input.nextInt();
      
      }
        double rate = payRate (shift);
        double gross = grossPay(rate, hours);
      
        
        System.out.println("Shift worked: " + shift);
    
        
        System.out.println("Hourly pay rate: $" + rate);
       
        hoursBreakdown(rate, hours);
        retirementPay(shift, retire, gross);
    }
 
    public static double payRate (int shift)
    {
        //fill in the details 
        double rate = 1;
        if (shift==1)
        {
          rate = 17.00;
        }
        if (shift==2)
        {
          rate = 18.50;
        }
        if (shift==3)
        {
          rate = 22.00;
        }
        return rate;
    }

    public static void hoursBreakdown(double rate, double hours)
    {
        //fill in details    
        double overtime;
        System.out.println("Hours worked: " + hours);
        if (hours > 40)
        {
          overtime = (((hours-40)*rate)*1.5);
        }
        else 
        {
          overtime = 0;
        }
        System.out.println("Overtime hours worked: " + (int) (hours - 40));
        
        System.out.println("Overtime pay: $" + (overtime));
    }
      
    public static double grossPay(double rate, double hours)
    {
        //fill in details 
        
        double overtime;
        if (hours > 40)
        {
          overtime = (((hours-40)*rate)*1.5);
        }
        else 
        {
          overtime = 0;
        }
        double pay = (rate*hours);
        double gross = (pay + overtime);

       
        
        //System.out.println("Gross pay: $" + gross);
        return pay;
    }

    public static void retirementPay(int shift, int choice, double gross)
    {
        //fill in details
        double retire = 0;
        double netPay = gross;
        
        if (shift != 1 && choice == 1)
        {
        netPay = gross*.97;
        retire = gross*.03;
        }
        else if (shift==1||choice !=1)
        {   
            retire = 0;
            netPay = gross;
        }

        System.out.println("Retirement Deduction: " + retire);
        System.out.println("Net Pay: $" + netPay);
      
    }
}
