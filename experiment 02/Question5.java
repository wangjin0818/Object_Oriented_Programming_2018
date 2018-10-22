package Sample;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ctrl1=false;
		
		int[] primes=new int[10000];
		int n=0,lastprime=0;
		for(int i=2;i<=10000;i++){
			int s=(int)Math.sqrt(i);
			int j;
			for(j=2;j<=s;j++)
				if(i%j==0)
					break;
			if(j>s){
				primes[n++]=i;
				if(ctrl1==true){
					ctrl1=false;
					System.out.println(i);
				}
				lastprime=i;
			}
			if(i==1000)
				ctrl1=true;
			if(i==8000){
				System.out.println(lastprime);
			}
		}
		int sum=0;
		for(int i=0;i<n;i++)
			sum+=primes[i];
		System.out.println(sum*1.0/n);
		
	}

}
