
public class Animal {

    //field (properties) given to the animal super class
    //primary key will be ID number
    protected int age;
    protected double weight;
    protected boolean isVaccinated;
    protected String name;
    protected String species;
    protected String breed;
    protected char gender;
    protected boolean isExtinct;
    
    //primary key
    protected int animalId;
    
    //default constructor
    public Animal() {
        
        // age in months
        age = 0;
        // in pounds (lbs)
        weight = 0.0;
        //is the animal vaccinated or not
        isVaccinated = false;
        // name of animal
        name = " ";
        // what kind of animal is it; dog, cat, bird
        species = " ";
        // specific breed i.e. Golden Retriever, Pitbull mix
        breed = " ";
        // PK and unique for every animal that is registered
        animalId = 0;
        //animals gender
        gender = ' ';
        //animal extinction status
        isExtinct = true;
        
    }
    
    //main constructor to be called when creating animals to add to a list
    public Animal(int age, double weight, boolean isVaccinated, String name, 
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
    public int getAge() {
        return age;
    }
    
    public double getWeight() {
        return weight;
    }
    public boolean getIsVaccinated() {
        return isVaccinated;
    }
    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }
    public String getBreed() {
        return breed;
    }
    public int getAnimalId() {
        return animalId;
    }
    public char getGender() {
        return gender;
    }
    public boolean getIsExtinct() {
        return isExtinct;
    }
    
    // SETTER METHODS
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setIsExtinct(boolean isExtinct) {
        this.isExtinct = isExtinct;
    }
}
