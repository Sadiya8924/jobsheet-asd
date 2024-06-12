public class GraphMatriks24{
    int vertex;
    int[][] matriks;

    public GraphMatriks24(int v){
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = -1;
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++){
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++){
                if(matriks[i][j] != -1){
                    System.out.print("Gedung " + (char) ('A' + j) + "(" + matriks[i][j] + " m), ");
                }
            }System.out.println();
        }
    }

    public int inDegree(int vertex){
        int degree = 0;
        for (int i = 0; i < this.vertex; i++){
            if (matriks[i][vertex] != -1){
                degree++;
            }
        }
        return degree;
    }

    public int outDegree(int vertex){
        int degree = 0;
        for (int j = 0; j < this.vertex; j++){
            if (matriks[vertex][j] != -1){
                degree++;
            }
        }
        return degree;
    }

    public void degree(int vertex){
        int inDegree = inDegree(vertex);
        int outDegree = outDegree(vertex);
        System.out.println("InDegree dari gedung " + (char) ('A' + vertex) + ": " + inDegree);
        System.out.println("InDegree dari gedung " + (char) ('A' + vertex) + ": " + outDegree);
        System.out.println("InDegree dari gedung " + (char) ('A' + vertex) + ": " + (inDegree + outDegree));
        System.out.println();
    }
}