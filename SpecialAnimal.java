
public class SpecialAnimal extends Animal {

    private boolean isExotic;
    private boolean isEndangered;
    
    public SpecialAnimal() {
        super();
    } 
    
    public SpecialAnimal(int age, double weight, boolean isVaccinated, String name, 
            String species, String breed, char gender, boolean isExtinct) {
        this.age = age;
        this.weight = weight;
        this.isVaccinated = isVaccinated;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.gender = gender;
        this.isExtinct = isExtinct;
    }
    
    //ACCESSOR METHODS
    public boolean getIsExotic() {
        return isExotic;
    }
    public boolean getIsEndangered() {
        return isEndangered;
    }
    
    //SETTERS
    public void setIsExotic(boolean exotic) {
        isExotic = exotic;
    }
    public void setIsEndangered(boolean endangered) {
        isEndangered = endangered;
    }
}
