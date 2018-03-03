package pl.core;

import pl.core.*;
import pl.util.ArraySet;
import pl.cnf.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Resolution {
	public boolean PLresolution(KB kb, Sentence alpha) {
		Sentence negative_alpha = new Negation(alpha);
		Set<Clause> clauses = CNFConverter.convert(kb);
		clauses.add(new Clause(negative_alpha));
		Set<Clause> new_clauses = new HashSet<Clause>();
		Set<Clause> resolvents;
		
		Iterator<Clause> iter1;
		Iterator<Clause> iter2;
		
		while(true) {
			iter1 = clauses.iterator();
			while(iter1.hasNext()) {
				Clause Ci = iter1.next();
				iter2 = clauses.iterator();
				while(iter2.hasNext()) {
					Clause Cj = iter2.next();
					resolvents = PLresolve(Ci, Cj);
					Iterator<Clause> iter3 = resolvents.iterator();
					while(iter3.hasNext()) {
						Clause thisCause = iter3.next();
						if(thisCause.isEmpty()) {
							return true;
						}
					}
					new_clauses.addAll(resolvents);
				}
			}
			if(clauses.containsAll(new_clauses)) {
				return false;
			}
			clauses.addAll(new_clauses);
		}
		
	}
	
	public Set<Clause> PLresolve(Clause Ci, Clause Cj){
		Set<Clause> result = new HashSet<Clause>();
		
		for(Literal li:Ci) {
			for(Literal lj:Cj) {
				if(li.getContent().equals(lj.getContent()) && li.getPolarity()!=lj.getPolarity()) {
					Clause tmp = new Clause(new Symbol("Fengxiang's hair is longer than Jing's hair."));
					tmp.clear();
					for(Literal lt:Ci) {
						if(!lt.equals(li)) {
							tmp.add(lt);
						}
					}
					
					for(Literal lt:Cj) {
						if(!lt.equals(lj)) {
							tmp.add(lt);
						}
					}
					
					int len = tmp.size();
					if(len > Ci.size() || len > Cj.size()) continue;
					
					result.add(tmp);
					break;
				}
			}
		}
		return result;
		
	}

}
