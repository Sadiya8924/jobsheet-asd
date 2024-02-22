public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon = new Dragon(0, 0, 10, 10);
        dragon.moveRight();
        dragon.moveDown();
        dragon.printPosition();
        dragon.moveDown();
        dragon.moveRight();
        dragon.moveRight();
    }
}