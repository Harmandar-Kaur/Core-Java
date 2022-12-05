package Assignments;

import java.util.*;

//import ExceptionHandling.MyException; 
class JavaStack extends Exception
{ 
	public JavaStack(String msg) {
		super(msg);
	}
	int top = -1; 
	int i; 
	public int n; 
	public int[] a; 
	Scanner sc = new Scanner(System.in); 
	public void init() 
	{ 
		System.out.println("Enter the stack size: ");  
		n=sc.nextInt(); 
		a = new int[n]; 
	} 
	void push() 
	{ 
		if(top==n-1) {
			try {
				throw new JavaStack("StackFullException");
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			//System.out.println("Stack is full");    
		} else { 
			System.out.println("Enter the element: "); 
			a[++top] = sc.nextInt(); 
		} 
	} 
	void pop() 
	{
		if(top==-1) {
			try {
				throw new JavaStack("StackEmptyException");
				//System.out.println("Stack is empty");
			}
			catch(Exception ex) {
			//else { 
				System.out.println(ex.getMessage());
				//System.out.println("Deleted element: " +a[top--]); 
			}
		} else {
			System.out.println("Deleted element: " +a[top--]);
		}
	}
	void display() 
	{ 
		if(top==-1) { 
			try {
				throw new JavaStack("StackEmptyException");
				//System.out.println("Stack is empty");
			}
			catch(Exception ex) {
			//else { 
				System.out.println(ex.getMessage());
				//System.out.println("Deleted element: " +a[top--]); 
			}
			//System.out.println("Stack is empty"); 
		} else { 
				System.out.println("Elements: "); 
				for(i=top; i>=0; i--) 
				{ 
					System.out.println(a[i]); 
				} 
		} 
	 } 
} 
class Exercise 
{ 
		public static void main(String args[]) 
		{ 
			JavaStack s = new JavaStack("");  	
			int opt;  	
			s.init(); 
			Scanner sc = new Scanner(System.in); 
			while(true) 
			{ 
				System.out.println("Stack Operations:"); 
				System.out.println("\n1.push\n2.pop \n3.display \n4.exit");  	
				System.out.println("Enter option:");  	
				opt=sc.nextInt();  	
				switch(opt) 
				{ 
          			case 1: 
          				s.push();  	
          				break;  	
          			case 2: 
          				s.pop();  	
          				break;  	
          			case 3: 
          				s.display(); 
          				break;  
          			case 4: 
          				System.exit(0);	
          			default: 
          				System.out.println("invalid choice"); 
          				break;
				} 
			}
		}     
} 

