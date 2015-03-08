package creational.factory.factoryClass;

/**
 * Created by thomas on 05/03/15.
 */
public class Client {
    public static void main(String[] args){
        Monster monster = new MonsterFactory().createMonster("zombie");
        monster.message();
    }
}
