class Student{

    String name ;
    int age;


    public void getinfo() {

        System.out.println("the name of this student is " +  this.name);
        System.out.println("the age of this student is " +  this.age );
    }
}

public class OOPS1{


    public static void main(String[] args){

        Student S1 = new Student();
        S1.name = "vinit";
        S1.age = 19;
        S1.getinfo();


        Student S2 = new Student();

        S2.name = "het";
        S2.age = 22;
        S2.getinfo();
    }
}



class notebook{

    String name;
    int pages;
    String types;

    public void getinfo(){

        System.out.println(" the note book name of " + this.name);
        System.out.println("the note booke pages of " + this.pages);
        System.out.println(" the type of this notebook " + this.types);


    }
}

public class OOPS1{

    public static void main(String[] args){
        notebook N1 = new notebook();
        N1.name = "classmate";
        N1.pages = 200;
        N1.types = "squre";
        N1.getinfo();
    }

}





