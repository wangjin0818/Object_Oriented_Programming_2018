package Sample;

public class Question7 {
	public static double Factorial1(int n){
		double sum=1;
		for(int i=1;i<=n;i++){
			sum*=i;
		}
		return sum;
	}
	
	public static double Factorial2(int P,int Q){
		double sum=1;
		for(int i=1;i<=Q;P--,++i){
			sum*=P;
		}
		return sum;
	}
	public static void combination(int P,int Q) {
		// TODO Auto-generated method stub
		if(P<Q){
			System.out.println("shurucuowu");
			return;
		}
		double result;
		result=Factorial2(P,Q)/Factorial1(Q);
		System.out.println("ÓÐ "+result+" ÖÖ");
	}
	public static void main(String[] args){
		combination(30,7);
	}
}
