package Maraphone;


import Participants.Participants;

public abstract class Team implements Participants {

    String teamName;


    public Team(String teamName) {
        this.teamName = teamName;

    }
    @Override
    public void showResults(){
        System.out.println(teamName+ " " );

    }

}
