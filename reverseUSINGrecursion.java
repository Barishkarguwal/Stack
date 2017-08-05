package stack;

public class reverseUSINGrecursion {
                   int top=-1;
                   int stk[];
                   int max;
                   reverseUSINGrecursion(int k){
                	   max=k;
                	   stk=new int[k];
                   }
                   public static void main(String args[]){
                	   reverseUSINGrecursion obj=new reverseUSINGrecursion(5);
                       obj.push(5);
                       obj.push(4);
                       obj.push(3);
                       obj.push(2);
                       obj.push(1);
                       System.out.println("after reverse");
                       obj.reverse();
                	   
                   }
                   public void reverse(){
                	   
                   }
                   
                   public void push(int ch){
                	   if(top!=1)
                		   stk[++top]=ch;
                	   
                	   else
                		   System.out.println("stack underflow");
                   }
                   public int pop(){
                	   if(top==-1)
                		   System.out.println("stack underflow");
                	   
                	   else
                		   return stk[top--];
                	   
                	   return 0;
                	   
                   }
                   
}
