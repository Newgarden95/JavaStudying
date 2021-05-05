package 스택;

public class IntStack {
	int max;//스택 용량
	int ptr;//스택 포인터~>스택에 쌓여있는 데이터 수를 나타내느 필드/스택의 인덱스를 가르킴
			//ptr = 0 : 스택이 비어있는 경우   ptr = max : 스택이 꽉 차있는 상태
	int[] stk;//스택
	
	//생성자
	public IntStack(int capacity) {
		max = capacity;
		ptr = 0; //생성시 데이터는 들어있지 않으므로 0으로 초기화
		try {
			stk = new int[max]; //스택 생성
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	//InnerClass
	//예외1: 스택이 비어있는 경우
	public class EmptyInStackException extends RuntimeException{
		public EmptyInStackException() {}
	}
	//예외2: 스택이 가득 찬 경우
	public class OverflowInStackException extends RuntimeException{
		public OverflowInStackException() {}
	}
	
	//푸시 메서드
	public int push(int data) throws OverflowInStackException{
		if(ptr>=max) throw new OverflowInStackException(); //스택용량보다 들어가는 데이터 양이 많아질 경우 예외처리  
														   //ptr=max일 때는 왜? ptr(스택에 담긴 데이터개수)가 최대용량이면 당연히 못들어감
		return stk[ptr++] = data; //스택에 하나씩 쌓아줌 ~> ptr++인 이유: 맨 처음 생성시 ptr=0임 하지만 ++ptr로 해버리면
																	   // 인덱스가 0에 들어가는게 아니라 stk[1]에 대입되는거임
	}
	//팝 메서드
	public int pop() throws EmptyInStackException{
		if(ptr <= 0 ) throw new EmptyInStackException(); // ptr(스택에 담긴 데이터 개수)
		return stk[--ptr];
	}
	//피크 메서드: 스택 꼭대기 데이터를 엿보는 메서드
	public int peek() throws EmptyInStackException{
		if(ptr<=0) throw new EmptyInStackException();
		return stk[ptr-1];
	}
	//출력 메서드
	public void dump() {
		if(ptr<=0) {
			System.out.println("스택이 비어있음");
		}
		else {
			for (int i = 0; i < ptr; i++) {
				System.out.print(stk[i]+ " ");
			System.out.println();
			}
		}
	}
	
}