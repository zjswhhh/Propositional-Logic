package pl.examples;

import pl.core.*;

public class DoorKB extends KB {
	public DoorKB() {
		super();
		Symbol Prisest_A = intern("A");
		Symbol Prisest_B = intern("B");
		Symbol Prisest_C = intern("C");
		Symbol Prisest_D = intern("D");
		Symbol Prisest_E = intern("E");
		Symbol Prisest_F = intern("F");
		Symbol Prisest_G = intern("G");
		Symbol Prisest_H = intern("H");
		Symbol Door_X = intern("X");
		Symbol Door_Y = intern("Y");
		Symbol Door_Z = intern("Z");
		Symbol Door_W = intern("W");
		
		add(new Biconditional(Prisest_A,Door_X));
		add(new Biconditional(Prisest_B, new Disjunction(Door_Y, Door_Z)));
		add(new Biconditional(Prisest_C, new Conjunction(Prisest_A, Prisest_B)));
		add(new Biconditional(Prisest_D, new Conjunction(Door_X, Door_Y)));
		add(new Biconditional(Prisest_E, new Conjunction(Door_X, Door_Z)));
		add(new Biconditional(Prisest_F, new Disjunction(new Conjunction(new Negation(Prisest_D), Prisest_E),new Conjunction(new Negation(Prisest_E), Prisest_D))));
		add(new Biconditional(Prisest_G, new Implication(Prisest_C, Prisest_F)));
		add(new Biconditional(Prisest_H, new Implication(new Conjunction(Prisest_G, Prisest_H),Prisest_A)));
		add(new Disjunction(new Disjunction(Door_X, Door_Y),new Disjunction(Door_Z,Door_W)));
	}
	public DoorKB(int num) {
		super();
		Symbol Prisest_A = intern("A");
		Symbol Prisest_C = intern("C");
		Symbol Prisest_G = intern("G");
		Symbol Prisest_H = intern("H");
		Symbol Prisest_T = intern("T");
		Symbol Test = intern("O");
		Symbol Door_X = intern("X");
		Symbol Door_Y = intern("Y");
		Symbol Door_Z = intern("Z");
		Symbol Door_W = intern("W");
		
		add(new Biconditional(Prisest_A,Door_X));
		add(new Biconditional(Prisest_C, new Conjunction(Prisest_A, Prisest_T)));
		add(new Biconditional(Prisest_G, new Disjunction(new Negation(Prisest_C),Test)));
		add(new Biconditional(Prisest_H, new Implication(new Conjunction(Prisest_G, Prisest_H),Prisest_A)));
		add(new Disjunction(new Disjunction(Door_X, Door_Y),new Disjunction(Door_Z,Door_W)));
		
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoorKB Doorkb_1 = new DoorKB();
		// By TT
		TT tt = new TT();
		System.out.println("For (a),using TT method");
		Sentence alpha_X = new Symbol("X");
		Boolean resultTT_X = tt.TTENTAIL(Doorkb_1, alpha_X);
		System.out.println("The Door X is:"+resultTT_X);
		Sentence alpha_Y = new Symbol("Y");
		Boolean resultTT_Y = tt.TTENTAIL(Doorkb_1, alpha_Y);
		System.out.println("The Door Y is:"+resultTT_Y);
		Sentence alpha_Z = new Symbol("Z");
		Boolean resultTT_Z = tt.TTENTAIL(Doorkb_1, alpha_Z);
		System.out.println("The Door Z is:"+resultTT_Z);
		Sentence alpha_W = new Symbol("W");
		Boolean resultTT_W = tt.TTENTAIL(Doorkb_1, alpha_W);
		System.out.println("The Door W is:"+resultTT_W);
		// By Resolution
		Resolution resolution = new Resolution();
		System.out.println("For (a),using Resolution method");
		Boolean resultRE_X = resolution.PLresolution(Doorkb_1, alpha_X);
		System.out.println("The Door X is:"+resultRE_X);
		Boolean resultRE_Y = resolution.PLresolution(Doorkb_1, alpha_Y);
		System.out.println("The Door X is:"+resultRE_Y);
		Boolean resultRE_Z = resolution.PLresolution(Doorkb_1, alpha_Z);
		System.out.println("The Door X is:"+resultRE_Z);
		Boolean resultRE_W = resolution.PLresolution(Doorkb_1, alpha_W);
		System.out.println("The Door X is:"+resultRE_W);
		
		DoorKB Doorkb_2 = new DoorKB(1);
		// By TT
		System.out.println("For (b),using TT method");
		Boolean resultTT_X_2 = tt.TTENTAIL(Doorkb_2, alpha_X);
		System.out.println("The Door X is:"+resultTT_X_2);
		Boolean resultTT_Y_2 = tt.TTENTAIL(Doorkb_2, alpha_Y);
		System.out.println("The Door Y is:"+resultTT_Y_2);
		Boolean resultTT_Z_2 = tt.TTENTAIL(Doorkb_2, alpha_Z);
		System.out.println("The Door Z is:"+resultTT_Z_2);
		Boolean resultTT_W_2 = tt.TTENTAIL(Doorkb_2, alpha_W);
		System.out.println("The Door W is:"+resultTT_W_2);
		// By Resolution
		System.out.println("For (b),using Resolution method");
		Boolean resultRE_X_2 = resolution.PLresolution(Doorkb_2, alpha_X);
		System.out.println("The Door X is:"+resultRE_X_2);
		Boolean resultRE_Y_2 = resolution.PLresolution(Doorkb_2, alpha_Y);
		System.out.println("The Door X is:"+resultRE_Y_2);
		Boolean resultRE_Z_2 = resolution.PLresolution(Doorkb_2, alpha_Z);
		System.out.println("The Door X is:"+resultRE_Z_2);
		Boolean resultRE_W_2 = resolution.PLresolution(Doorkb_2, alpha_W);
		System.out.println("The Door X is:"+resultRE_W_2);
	}

}
