public class PreyPredator {
    
    public static void main(String[] args) {
        boolean rabbitIsDead = false;
        
        Animal rabbit = new Animal();
        Animal snake = new Animal();
        snake.setAnimalType(false);
        rabbit.setAnimalType(true);
        
        resetGame(rabbit, snake);
        System.out.println("********* Game start ************");
        System.out.println("Start position Snake x: " + snake.getX() + " Snake y: " + snake.getY());
        System.out.println("Start position Bunny x: " + rabbit.getX() + " Bunny y: " + rabbit.getY() + "\n");
        
        
  // Koden bunnyIsDead vil forsætte indtil collision er true, hvor den vil lave "system.out.println" og så break så koden stopper.
  
  
        while(rabbitIsDead == false){
            if (collision(rabbit, snake) == true) {
                rabbitIsDead = true;
                System.out.println("Ahhrrrrrr im eatin you ha ha! GAME OVER");
                break;
            } else {
                 System.out.println("********* New Move ************");
                rabbitIsDead = false;
            }
            
            snake.nextMove();
            System.out.println("Snake x: " + snake.getX() + " Snake y: " + snake.getY());
            
           rabbit.nextMove();
            System.out.println("Rabbit x: " + rabbit.getX() + " Rabbit y: " + rabbit.getY() + "\n");
            
        }
        
    }
// Metoden samligner positionerne for at se om vi stadigvæk kan spille videre indtil at collision er true og at de rammer hinanden, hvor spillet vil afslutte. 
    private static boolean collision(Animal rabbit, Animal snake) {
         if (rabbit.getX() == snake.getX() && rabbit.getY() == snake.getY()) {
            return true;
        } else if (rabbit.getX() == (snake.getX() +1) && rabbit.getY() == snake.getY())  { //snake is right beside
            System.out.println("Nooooo Please don't eat me!! \t Snake is right to you");
            return false;
        } else if (rabbit.getX() == (snake.getX() -1) && rabbit.getY() == snake.getY()) { //snake is left beside
            System.out.println("Nooooo Please don't eat me!! \t Snake is left to you");
            return false;
        }else if (rabbit.getX() == snake.getX() && rabbit.getY() == (snake.getY() + 1)) { //snake is above
            System.out.println("Nooooo Please don't eat me!! \t Snake is above you");
            return false;
        }
        else if (rabbit.getX() == snake.getX() && rabbit.getY() == (snake.getY() - 1)) { //snake is under
            System.out.println("Nooooo Please don't eat me!! \t Snake is under you");
            return false;
        }
         else {
            return false;
        }
    }
    
      private static void resetGame(Animal rabbit, Animal snake) {
         snake.setX();
         snake.setY();
         rabbit.setX();
         rabbit.setY();
    }
     
}
