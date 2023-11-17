/** Java Programming<br>
* Show Time<br>
* The HelloWorld class will print the current time to the console<br>
@version 1.0
@author Samantha Machado
*/

import java.util.Calendar;      

public class ShowTime 
{
    /**
    * The main method will run our single line of code, which will output the current time
    * @param args These are command-line arguments supplied to the program
    */
   public static void main(String[] args) 
   {
      System.out.println(Calendar.getInstance().getTime());
   }
}