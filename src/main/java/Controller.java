import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Controller {

Database liste = new Database();

public void tilføjSuperHelte(String superHeroName, String realName, String superPower, int yearCreated, String isHuman, double strength){
    liste.tilføjSuperHelte(superHeroName, realName, superPower, yearCreated, isHuman, strength);
}

public void visSuperhelte(){
    liste.visSuperhelte();
}
public ArrayList<Superhelt> findHeroName(String heroName){
  return  liste.findHeroName(heroName);
}

}
