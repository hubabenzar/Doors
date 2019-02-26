/*
Course:			COMP 122
Lecturer:		DR Russel Martin
Title:			Assignment 4 - Petra
Name: 			Huba Ferenc Benzar
Student ID:		201262833
Email:			H.Benzar@student.Liverpool.ac.uk
Deadline: 		16/05/2018 - 1700
*/
class Petra extends Person{
    //Person constructor outputs num this extend numDoors is num
    public Petra(int num) {
		super(num);
	}
    //getOpenDoors method gets started
	public Boolean[] OpenDoors(Boolean[] doorsArray){
        //int counter is set to 0
        int counter = 0;
        //for int i is 2 i is smaller or equal to doorarray length i increments
        for (int i = 2; i <= numDoors; i++){
			//if primeCalc index i is true
            if (prime(i)){
				//while counter is smaller or equal to numDoors
                //if doorArray index counter and counter mod i is 0
                //then doorArray index counter is false
                while(counter <= numDoors){
                    if (doorsArray[counter] && counter %i == 0){
                        doorsArray[counter] = false;
                    }
                    //else if not doorArray index counter and counter mod i is 0
                    //then doorArray index counter is true
                    else if (!doorsArray[counter] && counter %i == 0){
                        doorsArray[counter] = true;
                    }
                    //counter increments
                    counter++;
                }
                //counter reset
                counter = 0;
			}
		}
		//return doorsArray
		return doorsArray;
	}
    //Prime calculator method
	private boolean prime(int N){
		//if N is 2 or 3 returns true
        //Otherwise for int i is 2 i is smaller or equal to math squared N it increments
        //if N mod i is 0 return false
        if(N == 2 || N == 3) return true;
		else{
			for(int i = 2; i<= Math.sqrt(N); i++){
				if(N %i == 0)return false;
			}
			//returns true
			return true;
		}
	}
}