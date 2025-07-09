
import java.util.*;



public class AdjacencyMatrix {

    // public static  void addEdge(int[][] mat, int i, int j){
    //     mat[i][j] = 1;
    //     mat[j][i] = 1;
    //     }

    public static void PrintMatrix(int[][] mat){
        int n = mat.length;

        for(int i =0; i<n; i++){
            for(int j =0; j <n; j++){
                System.out.print( mat[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);





        System.out.println("Enter the vertices");
        int v = sc.nextInt();
        System.out.println("Enter the edges");
        int e= sc.nextInt();

        System.out.println();

        int[][] mat = new int[v][v];



        for(int i =0;  i< e; i++){

            int u = sc.nextInt();
            int w = sc.nextInt();

            mat[u][v] = 1;
            mat[v][u] = 1;
          
            
        }


        System.out.println("\nAdjacency Matrix:");
        PrintMatrix(mat);

        sc.close();

        
       
       




    }
    
}
