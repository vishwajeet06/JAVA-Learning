package collection;
// need of collection in java
public class needOfCollection {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int[] arArray = new int[10000];

        Student[] students = new Student[10];
        students[0] = new Student();
        students[1] = new Student();
        // students[2] = new Book(); // showing error because class student and book are not same
       
        Object[] objects = new Object[10];
        objects[0] = new Student();
        objects[1] = new Student();
        objects[2] = new Book(); // not soing error because of object super class which holds hetrogeneous data
    }
}


// not a good practice to create many variable to hold data. 5 6 7
// we can store many values without creating many variable just create an array with some size 9
// Array => homogeneous data store, once created size can not change, readymade support/API is not available to perform operation


class Book{}
class Student{}