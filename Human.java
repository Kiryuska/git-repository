package Participants;

public class Human implements Participants{
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxswimDistance;

    boolean active;

    @Override
    public boolean isOnDistance() {
        return active;
    }



    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxswimDistance = 200;
        this.active = true;
    }

    @Override
    public void run (int dist){
        if (dist<=maxRunDistance){
            System.out.println(name + " хорошо справился с кроссом");
        }else{
            System.out.println(name + " не справился с кроссом");
            active = false;
        }
    }
    @Override
    public void jump (int dist) {
        if (dist <= maxJumpHeight) {
            System.out.println(name + " удачно перепрыгнул через стену");
        } else {
            System.out.println(name + " не смог перепрыгнуть через стену");
            active = false;
        }
    }

    public void swim (int dist) {
        if (dist ==0){
            System.out.println(name + " не умеет плавать");
            active = false;
            return;
        }
        if (dist <= maxswimDistance) {
            System.out.println(name + " отлично проплыл");
        } else {
            System.out.println(name + " не смог проплыть");
            active = false;
        }
    }

    @Override
    public void info() {
        System.out.println(name+" "+active);

    }




}
