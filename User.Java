public class User {

    //User Vairables
    private double money;
    private double attack;
    private double speed; 
    private double health;
    private double maxHealth;
    private boolean alive;

    public void User() {

        //initalizies the variables with starting scores
        money = 0.0;
        attack = 1.0;
        speed = 1.0;
        health = 10.0;
        maxHealth = 10.0
    }

    public boolean dead(){
        //if health drops below 0 their dead
        if(health =< 0){
            alive = false;
        }

        return alive;
    }

    //Updates the attk damage
    public void setAttk(double attk){
        if(attack < attk){
            attack = attk;
        }
    }

    //getter for attack damage
    public double getAttk(){
        return attack;
    }

    //updates the speed
    public void setSpeed(double speed){
        if(this.speed < speed){
            this.speed = speed;
        }
    }

    //getter for attack damage
    public double getSpeed(){
        return speed;
    }

    //Updates the Health
    public void setHealth(double health, Boolean kill, double eneDam){
        //first checks if there was a kill if not then they must be fighting so damage
        if(kill){
            this.health = maxHealth;
        }
        else if(this.health > 0){
            this.health=-eneDam;
        }
        
        //checks if dead
        dead(this.health);
        
    }

    //updates the Money
    public void setSpeed(double speed){
        if(this.speed < speed){
            this.speed = speed;
        }
    }

    //getter for Money
    public double getSpeed(){
        return speed;
    }
}