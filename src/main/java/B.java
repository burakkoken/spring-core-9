
public class B {

	private A a;
	
	public B(){
		System.out.println("Constructor B");
	}
	
	public B(A a){
		System.out.println("Constructor B(A a)");
		this.a = a;
	}
	
	public void show(){
		System.out.println("Show method B");
	}

}
