package stack;

public class stackusingarray {
                    int top=-1;
                    int arr[];
                    int max;
                    
                    stackusingarray(int k){
                    	max=k;
                    	arr=new int[max];
                    }
                    public static void main(String args[]){
                    	stackusingarray obj=new stackusingarray(8);
                    	obj.push(4);
                    	obj.push(5);
                    	obj.push(7);
                    	obj.push(9);
                    	obj.push(1);
                    	obj.push(12);
                    	obj.push(18);
                    	obj.push(11);
                    	obj.pop();
                    	obj.pop();
                    	obj.pop();
             
                    	}
                    void push(int data){
                    	if(top!=max-1){
                    		arr[++top]=data;	
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
                    	System.out.println(arr[top--]);
                    	}
                    }
                    
                    	
                    
}
