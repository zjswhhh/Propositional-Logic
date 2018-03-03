package pl.examples;
import pl.core.*;

public class MoreLiarsandTruthtellers extends KB{
	public MoreLiarsandTruthtellers() {
		super();
		Symbol A = intern("A");
		Symbol B = intern("B");
		Symbol C = intern("C");
		Symbol D = intern("D");
		Symbol E = intern("E");
		Symbol F = intern("F");
		Symbol G = intern("G");
		Symbol H = intern("H");
		Symbol I = intern("I");
		Symbol J = intern("J");
		Symbol K = intern("K");
		Symbol L = intern("L");
		
		add(new Biconditional(A, new Conjunction(H,I)));
		add(new Biconditional(B, new Conjunction(A,L)));
		add(new Biconditional(C, new Conjunction(B,G)));
		add(new Biconditional(D, new Conjunction(E,L)));
		add(new Biconditional(E, new Conjunction(C,H)));
		add(new Biconditional(F, new Conjunction(D,I)));
		add(new Biconditional(G, new Conjunction(new Negation(E),new Negation(J))));
		add(new Biconditional(H, new Conjunction(new Negation(F),new Negation(K))));
		add(new Biconditional(I, new Conjunction(new Negation(G),new Negation(K))));
		add(new Biconditional(J, new Conjunction(new Negation(A),new Negation(C))));
		add(new Biconditional(K, new Conjunction(new Negation(D),new Negation(F))));
		add(new Biconditional(L, new Conjunction(new Negation(B),new Negation(J))));
	}
	
	public static void main(String[] args){
		MoreLiarsandTruthtellers MLTTKB = new MoreLiarsandTruthtellers();
		Sentence alpha_a = new Symbol("A");
		Sentence alpha_b = new Symbol("B");
		Sentence alpha_c = new Symbol("C");
		Sentence alpha_d = new Symbol("D");
		Sentence alpha_e = new Symbol("E");
		Sentence alpha_f = new Symbol("F");
		Sentence alpha_g = new Symbol("G");
		Sentence alpha_h = new Symbol("H");
		Sentence alpha_i = new Symbol("I");
		Sentence alpha_j = new Symbol("J");
		Sentence alpha_k = new Symbol("K");
		Sentence alpha_l = new Symbol("L");
		String str = new String();
		
		//TTENTAIL
		TT tt = new TT();
		if(tt.TTENTAIL(MLTTKB, alpha_a)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Amy is a " + str);
		
		if(tt.TTENTAIL(MLTTKB, alpha_b)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Bob is a " + str);
		
		if(tt.TTENTAIL(MLTTKB, alpha_c)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Cal is a " + str);
		
		if(tt.TTENTAIL(MLTTKB, alpha_d)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Dee is a " + str);
		
		if(tt.TTENTAIL(MLTTKB, alpha_e)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Eli is a " + str);
		
		if(tt.TTENTAIL(MLTTKB, alpha_f)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Fay is a " + str);
		
		if(tt.TTENTAIL(MLTTKB, alpha_g)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Gil is a " + str);
		
		if(tt.TTENTAIL(MLTTKB, alpha_h)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Hal is a " + str);
		
		if(tt.TTENTAIL(MLTTKB, alpha_i)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Ida is a " + str);
		
		if(tt.TTENTAIL(MLTTKB, alpha_a)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Jay is a " + str);
		
		if(tt.TTENTAIL(MLTTKB, alpha_k)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Kay is a " + str);
		
		if(tt.TTENTAIL(MLTTKB, alpha_l)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Lee is a " + str);
		
		//PLresolution
		Resolution resolution = new Resolution();
		
		if(resolution.PLresolution(MLTTKB, alpha_a)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Amy is a " + str);
		
		if(resolution.PLresolution(MLTTKB, alpha_b)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Bob is a " + str);
		
		if(resolution.PLresolution(MLTTKB, alpha_c)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Cal is a " + str);
		
		if(resolution.PLresolution(MLTTKB, alpha_d)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Dee is a " + str);
		
		if(resolution.PLresolution(MLTTKB, alpha_e)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Eli is a " + str);
		
		if(resolution.PLresolution(MLTTKB, alpha_f)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Fay is a " + str);
		
		if(resolution.PLresolution(MLTTKB, alpha_g)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Gil is a " + str);
		
		if(resolution.PLresolution(MLTTKB, alpha_h)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Hal is a " + str);
		
		if(resolution.PLresolution(MLTTKB, alpha_i)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Ida is a " + str);
		
		if(resolution.PLresolution(MLTTKB, alpha_a)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Jay is a " + str);
		
		if(resolution.PLresolution(MLTTKB, alpha_k)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Kay is a " + str);
		
		if(resolution.PLresolution(MLTTKB, alpha_l)){
			str = "Truth-teller.";
		} else {
			str = "Liar.";
		}
		System.out.println("Lee is a " + str);
		
	}
}
