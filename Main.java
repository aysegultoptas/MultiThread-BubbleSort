package thread;

public class Main {

	public static void main(String[] args) {
		int a[]= {42,25,49,36,78,2,7};
		int b[]= {15,75,43,18,94,10,3};	
		
		BubbleSort ilkDizi= new BubbleSort("ilk",a);
		Thread th1=new Thread(ilkDizi);
		
		BubbleSort ikinciDizi= new BubbleSort("ikinci",b);
		Thread th2=new Thread(ikinciDizi);
		
		th1.start();
		th2.start();
	}
}
