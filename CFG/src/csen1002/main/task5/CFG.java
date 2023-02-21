package csen1002.main.task5;

import java.util.*;
/**
 * Write your info here
 * 
 * @name Adham Mohamed Amr
 * @id 46-3347
 * @labNumber 07
 */
public class CFG {
	/**
	 * CFG constructor
	 * 
	 * @param description is the string describing a CFG
	 */
	ArrayList<Expression> Expressions = new ArrayList<Expression>();
	ArrayList<String> variables = new ArrayList<String>() ;
	public CFG(String description) {
		String[] expressions = description.split(";");
		for(int i = 0; i< expressions.length; i++) {
			variables.add(expressions[i].charAt(0) + "");
			Expression temp = new Expression(expressions[i]);
			Expressions.add(temp);
		}
		//String.replace("","");
		
	}

	/**
	 * Returns a string of elimnated left recursion.
	 * 
	 * @param input is the string to simulate by the CFG.
	 * @return string of elimnated left recursion.
	 */
	public String lre() {
		String output = "";
		String X = "";
		String Xdash = "";
		boolean Xdashflag = false;
		boolean first = true;
		boolean prevXdash = false;
		
			for(int i = 0; i< Expressions.size();i++) {
				for (int j =0; j < i; j++) {
					System.out.println(i+"+"+j);
					for(int k = 0; k < Expressions.get(i).rest.size();k++) {
						if(prevXdash == true && j == i-1) {
							break;
						}
					if((Expressions.get(i).rest.get(k).charAt(0)+"").equals(Expressions.get(j).name) && Expressions.get(j).Xdash == false) {
						
						Stack<String> out = new Stack<String>() ;
						Stack<String> out2 = new Stack<String>();
						for(int l = 0; l <Expressions.get(j).rest.size();l++ ) {
						String temp = Expressions.get(i).rest.get(k);
						temp = temp.replace(Expressions.get(j).name, Expressions.get(j).rest.get(l));
						out.push(temp);
						}
						Expressions.get(i).rest.remove(k);
						if(j == i - 1) {
							if(k > Expressions.get(i).rest.size()-1) {
								while(!out.isEmpty()) {
									Expressions.get(i).rest.add(k - 1,out.pop());
								}
								
							}
							while(!out.isEmpty()) {
								out2.push(out.pop());
							}
							while(!out2.isEmpty()) {
								Expressions.get(i).rest.add(k,out2.pop());
								if(first == true)
								first = false;
								else {
									k++;
								}
							}
						}
						else {
							
						while(!out.isEmpty()) {
							Expressions.get(i).rest.add(k,out.pop());
							if(first == true)
							first = false;
							else {
								k++;
							}
						}
						}
						}
					}
				}
				for(int j = 0; j < Expressions.get(i).rest.size();j++) {
					if(Expressions.get(i).name.equals(Expressions.get(i).rest.get(j).charAt(0)+"")) {
						if(Xdashflag == false) {
							String nametemp = Expressions.get(i).name+ "'";
							Expression tempexp = new Expression(nametemp);
							Expressions.add(i+1,tempexp);
							Expressions.get(i + 1).Xdash = true;
//							Xdash += Expressions.get(i+1).name;
							Xdashflag = true;
						}
						//i+1 X' i X
						Expressions.get(i+1).rest.add(Expressions.get(i).rest.get(j).substring(1)+Expressions.get(i+1).name);
//						Xdash += "," +Expressions.get(i).rest.get(j).substring(1)+Expressions.get(i+1).name;
						Expressions.get(i).rest.remove(Expressions.get(i).rest.get(j));
						j--;
					}
					else {
						if(Xdashflag == true) {
							Expressions.get(i).rest.add(j,Expressions.get(i).rest.get(j) + Expressions.get(i+1).name);
							Expressions.get(i).rest.remove(Expressions.get(i).rest.get(j+1));

						}
					}
				}
				if(Xdashflag == false ) {
					output += Expressions.get(i).name;
					for(int hi = 0; hi < Expressions.get(i).rest.size(); hi++) {
						output += "," + Expressions.get(i).rest.get(hi);
					}
					if(i != Expressions.size() - 1)
						output += ";";
					prevXdash = false;
				}
				else {
					Expressions.get(i+1).rest.add("e");
					
					output += Expressions.get(i).name;
					for(int hi = 0; hi< Expressions.get(i).rest.size(); hi ++) {
						output += "," + Expressions.get(i).rest.get(hi);
					}
					output += ";" + Expressions.get(i + 1).name;
					for(int hi = 0; hi < Expressions.get(i + 1).rest.size(); hi++) {
						output += "," + Expressions.get(i + 1).rest.get(hi);
					}
					output += ";";
					i++;
				}
			
			X = "";
			Xdash = "";
			if(Xdashflag == true) {
				prevXdash = true;
			}
			Xdashflag = false;
			first = true;
			}
		return output;
//				for(int j = 0; j < Expressions.get(i).rest.size();j++) {
//					// char to string might be a problem
//					if(Expressions.get(i).name.equals(Expressions.get(i).rest.get(j).charAt(0)+"")) { 
//						if(Xdashflag == false) {
//							Xdash += Expressions.get(i).name + "'";
//							Xdashflag = true;
//						}
//						Xdash += "," +Expressions.get(i).rest.get(j).substring(1)+Expressions.get(i).name +"'";
//					}
//					else {
//						if(Xdashflag == false) {
//							X += "," + Expressions.get(i).rest.get(j);
//						}
//						else {
//							X += "," + Expressions.get(i).rest.get(j) + Expressions.get(i).name +"'";
//						}
//					}
//				}
//				if(Xdashflag == false ) {
//					output += X  ;
//				}
//				else {
//					output += X + ";"+ Xdash + ",e" + ";";
//				}
//			
//			X = "";
//			Xdash = "";
//			Xdashflag = false;
//			}
//		return output;
	}
}
class Expression{
	String name;
	ArrayList<String> rest = new ArrayList<String>();
	boolean Xdash = false; 
	public Expression(String exp) {
		String[] temp=exp.split(",");
		name = temp[0];
		for(int i = 1; i< temp.length;i++) {
			rest.add(temp[i]);
		}
	}
}
