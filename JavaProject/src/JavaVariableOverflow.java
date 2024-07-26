public class JavaVariableOverflow {
    public static void main(String[] args) {
        //overflow
        int a = 150;
        /*
         * int a = 150;: This declares an integer variable a and initializes it with the value 150. 
         * In Java, the int type can store values from -2,147,483,648 to 2,147,483,647, so 150 is well within this range.
         */
        byte b =(byte)a;  
        /*
         * Type Casting: The integer value 150 is being cast to a byte. The byte type in Java can hold values from -128 to 127.
         * Overflow: When you cast a value from a larger type (int) to a smaller type (byte), if the value exceeds the range of the 
         * smaller type, it results in overflow. 
         * This means the value is wrapped around within the range of the target type.
         */
        System.out.println(a); //it shows 150 as a result
        System.out.println(b);
        /*
         *Calculation: To understand the overflow, you need to consider how the value wraps around. 
         In this case:The range of byte is -128 to 127, which has a total of 256 possible values.
         150 is 150 - 256 = -106 away from 127 (the maximum byte value). 
         Hence, 150 in byte representation will wrap around and result in -106.
         */
    }
}
