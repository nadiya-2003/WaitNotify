
public class Begin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object lock=new Object();
		EvenorOdd r1=new EvenorOdd(lock);
		EvenorOdd r2=new EvenorOdd(lock);
//		Thread t1=new Thread(eo1);
//		Thread t2=new Thread(eo2);
//		t1.setName("Even");
//		t2.setName("Odd");
//		t1.start();
//		t2.start();
		new Thread(r1,"Even").start();
		new Thread(r2,"Odd").start();



	}

}
