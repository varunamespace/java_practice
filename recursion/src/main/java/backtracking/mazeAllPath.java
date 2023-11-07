package backtracking;

import java.util.Arrays;

public class mazeAllPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int[][]path = new int[board.length][board[0].length];
        printMaze("",board,0,0,1,path);

    }
    static void printMaze(String p, boolean[][] maze, int r , int c , int step, int[][] path){
        if(r== maze.length-1 && c== maze[0].length-1){
            path[r][c] = step;
            for(int[] arr:path){
                //System.out.println(Arrays.toString(arr));
            }
            maze[r][c] = true;
            System.out.println("\n");
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r<maze.length-1){
                printMaze(p+'d',maze,r+1,c,step+1,path);
        }
        if(c<maze[0].length-1){
            printMaze(p+'r',maze,r,c+1,step+1,path);
        }
        if(r>0){
            printMaze(p+'u',maze,r-1,c,step+1,path);
        }
        if(c>0){
            printMaze(p+'l',maze,r,c-1,step+1,path);
        }
        path[r][c] = 0;
        maze[r][c] = true;
    }

}
