package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {
	
	private int iSize;
	private int iSqrtSize; 
	
	public int getiSize() {
		return iSize;
	}
	
	
	
	
	public Sudoku() {
		super();
	}
	
	public Sudoku(int iSize) {
		this.iSize=iSize;
		this.iSqrtSize = (int)Math.sqrt(iSize);
	}

	
	public Sudoku(int [][] latinsquare) {
		super (latinsquare);
		iSize=latinsquare.length;
		this.iSqrtSize = (int)Math.sqrt(iSize);
	}
	
	protected int[][] getPuzzle() {
		return super.getLatinSquare();
	}
	
	protected int[] getRegion(int iRegionNbr) {
		int[] reg = new int [super.getLatinSquare().length];
		int i = (iRegionNbr % iSqrtSize) * iSqrtSize;
		int j = (iRegionNbr / iSqrtSize) * iSqrtSize;
		int iMax = (i + iSqrtSize);
		int jMax = (j + iSqrtSize);
		int iCnt =0;
		
		for (; j < jMax; j++) {
			for (i= (iRegionNbr % iSqrtSize) * iSqrtSize; i < iMax; i++) {
				
				System.out.println("J: " + j + "  " + "I: " + i);
				
				reg[iCnt++] =super.getLatinSquare()[j][i];
			}
			}
		return reg;
	}
	
	
	
	protected int[] getRegion(int Col, int Row) {
		int i = (  Col / iSqrtSize) + ( Row/ iSqrtSize)*(iSqrtSize); 
		return getRegion(i); 
	}
	
	
	
	
	protected boolean isPartialSudoku() {
		for ( int i=0; i < super.getLatinSquare().length;  i++) {
			if (hasDuplicates(getRow(i)))
				return true;
		}
			
		for (int j =0; j < super.getLatinSquare().length; j++) {
			if (hasDuplicates(getColumn(j)))
				return true;
	}
	if (!ContainsZero()) {
		return false;
	}
	return true;
	}
	
	
	
	protected boolean isSudoku() {
		if (ContainsZero()) 
			return false;
		
		for ( int i=0; i < super.getLatinSquare().length;  i++) {
			if (hasDuplicates(getRow(i)))
				return false;
		}
			
		for (int j =0; j < super.getLatinSquare().length; j++) {
			if (hasDuplicates(getColumn(j)))
				return false; 
	    }
		if (!super.isLatinSquare())
				return false;
		
		for(int i = 1; i < super.getLatinSquare().length; i++) {
			if (!hasAllValues(getRow(0), getRegion(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	protected boolean isValueValid(int iValue, int Col, int Row) {
		if (!super.doesElementExist(super.getRow(Row), iValue)) {
			if (!super.doesElementExist(super.getColumn(Col), iValue)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	}
	
	
	
	


