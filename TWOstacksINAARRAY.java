package stack;

public class TWOstacksINAARRAY {
                       static int max;
                        int top1,top2;
                        int arr[];
                        
                        TWOstacksINAARRAY(int k){
                        	arr=new int[10];
                        	max=k;
                        	top1=-1;
                        	top2=max;
                        }
                        public static void main(String args[]){
                        	 TWOstacksINAARRAY obj=new  TWOstacksINAARRAY(10);
                        	 obj.push1(4);
                        	 obj.push1(6);
                        	 obj.push1(12);
                        	 obj.push1(10);
                        	 obj.push1(12);
                        	 obj.push2(32);
                        	 obj.push2(45);
                        	 obj.push2(71);
                        	 obj.push2(70);
                        	 obj.push2(87);
                        	 System.out.println("array is");
                        	 for(int i=0;i<max;i++){
                        		 System.out.println(+obj.arr[i]);
                        	 }
                        	System.out.println("popping element from 1 is"+obj.pop1());
                        	System.out.println("popping element from 1 is"+obj.pop2());
                        	 
                        }
                        public void push1(int m){
                        	if(top1<top2-1){
                        		arr[++top1]=m;
                        	}
                        	else{
                        		System.out.println("stack overflow");
                        	}
                        }
                        public void push2(int n){
                        	if(top1<top2-1){
                        		arr[--top2]=n;
                        	}
                        	else{
                        		System.out.println("stack overflow");
                        	}
                        }
                        public int pop1(){
                        	if(top1==-1){
                        		System.out.println("stack underflow");
                        		return 0;
                        	}
                        	else{
                        		return arr[top1--];
                        	}
                        }
                        public int pop2(){
                        	if(top2<max){
                        		return arr[top2--];
                        	}
                        	else{
                        		return 0;
                        	}
                        }
                        
}
