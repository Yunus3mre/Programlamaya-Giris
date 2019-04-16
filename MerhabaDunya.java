public class MerhabaDuna{
  public static void main(String args[]){
  System.out.println("sayı girin:");
	Scanner tarayıcı=new Scanner(System.in);
	int sayı=tarayıcı.nextInt();
	
	for(int i=sayı-1;i>=0;i--) {
		for(int j=0;j<=sayı-1;j++) {
			if(i==j) {
				System.out.print(1+"\t");
			}
			else if(i!=j) {
				System.out.print(0+"\t");
			}
			
		}
		System.out.println("");
	}
  }
}
