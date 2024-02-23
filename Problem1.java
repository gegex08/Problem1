
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
    
    
    //These lines were added for input for letter A  
    System.out.println("Enter a number for the product");
    int c = input.nextInt();// compile error fixed: declaring c as int
    
    int product = 2;//compile error fixed: need to declare the type of variable and give it a value
    
    while (  c <= 5 ){

    product *= c;

    System.out.println(product);

    ++c;
    }//compile error fixed: missing bracket
    
    ////////////////////////////////////////////////////////////////////////
    //letter B
    
    System.out.println("Enter 1 for female or 0 for male");
    int gender = input.nextInt();
   
    if ( gender == 1 )
    {

       System.out.println( "Woman" );
    }
    else if(gender ==0){//logic error: need to add if else statement for when user input 0
   
      System.out.println( "Man" );
    }
    
    
    ///////////////////////////////////////////////////////////////////////////
    //letter C
    System.out.println("Enter number for ");
    int z = input.nextInt();
    int sum = 1;
    while ( z >= 0 && z<=10){//logic error fixed: beginning and braces needed and runtime error fixed: did not have an ending

    }//brace needed for problem 3
    System.out.println(sum);
    }//needed an extra closing brace   
}
    
