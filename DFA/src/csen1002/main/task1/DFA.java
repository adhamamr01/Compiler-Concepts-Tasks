package csen1002.main.task1;

/**
 * Write your info here
 * 
 * @name Adham Mohamed Amr
 * @id 46-3347
 * @labNumber 07
 */
public class DFA {
	/**
	 * DFA constructor
	 * 
	 * @param description is the string describing a DFA
	 */
	String [] Accepted;
	String [][] States ;
	String current_state = "0";
	public DFA(String description) {
		String [] Split1 = description.split("#");
		Accepted =  Split1[1].split(",");
		String [] Split2 = Split1[0].split(";");
		States = new String [Split2.length] [];
		for(int i = 0; i < Split2.length ; i++) {
			String[] temp = Split2[i].split(",");
			States[i] = temp;
		}
		current_state = States[0][0];
	}

	/**
	 * Returns true if the string is accepted by the DFA and false otherwise.
	 * 
	 * @param input is the string to check by the DFA.
	 * @return if the string is accepted or not.
	 */
	public boolean run(String input) {
		char[] inp = input.toCharArray();
		for(int i = 0; i < inp.length;i++) {
			for(int j = 0; j < States.length; j++) {
				if(current_state.equals(States[j][0])) {
					if(States[j][1].equals(States[j][2])) {
						current_state = States[j][1];
						break;
					}
					else if(inp[i] == '0') {
						current_state = States[j][1];
						break;
					}
					else if(inp[i] == '1') {
						current_state = States[j][2];
						break;
					}
					else {
						System.out.println("Error in the run code");
					}
				}
			}
		}
		for (int i = 0; i < Accepted.length;i++) {
			if (current_state.equals(Accepted[i]))
			return true;
		}
		return false;
	}
	
}
