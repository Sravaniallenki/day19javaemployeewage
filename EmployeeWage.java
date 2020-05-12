public class EmployeeWage
    {
      public static void main(String[] args)
      {
          int Perhr=20;
          int emphrs=0;
         int full_time = 1;
          System.out.println("WELCOME");
          double empCheck = Math.floor(Math.random() * 10) % 2;

          if (empCheck == full_time)
            System.out.println("Employee is Present");
          else
            System.out.println("Employee is Abscent");
       }
    }

