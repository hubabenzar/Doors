//Huba Ferenc Benzar

class Sven extends Person{
    //Person constructor outputs num this extend numDoors is num
    public Sven(int num) {
        super(num);
    }
    //OpenDoors method gets started
    public Boolean[] OpenDoors(Boolean[] doorsArray){
        //int counter is set to 0
        int counter = 0;
        //for int i is 1 i is smaller than numDoors +1 i increments
        //for int k is 1 k is smaller than numDoors +1 k increments
        for (int i = 1; i < numDoors + 1; i++){
            for (int k = 1; k < numDoors + 1; k++){
                //if i is smaller than k and perfectSquare i is true and perfectSquare k is true
                if (i < k && square(i) && square(k)){
                    //if counter + i + k is smaller or equal to numDoors counter increments
                    if (counter + i + k <= numDoors) {
                        counter = i;
                        //if doorsArray index counter then doorsArray index counter is false
                        //else if not doorsArray index counter then doorsArray index counter is true
                        if (doorsArray[counter])doorsArray[counter] = false;
                        else if (!doorsArray[counter])doorsArray[counter] = true;
                        //counter + k
                        counter += k;
                        //if doorsArray index counter then doorsArray index counter is false
                        //else if not doorsArray index counter then doorsArray index counter is true
                        if (doorsArray[counter])doorsArray[counter] = false;
                        else if (!doorsArray[counter])doorsArray[counter] = true;
                    }
                    //counter is set to 0
                    counter = 0;
                }
            }
        }
        //return doorsArray
        return doorsArray;
    }
    //square method
    private boolean square(int N){
        //int squareRoot is int Math square N return squareRoot*Squareroot is N
        int squareRoot = (int)Math.sqrt(N);
        return squareRoot * squareRoot == N;
    }
}
