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
        // return amount of tiles in visited
        return -1;
    }

    public static void reachableAreaHelper(int[][] island, int row, int col, boolean[][] visited){

    }

    // helper params: currentCoordinates(first time explorer coordinates), island, visited
        // we already know if there is a explorer, so dont need to check for null
        // add current tile to visited
        // check in each direction from the coordinates
            // if in range of island AND traversable
               // recurse at coordinate
}
