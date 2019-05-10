package Participants;

public class Animal implements Participants {

    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxswimDistance;

    boolean onDistance;

    @Override
    public boolean isOnDistance(){
        return onDistance;
    }
    //Конструктор
    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxswimDistance, boolean onDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxswimDistance = maxswimDistance;
        this.onDistance = onDistance;
    }

    @Override
    public void run (int dist){
        if (dist<=maxRunDistance){
            System.out.println(type +" "+ name + " хорошо справился с кроссом");
        }else{
            System.out.println(type +" "+ name + " не справился с кроссом");
            onDistance = false;
        }
    }
    @Override
    public void jump (int dist) {
        if (dist <= maxJumpHeight) {
            System.out.println(type + " " + name + " удачно перепрыгнул через стену");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть через стену");
            onDistance = false;
        }
    }

    public void swim (int dist) {
        if (dist ==0){
            System.out.println(type + " " + name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (dist <= maxswimDistance) {
            System.out.println(type + " " + name + " отлично проплыл");
        } else {
            System.out.println(type + " " + name + " не смог проплыть");
            onDistance = false;
        }
    }

    @Override
    public void info(){
        System.out.println(type+" "+name+" "+onDistance);
    }


}
