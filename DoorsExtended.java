//Huba Ferenc Benzar

class Doors{
    private static void start(int newBase){
        //Creates new arrays for each of the people
        Boolean[] GinnyArray = makeArray(newBase);
        Boolean[] PetraArray = makeArray(newBase);
        Boolean[] SvenArray = makeArray(newBase);

        //Creating objects for each person
        Ginny g = new Ginny(newBase);
        Petra p = new Petra(newBase);
        Sven s = new Sven(newBase);

        //Results of people in an array is ginny object OpenDoors using the array declared above
        //Printing the person out
        //Printing the results out
        Boolean[] resultGinny = g.OpenDoors(GinnyArray);
        System.out.println("Ginny");
        g.getOpenDoors(resultGinny);

        Boolean[] resultPetra = p.OpenDoors(PetraArray);
        System.out.println("Petra");
        p.getOpenDoors(resultPetra);

        Boolean[] resultSven = s.OpenDoors(SvenArray);
        System.out.println("Sven");
        s.getOpenDoors(resultSven);
    }
	private static void extended(int newBase){
        //Creates new arrays for each of the people
        Boolean[] CurrentArray = makeArray(newBase);

        //Creating objects for each person
        Ginny g = new Ginny(newBase);
        Petra p = new Petra(newBase);
        Sven s = new Sven(newBase);

        //Results of people in an array is ginny object OpenDoors using the array declared above
        //Printing the person out
        //Printing the results out
        Boolean[] resultGinny = g.OpenDoors(CurrentArray);
        System.out.println("Ginny");
        g.getOpenDoors(resultGinny);

        Boolean[] resultPetra = p.OpenDoors(CurrentArray);
        System.out.println("Petra");
        p.getOpenDoors(resultPetra);

        Boolean[] resultSven = s.OpenDoors(CurrentArray);
        System.out.println("Sven");
        s.getOpenDoors(resultSven);
    }

    //Error message method posts message and exits with status code 0
    private static void error(){
        System.out.println("    Oops, not enough arguments!\n    Usage: java Doors N");
        System.exit(0);
    }

    //Start of main method
    public static void main(String[] args){
        //newBase is set to 9 by default since that reduces the amount of code used
        int newBase = 9;
        //Message if there is no input it starts the start method with the default value 9
        
        //otherwise
        else{
            //try
            try{
                //parses input into newBase variable if it passes the first if statement
                newBase = Integer.parseInt(args[0]);
				String 
                
				//if the length of the input is bugger than one it outputs the error
                //since it's only meant to accept one input
                if(args.length == 2){
					//input = Integer.parseInt(args[0]);
                    extended(newBase);
                }
				
				if(args.length == 1){
					start(newBase);
				}	
                //Error Message if newBase bigger than 1 and input is smaller than 1000000
                if (newBase < 1 || newBase > 1000000){
                    error();
                }
                //Otherwise it runs the start method with the new input
                else{
                    start(newBase);
                }
            }
            //Error Message if the input is not an integer
            catch (java.lang.NumberFormatException e){
                error();
            }
        }
    }

    //MakeArray Method
    private static Boolean[] makeArray(int n){
        //DoorArray is initialised which is n+1
        Boolean[] doorArray = new Boolean[n+1];
        //for i is equal of smaller than n i increments.
        //i is the index of doorArray which sets all of the entries to false
        for (int i = 0; i <= n; i++){
            doorArray[i] = false;
        }
        //returns doorArray
        return doorArray;
    }
}
