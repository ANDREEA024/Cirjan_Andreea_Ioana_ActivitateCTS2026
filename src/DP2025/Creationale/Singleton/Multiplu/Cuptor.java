package DP2025.Creationale.Singleton.Multiplu;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
	private static Cuptor instance = null;
	private List<Preparat> listaAsteptare=null;
	private int gradMaxim;

	private Cuptor(int gradMaxim) {
		this.listaAsteptare = new ArrayList<>();
		this.gradMaxim=gradMaxim;
	}
	
public static Cuptor getInstance(int gradMaxim) {
		if(instance == null) {
			instance = new Cuptor(gradMaxim);
		}
		return instance;
	}

	public void addPreparat(Preparat p) {
		if(p!=null) {
			this.listaAsteptare.add(p);
		}
	}

	@Override
	public String toString() {
		return "Cuptor [listaAsteptare=" + listaAsteptare + "]";
	}
	
}
