/*Output Format

For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType
If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

n can't be fitted anywhere.
Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
*/

import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        //System.out.println(((int)(Math.pow(2,63)))*-1);
        //System.out.println(((int)(Math.pow(2,63))));
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=((long)(Math.pow(2,31)))*-1 && x<=((long)(Math.pow(2,31))))System.out.println("* int");
                if(x>=((long)(Math.pow(2,63)))*-1 && x<=((long)(Math.pow(2,63))))System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
