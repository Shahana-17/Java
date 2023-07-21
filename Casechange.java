package pc;
import java.util.*;
public class Casechange {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String in = sc.nextLine();
       char strArr[] = in.toCharArray();
       for (int i = 0; i < strArr.length; i++) {
               if (strArr[i] >= 'a' && strArr[i] <= 'z') {
            	   if((strArr[i]=='a'||strArr[i]=='e'||strArr[i]=='i'||strArr[i]=='o'||strArr[i]=='u') ) {
                       strArr[i] = (char)((int) strArr[i] - 32);
               }}
       }
       for (int i = 0; i < strArr.length; i++) {
               System.out.print(strArr[i]);
       }
}}

