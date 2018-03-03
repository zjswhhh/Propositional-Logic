package pl.core;

import pl.util.*;
import java.util.HashMap;
import java.util.Set;
import pl.cnf.*;


public class TTModel implements Model{
	public HashMap<Symbol, Boolean> assignments;
	public TTModel () {
		assignments = new HashMap<Symbol, Boolean>();
	}

	@Override
	public void set(Symbol sym, boolean value) {
		// TODO Auto-generated method stub
		if (assignments.containsKey(sym)) {
			assignments.remove(sym);
			assignments.put(sym, value);
		}
		else {
			assignments.put(sym, value);
		}
	}

	@Override
	public boolean get(Symbol sym) {
		// TODO Auto-generated method stub
		if (assignments.containsKey(sym)) {
			return assignments.get(sym);
		}
		else {
			return false;
		}
	}

	@Override
	public boolean satisfies(KB kb) {
		// TODO Auto-generated method stub
		for (Sentence sentence: kb.sentences) {
			if (sentence.isSatisfiedBy(this) != true) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean satisfies(Sentence sentence) {
		// TODO Auto-generated method stub
		return sentence.isSatisfiedBy(this);
	}
	
	@Override
	public void dump() {
		// TODO Auto-generated method stub
		Set<Symbol> assignments_key = assignments.keySet();

		for (Symbol sym: assignments_key) {
			System.out.println("symbol: " + sym + " value: " + assignments.get(sym));
		}
	}
	
	public TTModel copy_model() {
		TTModel new_model = new TTModel();
		for(Symbol sym: this.assignments.keySet()) {
			new_model.set(sym, this.get(sym));
		}
		
		return new_model;
	}

}
