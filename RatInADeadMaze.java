
//Rat In A dead Maze(All direction right or  down or left or Upper)
/*
 * row=3
 * col=3
 *=========================
 *=  S  =     =     =  X  =
 *=========================
 *=     =     =     =     =
 *=========================
 *=  X  =     =     =  D  =
 *=========================
 */
public class RatInADeadMaze{
    public static void mazePath(int sr,int sc,int ec,int er,String s,int[][] maze)
    {   
    	if(sr>er ||sc>ec)
    	{
    		return;
    	}
    	if(sr<0||sc<0)
    	{
    		return;
    	}
    	if(maze[sr][sc]==0)
    	{
    		return;
    	}
    	if(maze[sr][sc]==-1)
    	{
    		return;
    	}
    	if(sr==er && sc==ec)
    	{
    		System.out.println(s);
    		return;
    	}
    	maze[sr][sc]=-1;
    	//in right
    	mazePath(sr,sc+1,er,ec,s+"R",maze);
    	//in down
    	mazePath(sr+1,sc,er,ec,s+"D",maze);
    	//in left
    	mazePath(sr,sc-1,er,ec,s+"R",maze);
    	//in upp
    	mazePath(sr-1,sc,er,ec,s+"R",maze);
    	
    	//backtraking
    	maze[sr][sc]=1;
    }
	public static void main(String[] args) {
		int[][] maze= {
			      {1,1,0,1},
			      {1,1,1,1},
			      {0,1,1,1},
			      {0,1,0,1}
	              };
		mazePath(0,0,3,3,"",maze);
	}

}
