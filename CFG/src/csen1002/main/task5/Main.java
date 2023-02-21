package csen1002.main.task5;


public class Main {

	public static void main(String[] args) {
//		CFG cfg1 = new CFG("S,SaT,T;T,TzG,G;G,i");
//		System.out.println(cfg1.lre());
//		//S,TS';S',aTS',e;T,GT';T',zGT',e;G,i
		CFG cfg2 = new CFG("S,ScT,Sm,T,n;T,mSn,imLn,i;L,SdL,S");
		System.out.println(cfg2.lre());
		//S,TS',nS';S',cTS',mS',e;T,mSn,imLn,i;L,mSnS'dL,imLnS'dL,iS'dL,nS'dL,mSnS',imLnS',iS',nS'
		CFG cfg3 = new CFG("S,SpT,Sq,T,b;T,qSb,iqKb,i;K,SdK,S");
		System.out.println(cfg3.lre());
		CFG cfg4 = new CFG("S,LW,Wd;L,SW,LS,m;W,SL,m");
		System.out.println(cfg4.lre());
	}

}
