
public class E15139Ball {
    public static void main(String args[]){
        //creating new ball b1.
        Ball b1=new Ball(0.0,1.0,10.0,45.0);

        //update time by 5 seconds.
        b1.updateTime(5.0);

        //creating new ball b2.
        Ball b2=new Ball(0.0,1.0,20.0,45.0);

        //update time by 5 seconds.
        b2.updateTime(5.0);

        //check whether b1 and b2 collides.
        if(b2.willCollide(b1)==true){
            System.out.println("B1 and B2 will collide");
        }
        else{
            System.out.println("B1 and B2 won’t collide");
        }

        //creating new ball b3.
        Ball b3=new Ball(-10.0,5.0,3.0,30.0);

        //update time by 20 seconds.
        b3.updateTime(20.0);

        //check whether b2 and b3 collides.
        if(b3.willCollide(b2)==true){
            System.out.println("B2 and B3 will collide");
        }
        else{
            System.out.println("B2 and B3 won’t collide");
        }

    }
}


class Ball {
    double xFinalPosition;
    double xInitialPosition;
    double yFinalPosition;
    double yInitialPosition;
    double speedOfBall;
    double angle;
    double t;

    //ball constructor.
    Ball(double x, double y, double speed, double angleOfSpeedWithX) {
        xInitialPosition = x;
        yInitialPosition = y;
        speedOfBall = speed;
        angle = angleOfSpeedWithX * Math.PI / 180;
        xFinalPosition = xInitialPosition + (speed * Math.cos(angle) * t);
        yFinalPosition = yInitialPosition + (speed * Math.sin(angle) * t);
    }

    //method to update time.
    public void updateTime(double time) {
        t = time;
    }

    //method to check whether they collide.
    public boolean willCollide(Ball b1) {
        if ((b1.xFinalPosition == this.xInitialPosition) && (b1.yFinalPosition ==this.yInitialPosition)) {
            return true;
        } else  {
            return false;
        }
    }

}