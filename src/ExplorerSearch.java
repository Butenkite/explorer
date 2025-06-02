import java.util.ArrayList;
import java.util.List;

public class ExplorerSearch {

    /**
     * Returns how much land area an explorer can reach on a rectangular island.
     * 
     * The island is represented by a rectangular int[][] that contains
     * ONLY the following nunbers:
     * 
     * '0': represents the starting location of the explorer
     * '1': represents a field the explorer can walk through
     * '2': represents a body of water the explorer cannot cross
     * '3': represents a mountain the explorer cannot cross
     * 
     * The explorer can move one square at a time: up, down, left, or right.
     * They CANNOT move diagonally.
     * They CANNOT move off the edge of the island.
     * They CANNOT move onto a a body of water or mountain.
     * 
     * This method should return the total number of spaces the explorer is able
     * to reach from their starting location. It should include the starting
     * location of the explorer.
     * 
     * For example
     * 
     * @param island the locations on the island
     * @return the number of spaces the explorer can reach
     */
    public static int reachableArea(int[][] island) {
        // Implement your method here!
        // Please also make more test cases
        // I STRONGLY RECOMMEND testing some helpers you might make too

        // size of island
        int rows = island.length;
        if(rows == 0) return 0;
        int cols = island[0].length;
        // explorer coordinates
        int x = -1;
        int y = -1;
        // visited 
        boolean[][] visited = new boolean[rows][cols];

        // find explorer
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (island[i][j] == 0) {
                    x = i;
                    y = j;
                }
            }
        }

        // didnt find it
        if (x == -1 || y == -1) return 0;

        // recurse through helper
        reachableAreaHelper(island, x, y, visited);
        // Count the number of visited cells
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (visited[i][j]) count++;
            }
        }
        return count;
    }

    public static void reachableAreaHelper(int[][] island, int xCoordinate, int yCoordinate, boolean[][] visited){
        // base cases
        if (xCoordinate < 0 || yCoordinate < 0 || xCoordinate >= island.length || yCoordinate >= island[0].length) return;
        if (visited[xCoordinate][yCoordinate] || island[xCoordinate][yCoordinate] == 2 || island[xCoordinate][yCoordinate] == 3) return;

        visited[xCoordinate][yCoordinate] = true;
        reachableAreaHelper(island, xCoordinate + 1, yCoordinate, visited); 
        reachableAreaHelper(island, xCoordinate - 1, yCoordinate, visited); 
        reachableAreaHelper(island, xCoordinate, yCoordinate + 1, visited); 
        reachableAreaHelper(island, xCoordinate, yCoordinate - 1, visited); 
    }
    
}
