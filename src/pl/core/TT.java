package pl.core;

import pl.core.*;
import pl.examples.ModusPonensKB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TT {

	public boolean TTENTAIL(KB kb, Sentence alpha) {
		Collection<Symbol> symbols= kb.symbols();
		TTModel model = new TTModel();
		return TTCheckAll(kb, alpha, symbols, model);
	}
	
	public boolean TTCheckAll(KB kb, Sentence alpha, Collection<Symbol> symbols, TTModel model){
		if(symbols.isEmpty()) {
			if(model.satisfies(kb)) {
				return alpha.isSatisfiedBy(model);
			}
			else {
				return true;
			}
		}
		else {
			
			Iterator<Symbol> iter = symbols.iterator();
			Symbol P = (Symbol) iter.next();
			Collection<Symbol> rest = new ArrayList<Symbol>(symbols);
			rest.remove(P);
			TTModel modelPtrue = model.copy_model();
			modelPtrue.set(P, true);
			TTModel modelPfalse = model.copy_model();
			modelPfalse.set(P, false);
			return TTCheckAll(kb, alpha, rest, modelPtrue) && TTCheckAll(kb, alpha, rest, modelPfalse);
		}
	}
	
}
