package geneSequenceLogic;

import java.util.ArrayList;

public class BaseCellGenetics {

	@SuppressWarnings("serial")
	private ArrayList<String> Genetics = new ArrayList<String>() {{
        add("A");
        add("B");
        add("C");
        add("D");
        add("E");
        add("F");
        add("G");
        add("H");
        
    }};

	public ArrayList<String> getGenetics() {
		return Genetics;
	}

	public void setGenetics(ArrayList<String> genetics) {
		Genetics = genetics;
	}
    
}
