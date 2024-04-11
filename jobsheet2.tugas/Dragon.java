public class Dragon {
    int x = 0, y = 0, width = 0, height = 0;

    public Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        if (x >= 0) {
            x--;
        }
    }

    public void moveRight() {
        if (x < width) {
            x++;
        }
    }

    public void moveUp() {
        if (y >= 0) {
            y--;
        }
    }

    public void moveDown() {
        if (y < height) {
            y++;
        }
    }

    public void printPosition() {
        if (x >= 0 && x < width && y >= 0 && y < height){
            System.out.println("Position: (" + x + ", " + y + ")");
        } else {
            detectCollision();
        }
    }

    public void detectCollision() {
        System.out.println("GAME OVER!");
    }
}