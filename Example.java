import java.util.*;
class A
{
	A() {
		System.out.println("Hello from constructor");
	}
	public void Hello() {
		System.out.println("Hello from example class A");
	}
}
class B
{
	public void Hello() {
		System.out.println("Hello from example class B");
	}
}
class Example
{
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a.Hello();
		b.Hello();
	}
}
