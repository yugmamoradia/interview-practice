/**
 * Given a grid of 1's and 0's, 1 being land and 0 being water. Calculate the number of islands in the grid.
 */

public class FindNumberOfIsland {
    public static void main(String[] args) {
        int[][] grid = {
                        {1, 1, 1, 0},       //sample input of grid
                        {1, 0, 0, 0},
                        {1, 0, 1, 1},
                        {0, 1, 0, 0}
                        };

        System.out.println(numOfIsland(grid));

    }
    public static int numOfIsland(int[][] grid){
        int row = grid.length;  // defines the length of the row in the grid
        int column;
        int islandCount = 0;
        if(row == 0)
            return 0; //check whether the grid is empty
        else
            column = grid[0].length; // get the column length of the grid by accessing one of the columns' index.
        boolean[][] visited = new boolean[row][column]; // create a 2-D array of boolean to store the visited and unvisited states

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(!visited[i][j] && grid[i][j] == 1){  // traverse through the grid and check if current node is visited and the value is 1
                    markNeighbors(grid, visited, i, j); // if the condition satisfies call the  markNeighnors function to marks all the 8 adjacent nodes of curresnt node as visited.
                    ++islandCount;
                }
            }
        }
        return islandCount;
    }

    public static void markNeighbors(int[][] grid, boolean[][] visited, int row, int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || visited[row][col] || grid[row][col] != 1)
            return; // checking for false conditions of the passed parameters

        visited[row][col] = true; // marking the current node as visited
        markNeighbors(grid, visited, row -1, col); // calling the same function again to mark the adjecent neighnors as visited.
        markNeighbors(grid, visited, row +1, col);
        markNeighbors(grid, visited, row , col -1);
        markNeighbors(grid, visited, row , col +1);
    }
}
