
public class GarbageCollectorDemo {

	public GarbageCollectorDemo() {
		System.out.println(this + " is created");
	}

	public static void main(String[] args) {
		new GarbageCollectorDemo();
		new GarbageCollectorDemo();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + " is finalized");
	}

}
