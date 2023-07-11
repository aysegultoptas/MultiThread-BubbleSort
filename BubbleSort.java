package thread;

public class BubbleSort implements Runnable {
	String name;
	int dizi[];
	public BubbleSort(String name, int dizi[]) {
		this.name = name;
		this.dizi=dizi;
	}
	@Override
	public void run() {
		try {
			for (int i=0;i<dizi.length-1;++i){
	            for(int j=0;j<dizi.length-i-1; ++j){
	                if(this.dizi[j+1]<this.dizi[j]){
	                    int swap = this.dizi[j];
	                    this.dizi[j] = this.dizi[j+1];
	                    this.dizi[j+1] = swap;
	                }
	            }
	         
	        }
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(this.name+ "hata-1");
		}
		try {
			for(int i=0; i<dizi.length;i++) {
				System.out.println(this.name+ " dizinin "+i+". elemani: " +this.dizi[i]);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex) {
			System.out.println(this.name+ "hata-2");
		}
		System.out.println(name+ " dizi siralandi.");
	}
}
