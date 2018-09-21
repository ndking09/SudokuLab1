package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {
	
	private int iSize;
	private int iSqrtSize; 
	
	
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
				
				System.out.println("J: " j + "  " + "I: " + i);
				
				reg[iCnt++] =super.getLatinSquare()[j][i];
			}
			}
		return super.getLatinSquare();
	}
	
	
	
	protected int[] getRegion(int col, int Row) {
		return null;
	}
	protected boolean isSudoku() {
		return false;
	}
	
	protected boolean isPartialSudoku() {
		return false;
	}
	
	protected boolean isValueValid(int iValue, int Col, int Row) {
		return false;
	}
	
	
	}
	
	
	
	
}

