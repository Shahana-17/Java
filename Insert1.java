package placements;
import java.util.*;
public class Insert1 {

	public static int[] insert(int n, int arr[],
            int x, int pos)
{
int i;
int a[] = new int[n + 1];
for (i = 0; i < n + 1; i++) {
if (i < pos-1)
a[i] = arr[i];
else if (i == pos-1)
a[i] = x;
else
a[i] = arr[i-1];
}
return a;
}
public static void main(String[] args)
{
int n = 10;
int i;
int arr[]={1,2,3,4,5,6,7,8,9,10};
System.out.println("old array:"+ Arrays.toString(arr));
int x = 5;
int pos = 2;
arr = insert(n, arr, x, pos);
System.out.println("new array:"+Arrays.toString(arr));
}
}