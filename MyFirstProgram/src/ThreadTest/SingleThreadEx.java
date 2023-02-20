package ThreadTest;

public class SingleThreadEx extends Thread{

	private int[] temp;
	
	public SingleThreadEx(String threadName)
	{
		super(threadName); //? thread에 super이 있는지 찾아봐야겠다.
		temp = new int[10]; //int 배열 10의 사이즈를 주었다.
		
		for(int start= 0; start<temp.length; start++)
		{ //for문으로 temp에다가 start값을 할당해주었다.
			temp[start]=start;
		}//여기까지가 생성자.
		
		
		
	}
	@Override
	public void run() {//start로 호출되는부분.
		for(int start:temp) { //지역변수와 전역변수. 이 부분은 타입 변수명 : 배열명을 쓴것으로 배열에 들어가 인자를 다 가져올때까지.
			try {
				Thread.sleep(1000); //스레드가 잠시 쉴수 있도록 1초 지연을 주고.
			}
			catch(InterruptedException ie) {//Exception.
				ie.printStackTrace();//충돌이 발생하면 에러의 근원지를 찾아서 출력해주고.
			}
			System.out.println("스레드이름 :" + currentThread().getName());//Thread에서 상속된 currentThread 지금 사용되고 있는 쓰레드의 이름의 이름을 알아내오고.
			System.out.println("temp value = " + start);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThreadEx st = new SingleThreadEx("첫번째");
		st.start();
	}

}
