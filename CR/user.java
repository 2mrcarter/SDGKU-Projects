public class user {
    private String name;
    private int age;

    //setters and getters

    public user(String name, int age){
        this.name=name;
        this.age=age;
    
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if(age<100){
        this.age=age;
    }else{
        System.out.println("Error Bobos age is not correct");
    }
    }
    public String getName(){
        return this.name;

    }

    public int getAge(){
        return this.age;
    }

    //methods
    public void printUser(){
        System.out.println(" ______________");
        System.out.println("user Information");
        System.out.println("name:"+this.name);
        System.out.println("age:"+this.age);
        System.out.println(" ----------------------- ");
    }
}