package placements;
import java.util.*;
public class Removalofspecialchar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch =str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z'||ch[i] >= 'a' && ch[i] <= 'z'||ch[i]>= '0' && ch[i] <= '9') {
				continue; 
			}
            else {
                count++;
        }
		}
		System.out.print(count);
		}
	}

