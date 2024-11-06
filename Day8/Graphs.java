
//create a Graph
class Graph{
    private int n;//Number of Verteces
    private int[][] g=new int[10][10];

    Graph(int x){
        this.n=x;
        int i,j;


        // initialize each element of the matrix
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                g[i][j]=0;
            }

            //Display of MAtrix
            public void displayMatrix(){
                System.out.println("\n Adj matrix ");
                for (int i=0;i<n;i++){
                    System.out.println();
                    for (int j=0;j<n;j++){
                        System.out.print(" "+g[i][j]);
                    }
                }
            }
        }
    }
}


//Adding Edges between vertices in graph

public void addEdge(int x, int y)
{
    // checks if the vertex exists in the graph
    if ((x >= n) || (y > n)) {
        System.out.println("Vertex does not exists!");
    }

    // checks if the vertex is connecting to itself
    if (x == y) {
        System.out.println("Same Vertex!");
    }
    else {
        // connecting the vertices
        g[y][x] = 1;
        g[x][y] = 1;
    }
}


