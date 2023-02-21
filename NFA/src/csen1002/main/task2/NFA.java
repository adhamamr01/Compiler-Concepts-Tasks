package csen1002.main.task2;
import java.util.*;
/**
 * Write your info here
 * 
 * @name Adham Mohamed Amr
 * @id 46-3347
 * @labNumber 07
 */
public class NFA{
	/**
	 * NFA constructor
	 * 
	 * @param description is the string describing a NFA
	 */ArrayList <NFAstate> States = new ArrayList <NFAstate>();
	public NFA(String description) {
		String[] Split = description.split("#"); // 0:if 0  1:if 1  2:epsilon(empty string) 3:accept states
		String[] Split0 = Split[0].split(";");
		String[] Split1 = Split[1].split(";");
		String[] SplitEps = Split[2].split(";");
		String[] SplitAcc = Split[3].split(",");
		String[] Split2 = description.split("[#;,]"); 
		SortedSet<String> names = new TreeSet<String>();
		for(int j = 0; j < Split2.length;j++) {
			names.add(Split2[j]);
	      }
		while(!names.isEmpty()) {
			NFAstate temp = new NFAstate(names.first());
			States.add(temp);
			names.remove(names.first());
		}
		for(int i = 0; i<Split0.length;i++) {
			for(int j = 0; j < States.size();j++) {
				if (Split0[i].charAt(0)== States.get(j).name) {
					for(int k  = 0; i< States.size();i++) {
						if(Split0[i].charAt(2) == States.get(k).name) {
							States.get(j).If0.add(States.get(k));
						}
					}
				}
			}
		}
		for(int i = 0; i<Split1.length;i++) {
			for(int j = 0; j < States.size();j++) {
				if (Split1[i].charAt(0)== States.get(j).name) {
					for(int k  = 0; i< States.size();i++) {
						if(Split1[i].charAt(2) == States.get(k).name) {
							States.get(j).If1.add(States.get(k));
						}
					}
				}
			}
		}
		for(int i = 0; i<SplitEps.length;i++) {
			for(int j = 0; j < States.size();j++) {
				if (SplitEps[i].charAt(0)== States.get(j).name) {
					for(int k  = 0; i< States.size();i++) {
						if(SplitEps[i].charAt(2) == States.get(k).name) {
							States.get(j).If1.add(States.get(k));
						}
					}
				}
			}
		}
		for(int i = 0; i<SplitAcc.length;i++) {
			for(int j = 0; j < States.size();j++) {
				if (SplitEps[i].charAt(0)== States.get(j).name) {
					States.get(j).Acc = true;
				}
			}
		}
		Stack<NFAstate> statenew = new Stack<NFAstate>();
		statenew.push(States.get(0));
		while(!statenew.empty()) {
			for(int i = 0; i< statenew.peek().Eps.size();i++) {
				if(statenew.peek().Eps.first().name == statenew.peek().Eps.last().name) {
					statenew.push(statenew.peek().Eps.first());
				}
				else {
					statenew.push(statenew.peek().Eps.first());
					statenew.push(statenew.peek().Eps.last());
				}
				
			}
			DFAstate tempdfa = new DFAstate();
			String tempstr = "";
			for(int i = 0; i< statenew.size();i++) {
				NFAstate temo = statenew.pop(); 
				tempstr += temo.name;
				 
			}
			
			
		}
	}

	/**
	 * Returns true if the string is accepted by the NFA and false otherwise.
	 * 
	 * @param input is the string to check by the NFA.
	 * @return if the string is accepted or not.
	 */
	public boolean run(String input) {
		// TODO Write Your Code Here
		return false;
	}
	class NFAstate{
		char name;
		SortedSet<NFAstate> If0 = new TreeSet<NFAstate>();
		SortedSet<NFAstate> If1 = new TreeSet<NFAstate>();
		SortedSet<NFAstate> Eps = new TreeSet<NFAstate>();
		Boolean Acc = false;
		public NFAstate(String name){
			this.name = name.charAt(0);
		}
		
	}
	class DFAstate{
		SortedSet<String> name = new TreeSet<String>();
		String If0 = "";
		String If1 = "";
		Boolean Acc = false;
		public DFAstate(String inp){
			name.add(inp);
		}
		public DFAstate(){
			If0 = "phi";
			If1 = "phi";
		}
	}
}
