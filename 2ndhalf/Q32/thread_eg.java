class thread_eg
{
	public static void main(String[] args) {
		Thread ob = new Thread();
		ob.currentThread();
		System.out.println(ob); //[Thread-0,5,main]
		ob.setName("ayan");
		ob.setPriority(10);
		System.out.println(ob);
	}
}