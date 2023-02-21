/**
 * Write your info here
 *
 * @name Adham Mohamed Amr
 * @id 46-3347
 * @labNumber 07
 */

grammar Task9;

@members {
	/**
	 * Compares two integer numbers
	 *
	 * @param x the first number to compare
	 * @param y the second number to compare
	 * @return 1 if x is equal to y, and 0 otherwise
	 */
	public static int equals(int x, int y) {
	    return x == y ? 1 : 0;
	}
}

start: s EOF {System.out.println("The result is" + $s.check);};

s returns [int check]: a[0]c[0]b[0]{if($a.check== 1 && $b.check == 0 && $c.check == 0)
                                            $check = 1;
                                        else
                                            $check = equals($a.check,$b.check) * equals($a.check,$c.check) ;};

a [int inh]returns [int check]: LETTERA A1=a [$inh] {$check = $A1.check + 1;}
|   {$check =$inh;} ;

b [int inh]returns [int check]: LETTERB B1=b [$inh] {$check = $B1.check + 1;}
|   {$check =$inh;} ;

c [int inh]returns [int check]: LETTERC C1=c [$inh] {$check = $C1.check + 1;}
|   {$check =$inh;} ;






LETTERA : 'a'?;
LETTERB : 'b'?;
LETTERC : 'c'?;
WS : [ \r \n \t ] + ->skip;

//	$check = (equals($a.check,$b.check) && equals($a.check,$c.check));