package DSA;

public class Maze {
    public static void prtMat(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j]);
                if(j != mat[0].length - 1) System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static int[][] mazeGen(int height, int width, double percent){
        int[][] maze = new int[height][width];
        //set wall
        for(int i = 0; i < height; ++i){
            maze[i][0] = 1;
            maze[i][width - 1] = 1;
        }
        for(int j = 0; j < width; ++j){
            maze[0][j] = 1;
            maze[height - 1][j] = 1;
        }
        //set obstacles
        ///set numbers of positions for obstacles
        int numOfObt = (int)((height - 2) * (width - 2) * percent);
        for(int i = 0; i < numOfObt; ++i){
            int randh = (int)(Math.random() * height);
            int randw = (int)(Math.random() * width);
            if(maze[randh][randw] == 1) {
                i--;
                continue;
            } else {
                maze[randh][randw] = 1;
            }
        }
        //set inport
        maze[0][1] = 0;
        //set out port
        maze[height - 1][width - 2] = 0;
        //make an area for going deep
        for(int i = 1; i < 3; ++i)
            for(int j = 1; j < 3; ++j) maze[i][j] = 0;
        return maze;
    }

    public static boolean findWay(int[][] maze, int i, int j){
        if(i < 0 || i >= maze.length) return false;
        if(j < 0 || j >= maze[0].length) return false;
        if(maze[maze.length - 1][maze[0].length - 2] == 2) return true;
        //if maze[i][j] haven't been visited
        try{
            if(maze[i][j] == 0){
                //suppose maze[i][j] can lead to out port
                maze[i][j] = 2;
                if(findWay(maze, i - 1, j)) return true;
                else if(findWay(maze, i, j - 1)) return true;
                else if(findWay(maze, i + 1, j)) return true;
                else if(findWay(maze, i, j + 1)) return true;
                else {
                    maze[i][j] = 3;
                    return false;
                }
            }
        } catch(Exception e){
            prtMat(maze);
            e.printStackTrace();
        }
        return false;
    }
}
