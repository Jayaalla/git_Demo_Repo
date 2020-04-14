package JavaHackathon;

public class CheckBoolean {

	public static void main(String[] args) {
		
    boolean a = true;
    boolean b = true;
    boolean c = false;   		
         
	System.out.println(atleastTwo(a,b,c));
	}

static boolean atleastTwo(boolean a, boolean b, boolean c)
{
	if((a&&b)||(b&&c)||(a&&c))
{
	return true;
	}
else {
	return  false;
}
}
}

