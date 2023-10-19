package com.javabasic.ch7;

class A { 
//	public void method(C b) {
// 사용할 때마다 필요한 매개변수를 바꿔줘야한다.
// 두 곳을 사용하게 된다.
	public void method(I i) {// 인터페이스 I를 구현한 클래스만 넘어와라
		i.method();	
		// 즉 C가 I를 구현했으므로 method(0의 매개변수로 가능
	}
}

// B클래스의 선언과 구현을 분리
interface I{
	public void method();
}

//class B{
class B implements I{
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

//class C{
class C implements I{
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.method(new B());  // A가 B를 사용(의존)
	}

}
