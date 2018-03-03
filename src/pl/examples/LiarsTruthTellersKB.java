package pl.examples;

import pl.core.*;

public class LiarsTruthTellersKB extends KB {
	public LiarsTruthTellersKB() {
		super();
		Symbol A = intern("A");
		Symbol B = intern("B");
		Symbol C = intern("C");
		
		add(new Biconditional(A, new Conjunction(A,C)));
		add(new Biconditional(B, new Negation(C)));
		add(new Biconditional(C, new Disjunction(B, new Negation(A))));
	}
	
	public LiarsTruthTellersKB(int num) {
		super();
		Symbol A = intern("A");
		Symbol B = intern("B");
		Symbol C = intern("C");
		
		add(new Implication(A, new Negation(C)));
		add(new Implication(B, new Conjunction(A,C)));
		add(new Implication(C,B));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test OSSMB 82-12
		LiarsTruthTellersKB LTTKBA = new LiarsTruthTellersKB();
		//By TT
		TT tt = new TT();
		System.out.println("For OSSMB 82-12,using TT method");
		// test A
		Sentence alpha_A = new Symbol("A");
		System.out.println("We want to test Amy:");
		Boolean resultTT_A = tt.TTENTAIL(LTTKBA, alpha_A);
		System.out.println("What Amy said is:"+resultTT_A);
		//test B
		Sentence alpha_B = new Symbol("B");
		System.out.println("We want to test Bob:");
		Boolean resultTT_B = tt.TTENTAIL(LTTKBA, alpha_B);
		System.out.println("What Bob said is:"+resultTT_B);
		
		// test C
		Sentence alpha_C = new Symbol("C");
		System.out.println("We want to test Cal:");
		Boolean resultTT_C = tt.TTENTAIL(LTTKBA, alpha_C);
		System.out.println("What Cal said is:"+resultTT_C);

		//By resolution
		Resolution resolution = new Resolution();
		System.out.println("For OSSMB 82-12,using resolution method");
		// test A
		System.out.println("We want to test Amy:");
		Boolean resultRE_A = resolution.PLresolution(LTTKBA, alpha_A);
		System.out.println("What Amy said is:"+resultRE_A);
		// test B
		System.out.println("We want to test Bob:");
		Boolean resultRE_B = resolution.PLresolution(LTTKBA, alpha_B);
		System.out.println("What Bob said is:"+resultRE_B);
		// test C
		System.out.println("We want to test Cal:");
		Boolean resultRE_C = resolution.PLresolution(LTTKBA, alpha_C);
		System.out.println("What Cal said is:"+resultRE_C);
		System.out.println("\n");
		
		// Test OSSMB 83-11
		LiarsTruthTellersKB LTTKBB = new LiarsTruthTellersKB(2);
		// By TT
		System.out.println("For OSSMB 83-11,using TT method");
		// test A
		System.out.println("We want to test Amy:");
		Boolean resultTT_A2 = tt.TTENTAIL(LTTKBB, alpha_A);
		System.out.println("What Amy said is:"+resultTT_A2);
		// test B
		System.out.println("We want to test Bob:");
		Boolean resultTT_B2 = tt.TTENTAIL(LTTKBB, alpha_B);
		System.out.println("What Bob said is:"+resultTT_B2);
		// test C
		System.out.println("We want to test Cal:");
		Boolean resultTT_C2 = tt.TTENTAIL(LTTKBB, alpha_C);
		System.out.println("What Cal said is:"+resultTT_C2);
		
		// By resolution
		System.out.println("For OSSMB 83-11,using resolution method");
		// test A
		System.out.println("We want to test Amy:");
		Boolean resultRE_A2 = tt.TTENTAIL(LTTKBB, alpha_A);
		System.out.println("What Amy said is:"+resultRE_A2);
		// test B
		System.out.println("We want to test Bob:");
		Boolean resultRE_B2 = tt.TTENTAIL(LTTKBB, alpha_B);
		System.out.println("What Bob said is:"+resultRE_B2);
		// test C
		System.out.println("We want to test Cal:");
		Boolean resultRE_C2 = tt.TTENTAIL(LTTKBB, alpha_C);
		System.out.println("What Cal said is:"+resultRE_C2);
		
		
		
		
	}

}
