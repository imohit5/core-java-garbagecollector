
public class GarbageCollectorDemoTwo {

	int num;
	
	public GarbageCollectorDemoTwo(int num) {
		this.num = num;
		System.out.println(this+ " is created "+num);
	}

	public static void main(String[] args) {
		
		for (int i = 0; i <= 500000; i++) {
			new GarbageCollectorDemoTwo(i);
		}
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this+" is finalized "+ num);
	}

}
