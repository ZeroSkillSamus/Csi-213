import edu.princeton.cs.introcs.StdDraw;


public class H2Recursion {
public static double babyMethod(int guess,int x,int aError){
	//founds out the error and used absolute to make sure it it was positive
	double err = Math.abs(x-guess*guess);
	
	if (x<0){
		return 1;
	} 
	
	if (err<=aError){
		return (guess);
	}
	
	else 
	{
}

}
