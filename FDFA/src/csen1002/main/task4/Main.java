package csen1002.main.task4;


public class Main {

	public static void main(String[] args) {
		FDFA fdfa1 = new FDFA("0,1,0,N;1,1,2,O;2,3,1,P;3,3,4,Q;4,3,4,A#4");
		System.out.println(fdfa1.run("110101010"));
		//Expected Output "10111,P;"
	}

}
