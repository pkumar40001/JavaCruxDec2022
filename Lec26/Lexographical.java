package Lec26;

public class Lexographical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
//		for(int i = 1; i <= 9; i++)
//			lexo(i,n);
		
		lexo(0,n);

	}
	
	public static void lexo(int ct,int n)
	{
//		if(ct == 0)
//		{
//			for( int i = 1; i <= 9; i++)
//			{
//				lexo(i,n);
//			}
//		}
		if(ct > n)
			return;
		else
		{
			System.out.println(ct);
			int i = 0;
			if(ct == 0)
				i = 1;
			for( ; i <= 9; i++)
			{
				lexo(ct*10+i,n);
			}
		}
	}

}
