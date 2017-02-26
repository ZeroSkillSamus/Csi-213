import edu.princeton.cs.introcs.StdDraw;


public class H2Recursion {
public static double babyMethod(double newGuess2,int x,int aError){
	//founds out the error and used absolute to make sure it it was positive
	double err = Math.abs(x-newGuess2*newGuess2);
	
	if (x<0){
		return 1;
	} 
	
	if (err<=aError){
		return (newGuess2);
	}
	
	else 
	{
		double newGuess=.5*(newGuess2+x/newGuess2);
		//System.out.println(newGuess);
        return babyMethod(newGuess,x,aError);
       
	//newguess = .5 * (lastguess + x/ last guess)
	}
	
	
}
	
}


