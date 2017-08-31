import java.util.Random;

public class WeightCalculator
{
	public static void main(String[] args)
	{
		int w = Integer.parseInt(args[0]);
		double m = w*0.38;
		double j = w*2.36;
		double v = w*0.91;
		double s = w*1.06;
		System.out.println("Mars: " + m);
		System.out.println("Jupiter: " + j);
		System.out.println("Venus: " + v);
		System.out.println("Saturn: " + s);
		Random rand = new Random();
		int  n = rand.nextInt(w) + w;
		System.out.println("Your real weight is " + n);
	}
}