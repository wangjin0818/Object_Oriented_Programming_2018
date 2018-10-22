package Sample;

public class Question3 {
	public static void main(String[] args){
		for(int i=1;i<=9;i++)
			if(i%2==1){
				for(int j=(17-i-(i-1))/2;j>0;j--)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
					System.out.print("* ");
				System.out.println("");
			}
			else
				System.out.println("");
	}
}
