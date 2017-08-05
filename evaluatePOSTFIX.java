package stack;

import java.util.Scanner;

public class evaluatePOSTFIX {
	        int max;
	        int ch3;
            static int stk[];
           static int top=-1;
            evaluatePOSTFIX(int k){
    	          max=k;
    	       stk=new int[20];
          }
            public static void main(String args[]){
            	evaluatePOSTFIX obj=new evaluatePOSTFIX(10);
            	System.out.println("enter string");
            	Scanner in=new Scanner(System.in);
            	String str=in.next();
            	System.out.println("postfix expresion"+str);
            	obj.evaluate(str);
            	  System.out.println(+stk[top]);
            }
            public void push(int w){
              if(top!=max-1)
            	  stk[++top]=w;
              else
            	  System.out.println("stack is full");
            }
            public int pop(){
            	if(top==-1){
            		System.out.println("stack is empty");
            		return 0;
            	}
            	else{
            		 return stk[top--];
            }
            }
            public int peek(){
            	return top;
            }
            public int evaluate(String str1){
            	
            	Scanner in=new Scanner(System.in);
            	for(int index=0;index<str1.length();index++){
            		char chvalue=str1.charAt(index);
                    if(chvalue=='+'||chvalue=='-'||chvalue=='*'||chvalue=='/'||chvalue=='%'){
                   
                    		int  ch1=pop();
                    		int ch2=pop();
                    		switch(chvalue){
                    		case '+':ch3=ch1+ch2;
                    		           push(ch3);
                    		           break;
                    		case '-':ch3=ch2-ch1;
                    		         push(ch3);
                    		         break;
                    		case '*':ch3=ch1*ch2;
                    		         push(ch3);
                    		         break;
                    		case '/':ch3=ch2/ch1;
                    		         push(ch3);
                    		         break;
                    		case '%':ch3=ch2%ch1;
                    		         push(ch3);
                    		         break;
                    		         default:System.out.println("wrong entry");
                    		}
                    }
                    else{
                    	push(chvalue);
                    }
            	}
            	return ch3;
            }
          
} 




















