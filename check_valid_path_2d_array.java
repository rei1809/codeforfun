/*
Given a 2D array(m x n). The task is to check if there is any path from top left to bottom right. In the matrix, -1 is considered as blockage (can’t go through this cell) and 0 is considered path cell (can go through it).

Note: Top left cell always contains 0
*/

import java.io.*;

class GFG {
    
    
    static boolean isPath(int[][] arr, int row, int col){
        arr[0][0]=1;
        
        for(int i=1;i<row;i++){
            if (arr[i-1][0] != -1){
                arr[i][0] = arr[i-1][0];
            }
        }
        for(int j=1;j<col;j++){
            if(arr[0][j-1] != -1){
                arr[0][j] = arr[0][j-1]; 
            }
        }
        
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(arr[i][j] != -1){
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        
        
        return (arr[row-1][col-1] == 1);
    }
	public static void main (String[] args) {
	    int row = 5;
	    int col = 5;
		int[][] arr = {
		    {0,0,0,-1,0},
		    {-1,0,0,-1,-1},
		    {0,0,0,-1,0},
		    {-1,0,-1,0,0},
		    {0,0,0,0,0}
		};
		
		if(isPath(arr,row,col)){
		    System.out.println("yes");
		}
		else{
		    System.out.println("No");
		}
	}
}
