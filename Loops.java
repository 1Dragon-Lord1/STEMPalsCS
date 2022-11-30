public class Loops
{
    public static void main (String[] args) 
    {
        //Prints out: 5
        int num = 5;
        System.out.println(num);
        //Loops
        //1. Counter (counts the number of times repeated)
        int i = 0; //i stands for increment
        while (i < 5) //2. Condition
        //3. Code Block
        {
            System.out.print(i);
            i = i + 1; //or i++, increases the counter
        }
        //Prints out: 01234
        
        //Practice Loop Problem
        i = 0;
        while (i < 11) //11 because it goes up to 10, but stops before it prints 11
        {
            System.out.print(i + " ");
            i++;
        }
        //Prints out: 0 1 2 3 4 5 6 7 8 9 10
        //Challenge: print out even numbers up to 8
        i = 0;
        while (i <= 4)
        {
            System.out.print(i*2);
            i++;
        }
        //Prints out: 02468
    }
}
