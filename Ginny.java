/*
Course:			COMP 122
Lecturer:		DR Russel Martin
Title:			Assignment 4 - Ginny
Name: 			Huba Ferenc Benzar
Student ID:		201262833
Email:			H.Benzar@student.Liverpool.ac.uk
Deadline: 		16/05/2018 - 1700
*/
class Ginny extends Person{
    //Person constructor outputs num this extend numDoors is num
    public Ginny(int num) {
       super(num);
   }
	//OpenDoors method gets started
   public Boolean[] OpenDoors(Boolean[] doorsArray){
		//for i is 0 io is smaller than length of doorsarray i increments
		//if gcd numDoors and i is 1 the door toggles
		for (int i = 0; i<doorsArray.length; i++){
		    if (gcd(numDoors, i) == 1){
		        doorsArray[i] = !doorsArray[i];
            }
		}
		//returns doorsArray
		return doorsArray;
    }
    //GCD calculator
    private static int gcd(int N, int k){
        //if k is 0 return N
        if( k == 0) return N;
        //return GCD k, N mod k
        return gcd(k, N %k);
    }
}