public class BinaryTreeArrayMain24{
    public static void main(String[] args) {
      BinaryTreeArray24 bta = new BinaryTreeArray24();
      int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
      int idxLast = 6;
      bta.populateData(data, idxLast);
      System.out.print("\nInOrder Transversal : ");
      bta.transverseInOrder(0);
      System.out.print("\n");  
    }
}