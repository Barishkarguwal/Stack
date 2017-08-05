package stack;

import java.util.Scanner;

public class nextGREATERelement {
                         int max;
                         int top=-1;
                         int stk[];
                         
                         nextGREATERelement(int k){
                        	 max=k;
                        	 stk=new int[k];
                        	 
                         }
                         public static void main(String args[]){
                        	 int arr[];
                        	 arr=new int[4];
                        	 nextGREATERelement obj=new nextGREATERelement(4);
                        	 Scanner in=new Scanner(System.in);
                        	System.out.println("enter array");
                        	for(int i=0;i<4;i++){
                        		arr[i]=in.nextInt();
                        	}
                        	obj.nextgreater(arr);
                        	 
                         }
                         void nextgreater(int[] arr1){
                        	 int next;
                        	 int i=0;
                        	 int element;
                       
                        	 push(arr1[0]);
                        	 for(i=1;i<4;i++){
                        		 next=arr1[i];
                        		 
                        		 if(top!=-1){
                        			 element=pop();
                        			 
                        			 while(element<next){
                        				 System.out.println(element +".........." +next);
                        				 if(top==-1)
                        					 break;
                        				 
                        				 element=pop();
                        			 }
                        			 
                        			 if(element>next)
                        				push(element); 
                        		 }
                        		 push(next);                                   /*5 9 6 11*/
                        	 }
                        	 while(top!=-1){
                        		 element=pop();
                        		 next=-1;
                        		 System.out.println(element +"........."+next);
                        	 }
                         }
                  public void push(int ch){
                	  if(top!=max-1)
                		  stk[++top]=ch;
                	  
                	  else
                		  System.out.println("stack overflow");
                		  
                  }
                  public int pop(){
                	  if(top==-1){
                		  System.out.println("stack underflow");
                	  return 0;}
                	  
                	  else{
                		  return stk[top--];
                	  }                  }
}