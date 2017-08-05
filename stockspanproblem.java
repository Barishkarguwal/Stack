package stack;
import java.util.*;

public class stockspanproblem {
                  public static void main(String args[]){
                        int price[]={100,80,60,70,60,75,85};
                      
                         stockspan(price);
                  }
                  public static void stockspan(int price[]){
                	  Stack<Integer> stack=new Stack<>();
                	  int stock[]=new int[price.length];
                	  
                	  for(int i=0;i<price.length;i++){
                		  stock[i]=1;
                		  if(stack.isEmpty()||stack.peek()>price[i]){
                			  stack.push(price[i]);
                		  }
                		  if(stack.peek()<price[i]){
                			  int j=i-1;
                			  while(!stack.isEmpty()&&stack.peek()<price[i]){
                				  stack.pop();
                				  stock[i]=stock[i]+stock[j];
                				  j--;
                			  }
                			  stack.push(price[i]);
                		  }
                	  }
                	  for(int k=0;k<price.length;k++){
                		  System.out.println(price[k]+"........"+stock[k]);
                	  }
                  }
}
