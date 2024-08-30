package dev.lpa;

import java.util.List;

public class Player implements ISaveable{
    private String weapon;
    private String name;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public List<String> write() {
        return List.of(name, Integer.toString(hitPoints), Integer.toString(strength), weapon);
    }

    @Override
    public void read(List<String> stringList) {
        if(stringList != null && stringList.size() > 0){
            stringList.add(name);
            stringList.add(Integer.toString(hitPoints));
            stringList.add(Integer.toString(strength));
            stringList.add(weapon);
        }
    }

    @Override
    public String toString() {
        return "Player{name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + ", weapon='" + weapon + "'}";
    }
}
