package recursion.backtracking;

import java.util.Scanner;

public class RatInaMaze {
	static boolean ans = false;
	static boolean p = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		int[][] res = new int[n][m];
		for(int i=0; i <n;i++){
			String str=sc.next();
			for(int j=0;j<m;j++){
				maze[i][j]=str.charAt(j);
			}
		}
		BlockedMaze(maze,0, 0, res);
		if (!ans) {
			System.out.println("-1");
		}

	}
	public static void BlockedMaze(char[][] maze,int row,int col,int[][] result){
		//positive base case
		if(row == maze.length-1 && col == maze[0].length-1){
			result[row][col] = 1;
			if (!p) {
				display2(result);
				p = true;
				ans = true;
			}
			return;
			
		}
		//negative basecase
		if(row==maze.length || col==maze[0].length ||  maze[row][col]=='X'){
			return;
		}
		//put a mark
		result[row][col]=1;
		//Right
		
		    BlockedMaze(maze, row, col+1,result);
		//Down
		    BlockedMaze(maze, row+1, col,result);
		
		result[row][col]=0;
	}
	public static void display2(int[][] result) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
