package stack;

import java.util.Scanner;
import java.lang.*;

public class infixTOpostfix {
                    int max;
                    char arr[];
                    int top=-1;
                    infixTOpostfix(int k){
                    	max=k;
                    	arr=new char[20];
                    }
                    public static void main(String args[]){
                    	infixTOpostfix obj=new infixTOpostfix(15);
                    	System.out.println("enter string");
                    	Scanner in=new Scanner(System.in);
                    	String str=in.next();
                    	System.out.println("infix expression is:"+str);
                    	System.out.println("postfix expression is:"+obj.inftopost(str));
                    			}
                    public void push(char char1){
                    	if(top!=max-1){
                    		arr[++top]=char1;
                    	}
                	else{
                		System.out.println("array is full");
                	}
                }
                void pop(){
                	if(top==-1){
                		System.out.println("empty");
                	}
                	else{
                  top--;
                	}
                    }
                Character peek(){
                	if(top==-1)
                		return 0;
                	
                	else
                	return arr[top];
                }
                public int priority(char chV){
                	if(chV=='+'||chV=='-'){
                		return 1;
                	}
                	
                	if(chV=='*'||chV=='/'||chV=='%'){
                	return 2;
                	}              	
                	return 0;
                }
                public String inftopost(String infix){
                	char  chvalue;
                	String postfix="";
                	for(int index=0;index<infix.length();index++){
                		chvalue=infix.charAt(index);
                		if(chvalue=='('){
                			push('(');
                		}
                		else if(chvalue==')'){ 
                			Character ch=peek();
                			while(!(ch.equals('('))&&!(isEmpty())){
                				postfix =postfix+ch.charValue();
                				pop();
                				ch=peek();
                			}
                			pop();
                		}
                		else if(chvalue=='+'||chvalue=='-'||chvalue=='*'||chvalue=='/'){
                			Character ch=peek();
                			if(isEmpty()){
                				push(chvalue);
                					}
                			else{
                				while(!(isEmpty())&&!(ch.equals('('))&&priority(chvalue)<=priority(ch)){
                					pop();
                					postfix +=ch.charValue();
                					ch=peek();
                				}
                				push(chvalue);
                			}
                		}
                		
                	else{
                		postfix +=chvalue;
                	}
                	}
                	Character ch=peek();
                	while(!(ch.equals('('))){
                  pop();
                  postfix =postfix +ch.charValue() ;
        		      ch=peek();
                	}
                	return postfix;
}
				private boolean isEmpty() {
					// TODO Auto-generated method stub
					return false;
				}
}
