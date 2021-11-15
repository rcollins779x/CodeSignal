// Course: CS3642
// Student name: Ronnin Collins
// Student ID: xxx-xx-xxxx
// Assignment #: 2
// Due Date: 7/11/2021
// Signature: Rennan Collins
package _3642.N_Queens_Problem.board;

import _3642.N_Queens_Problem.component.BlankSpace;
import _3642.N_Queens_Problem.component.Queen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.System.in;
import static java.lang.System.out;

public abstract class Board {
	//Member variables
	static char[] vertical_notes;
	static int[] horizontal_nums;
	public static Piece[][] board;
	private static int dimension;
	private static final Scanner scanner = new Scanner(in);
	static ArrayList<int[]> solution = new ArrayList<int[]>();

	public static void setup(){	//initializing board to dynamic size
		board = new Piece[dimension][dimension];
		vertical_notes = new char[dimension];
		horizontal_nums = new int[dimension];

		//populating board with blank spaces
		for(int i = 0; i < dimension; i++){
			vertical_notes[i] = (char) (i + 65);
			horizontal_nums[i] = i + 1;
			for(int j = 0; j < dimension; j++) board[i][j] = new BlankSpace();
		}
	}

	public static void draw(){
		//printing letters across the top
		IntStream.range(0, vertical_notes.length).forEach(j -> out.printf(j == 0 ? "     %c  " : "  %c  ", vertical_notes[j]));
		out.printf("%n   ");
		IntStream.range(0, board.length).forEach(j -> out.print(" --- ")); out.printf("%n");

		IntStream.range(0, board.length).forEach(i -> {								//looping through the board and printing symbols
			out.printf(dimension - i > 9 ? " %d" : " %d ", dimension - i); 			//print number on left side
			Arrays.stream(board[i]).forEach(j -> out.printf("|%s|", j.getSymbol()));
			out.printf(dimension - i > 9 ? "%d%n   " : " %d%n   ", dimension - i); 	//print number on right side
			Arrays.stream(board[i]).map(ignored -> " --- ").forEach(out::print); out.printf("%n");
		});
		//printing letters across the bottom
		IntStream.range(0, vertical_notes.length).forEach(j -> out.printf(j == 0 ? "     %c  " : "  %c  ", vertical_notes[j]));
		out.printf("%n");
	}

	public static void getDimension() {
		out.print("Size of board: ");
		dimension = Math.max(scanner.nextInt(), 1);
	}
	public static void solutionFinder(boolean verbose) {
		int[] pos = new int[dimension];
		int iter = 1, count = 0;

		String start = "";
		String end = "0";
		for(int i = 1; i < dimension; i++) {
			start += i;
			end = i + end;
		}
		long a = Long.parseLong(start, dimension) + dimension - 1;	//Determining min bound
		long z = Long.parseLong(end, dimension) - dimension + 1;	//determining max bound
		long base10a = Long.parseLong(Long.toString(a, 10));
		long base10z = Long.parseLong(Long.toString(z, 10));
		for(long i = base10a; i < base10z; i+= dimension - 1, iter++) {
			String temp = Long.toString(i, dimension);

			if (temp.length() < dimension) temp = "0" + temp;												//pad length with "0"s

			if(Integer.parseInt("" + temp.charAt(1)) - Integer.parseInt("" + temp.charAt(0)) == 1)
				continue;


			for (int j = 0; j < dimension; j++) pos[j] = Integer.parseInt(String.valueOf(temp.charAt(j)), dimension);	//convert char[] to int[]
			if(verbose) out.println("pos[]: " + Arrays.toString(pos));

			if(checkValid(pos)) {																			//if valid print valid pos
				out.println(Arrays.toString(pos) + " solution #" + ++count);
				for(int k = 0; k < dimension; k++) board[k][pos[k]] = new Queen();          			  	//populate valid positions
				draw();																						//draw board
				resetBoard(); 																				//reset board
				}

		}
		String temp = String.valueOf(iter), time = "";
		for(int i = temp.length() - 1, j = 1; i >= 0; i--, j++) {
			time = temp.charAt(i) + time;
			if(j > 1 && j < temp.length() && j % 3 == 0) time = "," + time;
		}
		out.println("Total results: " + count + " Total iterations: " + time);
		int [][] test = new int [4][];
		for (int i = 0; i < test.length; i++)
			test[i] = new int [4];
	}
/*
	static void algorithm() {	//custom algorithm to populated BlankSpaces with Queens
		int size = board.length, count;
		int[] loop = {1, 2, 3, 4, 5, 6, 7};
		int[] iter = {0, 0, 0, 0, 0, 0, 0};

		for (iter[0] = 0; iter[0] < (loop[0] > size ? 1 : size); iter[0]++) { // iterates row 1
			resetBoard();
			for (iter[1] = 0; iter[1] < (loop[1] > size ? 1 : size); iter[1]++) { // iterates row 2
				for (iter[2] = 0; iter[2] < (loop[2] > size ? 1 : size); iter[2]++) { // iterates row 3
					for (iter[3] = 0; iter[3] < (loop[3] > size ? 1 : size); iter[3]++) { // iterates row 4
						for (iter[4] = 0; iter[4] < (loop[4] > size ? 1 : size); iter[4]++) { // iterates row 5
							for (iter[5] = 0; iter[5] < (loop[5] > size ? 1 : size); iter[5]++) { // iterates row 6
								for (iter[6] = 0; iter[6] < (loop[6] > size ? 1 : size); iter[6]++) { // iterates row 7
									for(int i = 0, check = -1; i < size; i++) {
										//Checks if index is blank, if so places queen and fills invalid locations with X
										if (board[++check][iter[check]].getSymbol().equals("   ")) {
											board[check][iter[check]] = new Queen();
											//fillInvalid(check, iter[check]);
											//if (dimension == ++count) //If total queens matches solution #, draw board
										}
									}
									if(checkValid(iter)) draw();
									resetBoard();
								}
							}
						}
					}
				}
			}
		}
	}
*/
	private static boolean checkValid(int[] iter) {
		for (int i = 0; i < dimension; i++)
			for (int j = i + 1; j < dimension; j++)
				//Removes vertical dupes or		 (\) direction 		 or		 (/) direction
				if (iter[i] == iter[j] || Math.abs(iter[i] - iter[j]) - Math.abs(j - i) == 0) return false;
		solution.add(iter);
		return true;
	}

	private static void resetBoard() {
		for(int i = 0; i < dimension; i++)
			for (int j = 0; j < board.length; j++)
				board[i][j] = new BlankSpace();        //Reset board for next attempt
	}
}
