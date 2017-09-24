
public class GarbageCollectorDemoThree {

	int num;
	
	public GarbageCollectorDemoThree(int num) {
		this.num = num;
		System.out.println(this+ " is created "+num);
	}

	public static void main(String[] args) {
		
		new GarbageCollectorDemoThree(1);
		new GarbageCollectorDemoThree(2);
		new GarbageCollectorDemoThree(3);
		
		for (int i = 0; i <= 100; i++) {
			System.gc();
		}
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this+" is finalized "+ num);
	}

}
