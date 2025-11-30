package kjpother.dto;

public class Dude {
    String name;
    String occupation;

    public Dude() {

    }

    public Dude(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }
    public String getOccupation() {
        return occupation;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    @Override
    public String toString() {
        return "Dude{name='" + name + "', occupation='" + occupation + "'}";
    }
}
