public class Superhelt {
    private String heroName;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private double strength;

    //Konstruktør
    public Superhelt (String heroName, String realName,String superPower, int yearCreated, String isHuman, double strength){
        this.heroName = heroName;
        this.realName=realName;
        this.superPower=superPower;
        this.yearCreated=yearCreated;
        this.isHuman=isHuman;
        this.strength=strength;
    }

    //get metode
    public String getHeroName(){
        return heroName;
    }

    public String getRealName(){
        return realName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getYearCreated(){
        return yearCreated;
    }

    public String getIsHuman() {
        return isHuman;
    }
    public double getStrength(){
        return strength;
    }

    //set metode

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setRealName(String realName){
        this.realName = realName;
    }

    public void setSuperPower(String SuperPower) {
        this.superPower = SuperPower;
    }
    public void setYearCreated(int yearCreated){
        this.yearCreated = yearCreated;
    }

    public void setIsHuman(String isHuman){
        this.isHuman = isHuman;
    }

    public void setStrength(double strength){
        this.strength = strength;
    }

    @Override

    public String toString() {
        return "Superhelte navn = " + heroName
                + "\n" + "Civile navn = " + realName
                + "\n" + "Superhelte kraft = " + superPower
                + "\n" + "Året han er lavet = " + yearCreated
                + "\n" + "Er superhelten menneske? = " + isHuman
                + "\n" + "Superheltens styrke lvl = " + strength
                + "\n" + "\u2500".repeat(50);

    }
}

