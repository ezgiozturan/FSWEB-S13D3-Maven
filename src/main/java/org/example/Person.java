package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double salary;
    boolean isTeen;
    String[] hobbies;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public Person(String firstName, String lastName, int age,double salary, boolean isTeen, String[] hobbies) {
       this(firstName, lastName, age);
       this.hobbies = hobbies;
       this.salary = salary;
       this.isTeen = isTeen;
    }

   public String getFirstName () {
        return this.firstName;
   }

   public String getLastName () {
        return this.lastName;
   }

   public int getAge () {
        return this.age;
   }

   public boolean isTeen () {
        return this.age >=13 && this.age<=19;
   }

   public String[] getHobbies () {
        return this.hobbies;
   }

}
