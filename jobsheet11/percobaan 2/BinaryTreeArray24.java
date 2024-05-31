public class BinaryTreeArray24 {
    int[] data; 
    int idxLast;

    public BinaryTreeArray24(){
        data = new int[10];
    }

    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }

    void transverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            transverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            transverseInOrder(2 * idxStart + 2);
        }
    }
}