/*
Course:			COMP 122
Lecturer:		DR Russel Martin
Title:			Assignment 4 - Person
Name: 			Huba Ferenc Benzar
Student ID:		201262833
Email:			H.Benzar@student.Liverpool.ac.uk
Deadline: 		16/05/2018 - 1700
*/
abstract class Person{
    //numbDoors is defined
	final int numDoors;
	//Person constructor outputs num
    //this extend numDoors is num
    public Person(int num){
		this.numDoors = num;
	}

	//getOpenDoors method gets started
    //return the number of open doors
    public void getOpenDoors(Boolean[] doorsArray){
		//openDoors is set to 0
	    int openDoors = 0;
        //for each loop
	    for (Boolean DoorsArray : doorsArray) {
            //if DoorsArray is true openDoors increments and 1 gets printed out
            //otherwise 0 gets printed out
	        if (DoorsArray) {
                openDoors++;
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
        //the number of open doors is printed with message
        System.out.println("\n"+openDoors+" doors open\n");
    }
}