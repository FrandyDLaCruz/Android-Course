//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
        Map<String, Integer> nameAndPhone = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            
            nameAndPhone.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            
            if(nameAndPhone.containsKey(s)){
                System.out.println(s + "=" + nameAndPhone.get(s));
            }
            else
                System.out.println("Not found");
		}
	}
}