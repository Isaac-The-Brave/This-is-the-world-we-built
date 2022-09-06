package animalLogic;

import java.util.ArrayList;

public class CellGeneticTranslator {

	ArrayList<String> movements;
	
	public CellGeneticTranslator(Cell cell, String move){
		
		switch(move) {
		case("A"):
			cell.moveDown();
			break;
		case("B"):
			cell.moveUp();
			break;
		case("C"):
			cell.moveLeft();
			break;
		case("D"):
			cell.moveRight();
			break;
		case("O"):
			cell.moveAround();
			break;

	}
		
	}
	
	

	}


		