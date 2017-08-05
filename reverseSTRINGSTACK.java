package stack;

import java.util.Scanner;

public class reverseSTRINGSTACK {
              int top=-1;
              int stk[];
              int max;
              reverseSTRINGSTACK(int k){
            	  max=k;
            	  stk=new int[20];
              }
              public static void main(String args[]){
            	  reverseSTRINGSTACK obj=new reverseSTRINGSTACK(20);
            	  Scanner in=new Scanner(System.in);
            	  System.out.println("enter string");
            	  String k=in.next();
                  obj.reverse(k);
            	  }
             void reverse(String str){
            	 String str1="";
            	 for(int index=0;index<str.length();index++){
            		 char chvalue=str.charAt(index);
            		 push(chvalue);
            	 }
            	 for(int a=0;a<str.length();a++){
            		 str1 =str1+pop();
            	 }
            	 System.out.println(str1);
             }
             void push(char str2){
            	 if(top!=max-1){
            		stk[++top]=str2;
            	 }
            	 else{
            		 System.out.println("full");
            	 }
             }
             char pop(){
            	 if(top==-1)
            		 System.out.println("empty");
            	 else
            		 return (char)stk[top--];
            	 
            	 return 0;
             }
            
              
}
