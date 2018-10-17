package Sample;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] list=new int[5][6];
		int max=0,min=0;
		int i=0,j=0;
		for(i=0;i<5;i++){
			for(j=0;j<6;j++){
				list[i][j]=i*i-(j-i)*(j-i)+10;
				System.out.print(list[i][j]+"\t");
			}
			System.out.println();
		}
		for(i=0;i<5;i++){
			max=list[i][0];
			for(j=1;j<6;j++){
				if(list[i][j]>max){
					max=list[i][j];
				}
			}
			System.out.println("第"+(i+1)+"行的最大值是："+max);
		}
		for(j=0;j<6;j++){
			min=list[0][j];
			for(i=1;i<5;i++){
				if(list[i][j]<min){
					min=list[i][j];
				}
			}
			System.out.println("第"+(i+1)+"列的最小值是："+min);
		}
	}

}
