import java.util.Arrays;
import java.util.Scanner;

public class IrregularArray {

	public static void main(String[] args) {
		//배열의 길이가 3 2 3 2 인 배열을 만들 것이다.
		Scanner sc = new Scanner(System.in);
		int array[][] =new int[4][];
//		array[0] = new int[3];
//		array[1] = new int[2];
//		array[2] = new int[3];
//		array[3] = new int[2];
		for(int i= 0; i<array.length;i++)
		{
			array[i] = new int[sc.nextInt()];
		}
		
		for(int i = 0; i< array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				array[i][j]= sc.nextInt();
			}
		}
		System.out.println(Arrays.toString(array[1]));
		

	}

}
