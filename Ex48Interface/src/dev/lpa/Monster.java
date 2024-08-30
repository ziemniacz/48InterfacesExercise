package dev.lpa;

import java.util.List;

public class Monster implements ISaveable{

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }


    @Override
    public List<String> write() {
        return List.of(name, Integer.toString(hitPoints), Integer.toString(strength));
    }

    @Override
    public void read(List<String> stringList) {
        if(stringList != null && stringList.size() > 0){
            stringList.add(name);
            stringList.add(Integer.toString(hitPoints));
            stringList.add(Integer.toString(strength));
        }
    }

    @Override
    public String toString() {
        return "Player{name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + "}";
    }
}
