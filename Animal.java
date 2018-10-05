import java.util.Random;

public class Animal {
    int x = 0;
    int y = 0;
    boolean isPrey = false;
    
    Random random = new Random();
    
    public void getStartPosition() {
        
    }
    
    public void setX(){
        x = random.nextInt(10) + 1;
       
    }
    
    public void setY(){
        y = random.nextInt(10) + 1;
       
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setAnimalType(boolean isPrey){
        if (isPrey == true) {
            this.isPrey = true;
        } else {
            this.isPrey = false;
        }
    }
    // Dette er hvor b�de slangen og rabbit vil bev�ge sig i op mod 4 retninger, som kan t�nkes p� et XY koordinat s�t. OP/NED/H�JRE/VENSTRE
    // if (x>0) og (x<10) bruges til at slange og rabbit ikke vil g� ud af 10x10 XY koordinat s�ttet til f.eks. -1 og 11.  
    public void nextMove(){
        int nextMove = random.nextInt(4) + 1;
        if (nextMove == 1) {
            if (x < 10) {
                x = x + 1;
            }
        } else if (nextMove == 2) {
            if (x > 0) {
                x = x - 1;
            }
                    
        } else if (nextMove == 3) {
            if (y < 10) {
                y = y + 1;
            }
        } else {
            if (y > 0){
              y = y - 1;   
            }
        }
    }
}
