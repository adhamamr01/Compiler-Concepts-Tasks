package csen1002.main.task4;

import java.util.*;
/**
 * Write your info here
 * 
 * @name Adham Mohamed Amr
 * @id 46-3347
 * @labNumber 07
 */
public class FDFA {
	/**
	 * FDFA constructor
	 * 
	 * @param description is the string describing a FDFA
	 */
	ArrayList<state> States = new ArrayList<state>();
	state current_state;
	public FDFA(String description) {
		String[] Cut1 = description.split("#");
		String[] CutAcc = Cut1[1].split(",");
		String[] Cutstate = Cut1[0].split(";");
		for(int i = 0; i < Cutstate.length; i++) {
			state temp = new state(Cutstate[i]);
			States.add(temp);
		}
		current_state = States.get(0);
		for(int i = 0; i< CutAcc.length;i++) {
			for(int j = 0; j < States.size(); j++) {
				if(CutAcc[i].charAt(0) == States.get(j).name) {
					States.get(j).accept = true;
				}
			}
		}
	}

	/**
	 * Returns a string of actions.
	 * 
	 * @param input is the string to simulate by the FDFA.
	 * @return string of actions.
	 */
	public String run(String input) {
		Stack<state> big= new Stack<state>();
		Stack<String> small= new Stack<>();
		Stack<String> out = new Stack<>();
		String temp = "";
		String secinput = "";
		boolean contacc = false;
		big.push(States.get(0));
			for(int i = 0; i < input.length();i++) {
				if(input.charAt(i)=='0') {
					char temp1 = current_state.if0;
					current_state = States.get(temp1 - 48);
					if(current_state.accept == true)
						contacc = true;
					big.push(current_state);
					small.push("0");
				}
				else if(input.charAt(i)=='1') {
					char temp1 = current_state.if1;
					current_state = States.get(temp1- 48);
					if(current_state.accept == true)
						contacc = true;
					big.push(current_state);
					small.push("1");
				}
			}
			if (big.peek().accept == true || (big.peek().accept == false && contacc == false)) {
				while(!small.isEmpty()) {
					out.push(small.pop());
				}
				while(!out.isEmpty()) {
					temp += out.pop();
				}
				temp += "," + big.peek().action + ";";
			}
			else {
				Stack<state> bigtemp = new Stack<state>();
				Stack<String> smalltemp = new Stack<>();
				while(big.peek().accept == false) {
					bigtemp.push(big.pop());
					smalltemp.push(small.pop());
				}
				if(big.isEmpty()) {
					while(!smalltemp.isEmpty()) {
						big.push(bigtemp.pop());
						small.push(smalltemp.pop());
					}
					while(!small.isEmpty()) {
						temp += small.pop();
					}
					temp += "," + big.peek().action +";";
				}
				else {
					while(!small.isEmpty()) {
						out.push(small.pop());
					}
					while(!out.isEmpty()) {
						temp += out.pop();
					}
					temp += "," + big.peek().action + ";";
					while(!smalltemp.isEmpty()) {
						String tempstr = smalltemp.pop();
						small.push(tempstr);
						secinput += tempstr;
					}
					big.clear();
					small.clear();
					current_state = States.get(0);
					big.push(States.get(0));
					for(int i = 0; i < secinput.length();i++) {
						if(secinput.charAt(i)=='0') {
							char temp1 = current_state.if0;
							current_state = States.get(temp1 - 48);
							if(current_state.accept == true)
								contacc = true;
							big.push(current_state);
							small.push("0");
						}
						else if(secinput.charAt(i)=='1') {
							char temp1 = current_state.if1;
							current_state = States.get(temp1- 48);
							if(current_state.accept == true)
								contacc = true;
							big.push(current_state);
							small.push("1");
						}
					}
					while(!small.isEmpty()) {
						out.push(small.pop());
					}
					while(!out.isEmpty()) {
						temp += out.pop();
					}
					temp += "," + big.peek().action + ";";
				}
			}
			
		return temp;
	}
}
class state{
	char name;
	char if0;
	char if1;
	char action;
	boolean accept;
	public state(String init) {
		name = init.charAt(0);
		if0 = init.charAt(2);
		if1 = init.charAt(4);
		action = init.charAt(6);
	}
}
