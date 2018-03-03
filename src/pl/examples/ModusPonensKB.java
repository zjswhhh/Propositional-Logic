package pl.examples;

import pl.core.*;

public class ModusPonensKB extends KB {
	
	public ModusPonensKB() {
		super();
		Symbol p = intern("P");
		Symbol q = intern("Q");
		add(p);
		add(new Implication(p, q));
	}
	
	public static void main(String[] argv) {
		//new ModusPonensKB().dump();
		ModusPonensKB MPKB = new ModusPonensKB();
		System.out.println("The KB is:");
		MPKB.dump();
		Sentence alpha = new Symbol("Q");
		System.out.println("The sentence is: Q");
		TT tt = new TT();
		Boolean resultTT = tt.TTENTAIL(MPKB, alpha);
		System.out.println("Entail:"+ resultTT);
		
		Resolution resolution = new Resolution();
		Boolean resultRE = resolution.PLresolution(MPKB, alpha);
		System.out.println("Entail:"+resultRE);
	}

}
