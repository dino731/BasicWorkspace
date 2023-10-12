package com.javabasic.ch7;

class MyPoint3{
	int x;
	int y;
	String getLocation() {
		return "x: "+ x + ", y : "+y;
	}
}

class MyPoint3D extends MyPoint3{
	int z;
	
	// 조상의 getLocation()을 오버라이딩
	String getLocation() {
		return "x: "+x+ ", y : "+y+", z: "+z;
	}
}

public class OverrideTest {
	public static void main(String[] args) {
		MyPoint3D p = new MyPoint3D();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		System.out.println(p.getLocation());
		//x: 3, y : 5, z: 7
		// MyPoint3D의 오버라이딩된 return 값을 사용할 수 있다.

	}

}
