import processing.core.PApplet;

class Ball{
    private final PApplet p;
    int y;
    int speed;
    Ball(PApplet p, int num1, int i){
        this.p = p;
        this.y = num1;
        this.speed = i;
    }
    void method(int x){
        x = x*speed;
        p.ellipse(x,y, 20,20);
    }
}

public class ChallengeInJava extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    Ball b1, b2, b3, b4;
    int x;
    public static void main(String[] args) {
        PApplet.main("ChallengeInJava", args);
    }

    @Override
    public void settings() {
        size(WIDTH, 510);
    }

    @Override
    public void setup() {
        b1 = new Ball(this, HEIGHT/4, 1);
        b2 = new Ball(this,HEIGHT/2,2);
        b3 = new Ball(this,3*HEIGHT/4,3);
        b4 = new Ball(this,HEIGHT,4);
    }

    @Override
    public void draw() {
        x++;
        b1.method(x);
        b2.method(x);
        b3.method(x);
        b4.method(x);
    }
}
