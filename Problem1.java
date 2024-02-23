
package problem1;

import java.util.Scanner;

/**
 *
 * @author geneivaocampo
 */
public class Problem1 {

    public static void main(String[] args) {
    
    //These lines were added for inputs   
    Scanner input = new Scanner(System.in);
    
    //Part A
        System.out.println("Part A:");
    //These lines were added for input for letter A  
    System.out.println("Enter a number for the product");
    int c = input.nextInt();// compile error fixed: declaring c as int
    
    int product = 2;//compile error fixed: need to declare the type of variable and give it a value
    
    while (  c <= 5 ){

    product *= c;

    System.out.println(product);

    ++c;
    }//compile error fixed: missing bracket
        System.out.println("");//prints whitespace
        
    ////////////////////////////////////////////////////////////////////////
    //letter B
        System.out.println("Part B: ");
    System.out.println("Enter 1 for female or 0 for male");
    int gender = input.nextInt();
   
    if ( gender == 1 )
    {

       System.out.println( "Woman" );
    }
    else if(gender ==0){//logic error: need to add if else statement for when user input 0
   
      System.out.println( "Man" );
    }
        System.out.println("");//priints whitespace
        
    
    ///////////////////////////////////////////////////////////////////////////
    //letter C
        System.out.println("Part C:");
    System.out.println("Enter number for ");// ask user from imput
    int z = input.nextInt();//enter interger in which program is set to start
    int sum = 1;// set sum = 1
    while ( z >= 0 && z <=5){//logic error fixed: beginning and braces needed and runtime error fixed: did not have an ending
    sum += z; //sum will now equal to sum+1
    System.out.println(sum);// print new value for sum
    z++;//repeat this loop while condition is met
    }//brace needed for problem 3
    
    }//needed an extra closing brace   
}
    
