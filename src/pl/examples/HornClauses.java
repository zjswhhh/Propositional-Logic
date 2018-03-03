package pl.examples;
import pl.core.*;

public class HornClauses extends KB{
	public HornClauses() {
		super();
		Symbol mythical = intern("mythical");
		Symbol immortal = intern("immortal");
		Symbol mammal = intern("mammal");
		Symbol horned = intern("horned");
		Symbol magical = intern("magical");
		
		add(new Implication(mythical, immortal));
		add(new Implication(new Negation(mythical), mammal));
		add(new Implication(new Disjunction(immortal, mammal), horned));
		add(new Implication(horned, magical));
		
	}
	
	public static void main(String[] argv) {
		HornClauses HCKB = new HornClauses();
		System.out.println("The KB is:");
		HCKB.dump();
		
		//(a)
		Sentence alpha1 = new Symbol("mythical");
		System.out.println("The sentence is: mythical");
		TT tt = new TT();
		Boolean resultTT = tt.TTENTAIL(HCKB, alpha1);
		System.out.println("Entail:"+ resultTT);
		
		Resolution resolution = new Resolution();
		Boolean resultRE = resolution.PLresolution(HCKB, alpha1);
		System.out.println("Entail:"+resultRE);
		
		//(b)
		Sentence alpha2 = new Symbol("magical");
		System.out.println("The sentence is: magical");
		//TT
		Boolean resultTT2 = tt.TTENTAIL(HCKB, alpha2);
		System.out.println("Entail:"+ resultTT2);
		//resolution
		Boolean resultRE2 = resolution.PLresolution(HCKB, alpha2);
		System.out.println("Entail:"+resultRE2);
		
		//(c)
		Sentence alpha3 = new Symbol("horned");
		System.out.println("The sentence is: horned");
		//TT
		Boolean resultTT3 = tt.TTENTAIL(HCKB, alpha3);
		System.out.println("Entail:"+ resultTT3);
		//resolution
		Boolean resultRE3 = resolution.PLresolution(HCKB, alpha3);
		System.out.println("Entail:"+resultRE3);
	}
	

}
