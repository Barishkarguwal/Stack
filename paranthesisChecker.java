package stack;

import java.util.Scanner;

public class paranthesisChecker {
                          int max;
                          char arr[];
                          int top=-1;
                          int del;
                          
                          paranthesisChecker(int k){
                        	  max=k;
                        	  arr=new char[20];
                          }
                          public static void main(String args[]){
                        	  paranthesisChecker obj=new  paranthesisChecker(20);
                        	  Scanner in=new Scanner(System.in);
                        	  String str=in.next();
                        	  System.out.println("string is"+str);
                        	  System.out.println("Balanced paretheses or not"+obj.checker(str));
                          }
                          public void push(char ch){
                        	  if(top!=max-1){
                        		  arr[++top]=ch;
                        	  }
                        	  else{
                        		  System.out.println("stack overflow");
                        	  }
                          }
                          public char pop(){
                        	  if(top==-1){
                        		  System.out.println("stack underflow");
                        		  return 0;
                        	  }
                        	  else{
                        		 return arr[top--];
                        	  }
                          }

                          public boolean checker(String str1){
                        	  int index=0;
                        	  while(index<str1.length()){
                        		  char chvalue=str1.charAt(index);
                        		  if(chvalue=='['||chvalue=='{'||chvalue=='('){
                        			  push(chvalue);
                        		  }
                        		  if(chvalue=='}'||chvalue==')'||chvalue==']'){
                        			 
                        			  if(top==-1){
                        				  System.out.println("hhh");
                        				  return false;
                        			  }
                        			  else {
                        				  del=pop();
                        				  if(del!='['&&del!='{'&&del!='('){
                        					  System.out.println("sad");
                        					  return false;
                        				  }
                        			  }
                        
                        		  }
                        		  index++;
                        		}
                        	  if(top==-1)
                        		  
                        		  return true;
                        		  
                        	else 
                        		System.out.println("da");
                        		return false;
                        	  }
              }



















