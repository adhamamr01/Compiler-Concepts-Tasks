package csen1002.main.task1;

public class Main {

	public static void main(String[] args) {
		DFA Test = new DFA("0,1,0;1,0,2;2,3,2;3,2,4;4,4,4#4");
		  for (int i = 0; i < (Test.States).length; ++i) {
	            for(int j = 0; j < (Test.States)[i].length; ++j) {
	                System.out.println((Test.States)[i][j]);
	            }	
	      }
		  System.out.println(Test.run("110001101"));
	}
}
