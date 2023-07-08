package OopsAndStack.inheritance;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// P obj = new P();
		// System.out.println(obj.d+" "+ obj.d1);
		// C obj = new C();
		// System.out.println(obj.);

		System.out.println(" <-- Case1 -->");
		P obj1 = new P();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun1();
		
		System.out.println(" <-- Case2 -->");
		P obj2 = new C();
		System.out.println(obj2.d);
		System.out.println(obj2.d1);
		System.out.println(((C)obj2).d2);
		obj2.fun();
		obj2.fun1();
		((C)obj2).fun2();
		
		System.out.println(" <-- Case3 -->");
		// not allowed in java
//		C obj3 = new P();
//		System.out.println(obj3.d);
//		System.out.println(obj3.d1);
//		System.out.println(obj3.d2);
		
		System.out.println(" <-- Case4 -->");
		C obj4 = new C();
		System.out.println(obj4.d);
		//if we want to print p class d
		System.out.println(((P)obj4).d);
		System.out.println(obj4.d1);
		System.out.println(obj4.d2);
		obj4.fun();
		((P)obj4).fun();
		obj4.fun1();
		obj4.fun2();
	}

}
