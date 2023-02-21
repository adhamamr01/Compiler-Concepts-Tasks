package csen1002.main.task2;

public class Main {

	public static void main(String[] args) {
		NFA Test = new NFA("2,3#4,5;7,8#0,1;0,7;1,2;1,4;3,6;5,6;6,1;6,7#8");
		System.out.println(Test.run("110001101"));
	}

}
