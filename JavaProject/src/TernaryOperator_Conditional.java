public class TernaryOperator_Conditional {
    public static void main(String[] args) {
        int number = 20;
        //using ternary operator here
        String output=(number%2==0)?"even number":"odd number";
        System.out.println(output);
    }
}

// Code Breakdown
/*1. Variable Declaration:
int number = 20;
=> This line declares an integer variable number and initializes it with the value 20.*/

/*2. Ternary Operator:
String output = (number % 2 == 0) ? "even number" : "odd number";
=> This line uses the ternary operator to determine whether the number is even or odd. The ternary operator is a 
compact form of the if-else statement.
Condition: number % 2 == 0
This checks if the remainder when number is divided by 2 is 0. If true, it means the number is even.
True Part: "even number"
This is the value assigned to output if the condition is true.
False Part: "odd number"
This is the value assigned to output if the condition is false.
So, in this case, since 20 % 2 == 0 is true, output will be assigned the value "even number".*/

/* 3. Output Statement:
System.out.println(output);
This line prints the value of output to the console. In this case, it will print:
even number. */

