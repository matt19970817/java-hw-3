package test_p37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_20 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入字串");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String stru=str.toUpperCase();
		String str1=str.toLowerCase();
		
		System.out.println("轉換成大小寫時為"+stru);
		System.out.println("轉換成大小寫時為"+str1);
	}

}
