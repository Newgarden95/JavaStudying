import org.w3c.dom.Node;

// 연결리스트 구현
public class LinkedList {
	// 첫번째 노드를 가리키는 필드
	private Node head;// head: 첫번쨰 노드를 가르키는 참조값
	private Node tail;// tail: 마지막 노드를 지정해주는 참조값
	private int size; // 노드의 크기

	// Node클래스
	static class Node {
		// 데이터가 저장될 필드
		private Object data;
		// 다음 노드를 가리키는 필드
		private Node next;

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		// 노드의 내용을 쉽게 출력해서 확인해볼 수 있는 기능
		public String toString() {
			return String.valueOf(this.data); //노드를 출력하면 데이터 값을 반환
		}
	}//Node 클래스 끝
	
	//삽입메소드 : 1.맨 앞에 삽입하는 경우
	public void addFirst(Object data) {
		// 새로운 노드를 생성합니다.
		Node newNode = new Node(data); //Node객체를 생성

		newNode.next = head; //하나의 노드가 있는 상태에서 새로운 노드를 추가한 경우 새로운 노드는 헤드가 가리키도록 설정
		head = newNode; //헤드가 새로만든 노드를 가르킴
		size++; // 새로운 노드를 추가했기 때문에 사이즈값을 늘림
		
		if (head.next == null) { //헤드가 가리키는것(첫번째 노드)의 다음노드가 없는 경우 즉, 노드가 한개만 있는 경우
			tail = head; //마지막노드는 헤드와 같다
		}
	}
	//삽입메소드 : 2.맨 끝에 삽입하는 경우
	public void addLast(Object input){
	    // 노드를 생성합니다.
	    Node newNode = new Node(input);
	    // 리스트의 노드가 없다면 첫번째 노드를 추가하는 메소드를 사용합니다.
	    if(size == 0){
	        addFirst(input); //데이터가 없는 상태인 경우 앞에 넣어준다
	    } 
	    else { //데이터가 존재하는 경우
	        // 마지막 노드가 새로생성된 노드를 가리키면됨
	        tail.next = newNode;
	        // 마지막 노드를 갱신합니다.
	        tail = newNode;
	        // 엘리먼트의 개수를 1 증가 시킵니다.
	        size++;
	    }
	}

	//인덱스에 해당하는 데이터 추출 : 특정 위체에 값을 넣을 떄 사용
	Node node(int index) { //Node 객체를 리턴해준다. ~> 내부적으로만 사용
	    Node x = head; //x: 첫 노드를 찾는다 => head
	    for (int i = 0; i < index; i++)
	        x = x.next; //x에는 노드의 주소가 담겨짐
	    return x; //다음노드
	}
	
	//특정한 위치에 값을 넣는 방법
	public void add(int index, Object input){
	    // 만약 index가 0이라면 첫번째 노드에 추가하는 것이기 때문에 addFirst를 사용합니다.
	    if(index == 0){
	        addFirst(input);
	    } else {
	    	//추가하고자 하는 인덱스 전에 해당하는 노드를 알아야함 -> 그래야 연결할 수있음
	        Node temp1 = node(index-1);
	        // index 번째 노드를 temp2로 지정합니다.
	        Node temp2 = temp1.next;
	        // 새로운 노드를 생성합니다.
	        Node newNode = new Node(input);
	        // temp1의 다음 노드로 새로운 노드를 지정합니다.
	        temp1.next = newNode;
	        // 새로운 노드의 다음 노드로 temp2를 지정합니다.
	        newNode.next = temp2;
	        size++;
	        // 새로운 노드의 다음 노드가 없다면 새로운 노드가 마지막 노드이기 때문에 tail로 지정합니다.
	        if(newNode.next == null){
	            tail = newNode;
	        }
	    }
	}
	
}
