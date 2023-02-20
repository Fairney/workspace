import java.util.Arrays;
import java.util.Scanner;

/*
 * 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 화면에 출력하는 프로그램을 작성하라
 * 
 */
public class ArrayAcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		int temp=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<array.length; i++)
		{
			System.out.println("배열에 들어갈 정수 값을 입력하세요");
			array[i]= sc.nextInt();
		
		}
		System.out.println(Arrays.toString(array));
		
		//가장 높은 값을 맨 앞에다가 표현하고, 정렬해보자.
		
		for(int i = 0; i<array.length; i++) {
			if(i==array.length-1) {
				if(temp< array[array.length-1])
					temp = array[array.length-1];
				break;
			}
			if(array[i]<=array[i+1])
			{
				temp = array[i];
//				array[i]=array[i+1];
//				array[i+1] = temp;
				
			}
		}
		System.out.println(temp);
		System.out.println(Arrays.toString(array));
		
		
	}

}
