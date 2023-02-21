import java.util.*;

/**
 * Write your info here
 * 
 * @name Adham Mohamed Amr
 * @id 46-3347
 * @labNumber 07
 */
public class LL1CFG {
	/**
	 * LL1 CFG constructor
	 *
	 * @param description is the string describing an LL(1) CFG, first, and follow as represented in the task description.
	 */

	ArrayList<CFG> All = new ArrayList<CFG>();
	public LL1CFG(String description) {
		String[] Split = description.split("#"); //0 is real  1 is first  2 is follow
		String[] CFG = Split[0].split(";");
//		ArrayList<String> CFGArr= new ArrayList<String>();
//		for (int i = 0; i < CFG.length; i++) {
//			String[] temp = CFG[i].split(",");
//			for (int j = 0; j < temp.length; j++)
//				CFGArr.add(temp[j]);
//
//		}
		String[] First =  Split[1].split(";");
//		ArrayList<String> FirstArr= new ArrayList<String>();
//		for (int i = 0; i < First.length; i++) {
//			String[] temp = First[i].split(",");
//			for (int j = 0; j < temp.length; j++)
//				FirstArr.add(temp[j]);
//
//		}
		String[] Follow =  Split[2].split(";");
		Set<String> Terminals = new LinkedHashSet<String>();
		String[] temp = description.split(";");
		for(int i = 0; i <temp.length;i++){
			Terminals.add(temp[i].charAt(0)+"");
		}
		for (int i = 0; i < CFG.length; i++) {
			CFG tempCFG = new CFG(CFG[i]);
			All.add(tempCFG);
		}
		for (int i = 0; i < First.length; i++) {
			All.get(i).FirstSetup(First[i]);
		}
		for (int i = 0; i < Follow.length; i++) {
			All.get(i).follow = Follow[i].charAt(2)+"";
		}
		List<Map<String, String>> ParseTable = new ArrayList<Map<String, String>>();
		boolean flag = false;
		for(int i = 0; i < All.size(); i++){
			for(int j = 0; j < All.get(i).noTerminal.size();j++){
				flag = false;
				for (int k = 0; k < Terminals.size(); k++) {
					if(All.get(i).first.get(j).contains(All.get(k).terminal)||All.get(i).first.get(j).contains("e")){
						flag = true;
					}
				}
				if(flag == false){

						ParseTable.add(i,new HashMap<String,String>());
					ParseTable.get(i).put(All.get(i).first.get(j),All.get(i).noTerminal.get(j));
				}


			}
		}

		System.out.println();
	}
	/**
	 * Returns A string encoding a derivation is a comma-separated sequence of sentential forms each representing a step in the derivation..
	 *
	 * @param input is the string to be parsed by the LL(1) CFG.
	 * @return returns a string encoding a left-most derivation.
	 */
	public String parse(String input) {
		return null;
	}

}
class CFG{
	String terminal;
	ArrayList<String> noTerminal = new ArrayList<String>();
	ArrayList<String> first = new ArrayList<String>();
	String follow;

	public CFG(String desc){
		String[] Split = desc.split(",");
		terminal = Split[0];
		for (int i = 1; i < Split.length ; i++) {
			noTerminal.add(Split[i]);
		}
	}
	public void FirstSetup(String any){
		String[] Split = any.split(",");
		for (int i = 1; i < Split.length ; i++) {
			first.add(Split[i]);
		}
	}
}
