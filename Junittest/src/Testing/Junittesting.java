package Testing;

public class Junittesting {
	
	/*	private int n1;
		private int n2;
		public  void action() {
			getNumbers(n1,n2);
			//add(n1,n2);
			//multiply(n1,n2);
			displayans(n1,n2);
		}
		public void getNumbers(int n1,int n2) {
			getNum1(n1);
			getNum2(n2);
		}
		private void getNum1(int n1) {
			Scanner num1 = new Scanner(System.in);
			this.n1 = num1.nextInt();
		}
		private void getNum2(int n2) {
			Scanner num2 = new Scanner(System.in);
			this.n2 = num2.nextInt();
		}*/
		
		public int add(int n1 ,int n2) {
			return n1 + n2;
		}
	    
		public int multiply(int n1,int n2) {
			return n1*n2;
		}
		public int divide(int n1,int n2) {
			if(n2 != 0) {
				return n1/n2;
				
			}
			else {
				return -1;
			}
		}
		
		/*private void displayans(int n1, int n2) {
			add(n1,n2);
			multiply(n1,n2);
		}*/
	

}
