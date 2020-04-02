public class Example {
    public static void main(String[] args){
        user u1 = new user("OBrien", 32);
        u1.printUser();
        
        //create another user --2 users

        user u2 = new user("Carter",36);
        u2.printUser();

        user u3 = new user("Roche",42);
        u3.printUser();

        // using constructor
        Animal a1 = new Animal("Baby", "Shark");
            Animal a2 = new Animal("garfield", "cat");
            a1.printAnimal();
            a2.printAnimal();


            Student s1= new Student("Dominique",27,8);
            s1.printStudent();

            Student s2= new Student("Charlie",38,8);
            s2.printStudent();

        a1.attack(s1);
        a2.attack(s2);
    }

}