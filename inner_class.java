
public class OuterFunction {
	int oX ;
	class Inner{
		int inY ;
		Inner(){
			inY = 10;
			System.out.println(" Inner class Constructor called ");
		}
		Inner(int a){
			inY = a;
			System.out.println("Inner class Secondry Constructor called ");
		}
		void disp() {
			System.out.println("from inner funtion , the value of \n ");
			System.out.println("Value of Outer X ="+ oX + "\n Value of Inner Y =" + inY );
		}
	}
	Inner i1 ;
	OuterFunction(){
		System.out.println("Outer class constructor called");
		oX = 10 ;
		i1 = new Inner();
	}
	OuterFunction(int p , int q){
		oX = p ;
		i1 = new Inner(q);
	}
	void show() {
		i1.disp();
		System.out.println("Show method from Outer X class");
	}
}



public class DemoInnerClass {
	public static void main(String[] args) {
		var o1 = new OuterFunction();
		var o2 = new OuterFunction(1,2);
		o1.show();
		System.out.println("OBJECT 2");
		o2.show();
	}
}


