package reserverParentheses;

import java.util.Stack;

public class reserveParentheses {
	private char d_par;
	   private char i_par;
	   String linea = "";
	    
	  
	            public  String Parentheses(){
	                
	                 Stack<Character> stack = new Stack<Character>();
	        for (int i = 0; i < linea.length(); i++) {
	                
	                    if (linea.charAt(i) == d_par )
	                        stack.push(d_par);
	                    else if (linea.charAt(i) == d_par){
	                        if (stack.empty())
	                                                  
	                        if (stack.pop() != i_par)
	                     return "false";
	                }
	                }
	                    return "";
	            }
	            
	            public static String reverseParentheses(String s){
					for (int i = 0; i<s.length(); i++) {
						int idex = i;
						
						for (int j = i +1 ; j<s.length(); j++) {
							if(val[j]< val[idex])
								idex = j;
						}
					}
	            	
	            	return s;
	            	
	            }

}
