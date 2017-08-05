package stack;

public class BASICoperations {
          node top;
          static class node{
        	  int data;
        	  node next;
        		  
          }
          BASICoperations(){
        	  top=null;
          }
          public static void main(String args[]){
        	  BASICoperations obj=new BASICoperations();
        	  obj.push(10);
        	  obj.push(26);
        	  obj.push(21);
        	  obj.push(23);
        	  System.out.println("stack");
        	  obj.print();
        	  obj.pop();
        	  obj.pop();
        	  
          }
          void push(int new_data){
        	  node temp=new node();
        	  if(top==null){
        		  temp.data=new_data;
        		  temp.next=null;
        		  top=temp;
        	  }
        	  else{
        		  temp.data=new_data;
        		  temp.next=top;
        		  top=temp;
        	  }
          }
        	  void pop(){
        		  if(top!=null){
        			  System.out.println(+top.data);
        			  top=top.next;
        		  }
        		  
          }
        	  void print(){
        		  node temp1=top;
        		 while(temp1!=null){
        			  System.out.println(+temp1.data);
        			  temp1=temp1.next;
        		  }
        	  }
}
