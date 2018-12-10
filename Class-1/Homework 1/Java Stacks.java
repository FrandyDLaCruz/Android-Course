import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
            Stack<Character> stack = new Stack<Character>();
			String input=sc.next();
            //Complete the code
            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) == '(' || input.charAt(i) == '{'|| input.charAt(i) == '['){
                    stack.push(input.charAt(i));
                }
                else if(stack.isEmpty())
                    stack.push(input.charAt(i));
                else {
                    char popped = stack.pop();
                    
                    if((input.charAt(i) == '(' && popped != ')') || (input.charAt(i) == '{' && popped != '}') || (input.charAt(i) == '[' && popped != ']')){
                        stack.push(popped);
                    }
                }                    
            }        
            System.out.println(stack.isEmpty());
		}           
	}  
}
