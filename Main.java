
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Animal petOne = new Animal();
        petOne.setAge(9);
        petOne.setWeight(73.1);
        petOne.setIsVaccinated(true);
        petOne.setName("Williamson the Ninth");
        petOne.setSpecies("dog");
        petOne.setBreed("Pitbull/Labrodor mix");
        petOne.setAnimalId(1234);
        petOne.setGender('M');
        
        System.out.println("The first animal in our registry is " + petOne.getName() + ", and he "
                + "weighs "+ petOne.getWeight() + ".\nHe has all his vaccinations and is our best "
                        + "behaved " + petOne.getSpecies() + ".\nHe is a " + petOne.getBreed() + 
                        " and his animal identification number is " + petOne.getAnimalId() + ".\nHe"
                                + " is " + petOne.getAge() + " months old.");
     
        
    }

}
