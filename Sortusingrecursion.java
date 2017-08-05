package stack;
import java.util.*;

public class Sortusingrecursion {
                  public static void main(String args[]){
                	  Stack<Integer> s=new Stack<>();
                	  s.push(12);
                	  s.push(35);
                	  s.push(18);
                	  s.push(98);
                	  s.push(30);
                	  System.out.println(Arrays.toString(s.toArray()));
                	  sort(s);
                	  System.out.println(Arrays.toString(s.toArray()));
                  }
                  public static void sort(Stack<Integer> stack){
                	  if(!(stack.isEmpty())){
                		  int top=stack.pop();
                		  sort(stack);
                		  sortinorder(stack,top);
                	  }
                  }
                  public static void sortinorder(Stack<Integer> s,int popped){
                	  if(s.isEmpty()){
                		  s.push(popped);
                	  }
                	  else if(s.peek()>=popped){
                		  s.push(popped);
                	  }
                	  else{
                		  int temp=s.pop();
                		  sortinorder(s,popped);
                		  s.push(temp);
                	  }
                  }
}
