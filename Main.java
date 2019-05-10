package Maraphone;
/*2. Добавить класс Team, который будет содержать название команды, массив из четырех
участников (в конструкторе можно сразу указыватьвсех участников ),
метод для вывода информации
о членах команды, прошедших дистанцию, метод вывода информации обо всех членах команды.

3. Добавить класс Course (полоса препятствий), в котором будут находиться массив
препятствий и метод, который будет просить команду пройти всю полосу;*/


import Obstacles.Obstacle;
import Participants.Cat;
import Participants.Participants;

public class Main {
    public static void main (String[] args){
        Course c = new Course(); // Создаем полосу препятствий
        Team team = new Team("Champions",); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты

    }



}
