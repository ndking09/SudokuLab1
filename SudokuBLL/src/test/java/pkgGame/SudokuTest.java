package pkgGame;


import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;


public class SudokuTest {

	
	

	@Test

	public void getPuzzleTest() throws Exception {

	       int[][] sudo= {{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

	       Sudoku square= new Sudoku(sudo);

	       int[][] array1= {{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

	       int[][] array2= square.getPuzzle();

	       assertTrue(Arrays.deepEquals(array1,array2));
	}

	      

	@Test

	public void getRegionTest() throws Exception {

	       int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

	       Sudoku sudPuzz = new Sudoku(sudo);

	       int[] region1={6,7,8,1,9,5,3,4,2};

	       int region=1;

	       int[] regionTest1= sudPuzz.getRegion(region);

	       assertTrue(Arrays.equals(region1,regionTest1));

	}

	@Test

	public void getRegionTest1() throws Exception {

	       int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

	       Sudoku sudPuzz = new Sudoku(sudo);

	       int[] region1={5,3,4,6,7,2,1,9,8};

	       int region=0;

	       int[] regionTest1= sudPuzz.getRegion(region);

	       assertTrue(Arrays.equals(region1,regionTest1));

	}



	@Test

	public void getRegionTest2() throws Exception {

	       int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

	       Sudoku sudPuzz = new Sudoku(sudo);

	       int[] region1={2,8,4,6,3,5,1,7,9};

	       int region=8;

	       int[] regionTest1= sudPuzz.getRegion(region);

	       assertTrue(Arrays.equals(region1,regionTest1));

	}





	@Test

	public void getRegionTest3() throws Exception {

	       int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

	       Sudoku sudPuzz = new Sudoku(sudo);

	       int[] region1={6,7,8,1,9,5,3,4,2};

	       int region=1;

	       int[] regionTest1= sudPuzz.getRegion(region);

	       assertTrue(Arrays.equals(region1,regionTest1));

	}



	@Test

	public void getRegionTest4() throws Exception {

	       int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

	       Sudoku sudPuzz = new Sudoku(sudo);

	       int[] region1={6,7,8,1,9,5,3,4,2};

	       int region=2;

	       int[] regionTest1= sudPuzz.getRegion(region);

	       assertFalse(Arrays.equals(region1,regionTest1));

	}



	@Test

	public void getRegionTest5() throws Exception {

	       int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

	       Sudoku sudPuzz = new Sudoku(sudo);

	       int[] region1={6,7,8,1,9,5,3,4,2};

	       int region=7;

	       int[] regionTest1= sudPuzz.getRegion(region);

	       assertFalse(Arrays.equals(region1,regionTest1));

	}



	@Test

	public void isSudokuTest1() throws Exception {

	       int[][] sudo={{5,3,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

	       Sudoku s= new Sudoku(sudo);

	       assertTrue(s.isSudoku());

	}



	@Test

	public void isSudokuTest2() throws Exception {

	       int[][] sudo={{5,0,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

	       Sudoku s= new Sudoku(sudo);

	       assertFalse(s.isSudoku());

	}



	@Test

	public void isSudokuTest3() throws Exception {

	       int[][] sudo={{5,5,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

	       Sudoku s= new Sudoku(sudo);

	       assertFalse(s.isSudoku());

	}



	@Test

	public void isSudokuTest() throws Exception {

	       int[][] sudo={{5,10,4,6,7,2,1,9,8},{6,7,8,1,9,5,3,4,2},{9,1,2,3,4,8,5,6,7},{8,5,9,4,2,6,7,1,3},{7,6,1,8,5,3,9,2,4},{4,2,3,7,9,1,8,5,6},{9,6,1,2,8,7,3,4,5},{5,3,7,4,1,9,2,8,6},{2,8,4,6,3,5,1,7,9}};

	       Sudoku s= new Sudoku(sudo);

	       assertFalse(s.isSudoku());

	}



	@Test

	public void isPartialSudokuTest1() throws Exception {

	       int[][] sudok={{5,3,0,6,0,0,0,9,8},{0,7,0,1,9,5,0,0,0},{0,0,0,0,0,0,0,6,0},{8,0,0,4,0,0,7,0,0},{0,6,0,8,0,3,0,2,0},{0,0,3,0,0,1,0,0,6},{0,6,0,0,0,0,0,0,0},{0,0,0,4,1,9,0,8,0},{2,8,0,0,0,5,0,7,9}};

	       Sudoku su= new Sudoku(sudok);

	       assertTrue(su.isPartialSudoku());

	}



	@Test

	public void isPartialSudokuTest2() throws Exception {

	       int[][] sudok={{10,3,0,6,0,0,0,9,8},{0,7,0,1,9,5,0,0,0},{0,0,0,0,0,0,0,6,0},{8,0,0,4,0,0,7,0,0},{0,6,0,8,0,3,0,2,0},{0,0,3,0,0,1,0,0,6},{0,6,0,0,0,0,0,0,0},{0,0,0,4,1,9,0,8,0},{2,8,0,0,0,5,0,7,9}};

	       Sudoku su= new Sudoku(sudok);

	       assertFalse(su.isPartialSudoku());

	}



	@Test

	public void isPartialSudokuTest() throws Exception {

	       int[][] sudok={{5,5,0,6,0,0,0,9,8},{0,7,0,1,9,5,0,0,0},{0,0,0,0,0,0,0,6,0},{8,0,0,4,0,0,7,0,0},{0,6,0,8,0,3,0,2,0},{0,0,3,0,0,1,0,0,6},{0,6,0,0,0,0,0,0,0},{0,0,0,4,1,9,0,8,0},{2,8,0,0,0,5,0,7,9}};

	       Sudoku su= new Sudoku(sudok);

	       assertFalse(su.isPartialSudoku());

	}

	      

	@Test

	public void isValueValid() throws Exception{

	       int[][] region1= {{1,2,3,4},{4,3,2,1},{3,1,4,2},{2,4,1,3}};

	       Sudoku sudPuzz= new Sudoku(region1);

	       assertTrue(sudPuzz.isValueValid(0,0,5));

	}



	@Test

	public void isValueValidTest1() throws Exception{
	       int[][] region2={{1,2,3,4},{4,3,2,1},{3,1,4,2},{2,4,1,3}};
	       Sudoku sudPuzz1= new Sudoku(region2);
	       int i= sudPuzz1.getiSize();
	       assertFalse(sudPuzz1.isValueValid(0,0,2));
	}
	}



	

