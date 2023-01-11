public class IfLoopPractice //Class Declaration
{
    public static void main(String args[]) //Main method
    {
      //Numerical Operators
      //Addition: +
      //Subtraction: -
      //Multiplication: *
      //Division: /
      //Modulus: % (This is new, it gives the remainder when u divide the
      //first number by the second number, ex. 10 % 2 = 0 or 10 % 3 = 1
      
      //Conditional Operators
      //Less than and greater than: <, >
      //Less than or equal to: <=
      //Greater than or equal to: >=
      //Equal: ==
      //Not equal: !=
      
      //If statement
      if(3 > 2)
      {
        System.out.println("true statement");
      } 
      else if (5 > 4) 
      {
        System.out.println("true statement");
      }
      else
      {
        System.out.println("false statement");
      }
      
      //vs
      
      if(3 > 2)
      {
        System.out.println("true statement");
      }
      
      if (5 > 4) 
      {
        System.out.println("true statement");
      }
      else
      {
        System.out.println("false statement");
      }
      
      //The first one outputs true statement once, the second one outputs
      //it twice. This is because else if is skipped since the first if is
      //true.
      
      //While loops
      int counter1 = 0;
      while(counter1< 5)
      {
        System.out.println(counter1);
        counter1 = counter1 + 1;
      }
      //For loops
      for(int counter2 = 0; counter2 < 5; counter2 += 1)
      {
        System.out.println(counter2);
      }
      //Both loops print:
      //0
      //1
      //2
      //3
      //4
      //Additionally, while loops can be used for any boolean conditional
      //but for loops strictly work on a increment system. This leads to no
      //infinite loops, but limits for loops to a set number of iterations
      //while while statements can keep on going until a nonnumerical
      //condition is met, if wanted.
      
      //Assignment operators
      //counter *= 2 or counter = counter * 2, multiply and set counter as
      //double what it once was
      //counter /= 2 or counter = counter / 2, same thing except divide by 2
      //counter += 2 or counter = counter + 2, increases counter by 2
      //counter -= 2 or counter = counter - 2, decreases counter by 2
      //counter++ (increases counter by 1) counter--(decreases by one)
    }
}