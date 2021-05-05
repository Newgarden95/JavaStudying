package 리스트;

import java.util.Comparator;

//연결 리스트 객체
public class LinkedList<E>{
	
	//연결 리스트 멤버변수
	private Node<E> head; //머리노드(머리노드를 가르키는 변수)
	private Node<E> crnt;//선택노드(현재 선택한 노드를 가리킴, 검색한 노드를 선택, 삭제하는 등의 용도로 사용)
	
	//연결 리스트 생성자 ~> head가 비어있는 즉, 노드가 하나도 없는 비어있는 연결리스트 생성
	public LinkedList(){
		head = crnt = null;
	}
	
	//노드객체(데이터와 포인터를 담은 객체)
	class Node<E>{
		private E data; //데이터(참조형)
		private Node<E> next;  //포인터(다음 노드 참조)
		
		//생성자
		Node(E data, Node<E> next){
			this.data  = data;
			this.next = next;
		}
	}
	
	//노드 검색 메서드
	public E search(E obj, Comparator<? super E> c) {
		//obj : 검색할 때 key가 되는 데이터를 넣어둔 object(data)
		//c : 연결 리스트의 개별 노드안에 있는 데이터를 비교하기 위한것, obj와 선택한 노드의 데이터 비교 -> 결과가 0이면 검색 조건 성립
		Node<E> ptr = head;
		
		while(ptr != null) {  // ptr : PoinTeR
			if(c.compare(obj, ptr.data)==0) {
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next; //다음 노드를 가리키는 포인터를 넣어줌
		}
		return null;
	}
	
	//head에 노드 삽입
	public void addFirst(E obj) {
		Node<E> ptr = head;
		head = crnt = new Node<E>(obj, ptr); //삽입할 노드 생성
	}
	
	//tail에 노드 삽입
	public void addLast(E obj) {
		if(head == null)
			addFirst(obj);
		else {
			Node<E> ptr = head;
			while(ptr.next != null)
				ptr = ptr.next;
			ptr.next = crnt = new Node<E>(obj, null);
		}
	}
	
	//머리노드를 삭제하는 removeFirst메서드
	public void removeFirst() {
		if(head != null) //리스트가 비어 있지 않는 경우
			head = crnt = head.next;
	}
	
	//꼬리노드를 삭제하는 removeLast메서드
	public void removeLast() {
		if(head != null) {
			if(head.next == null) //머리노드이자 꼬리노드이기 때문에
				removeFirst();
			else {//꼬리노드가 존재할 때
				Node<E> ptr = head;  // 스캔중인 노드
				Node<E> pre = head; //pre : 스캔 중인 노드의 앞쪽 노드
				
				while(ptr.next != null) { //while문 종료시 , ptr = 꼬리 노드, pre = 꼬리노드 앞 노드
					pre = ptr;
					ptr = ptr.next;
				}
			pre.next = null; //원래의 꼬리노드를 삭제 ~> 꼬리노드를 가리키는 포인터 = null
			crnt = pre;
			}
		}
	}
	//노드 p를 삭제
	public void remove(Node p) {
		if(head != null) {
			if(p == head)
				removeFirst();
			else {
				Node<E> ptr = head;
				
				while(ptr.next != p) {
					ptr = ptr.next;
					if(ptr == null) return;
				}
				ptr.next = p.next;
				crnt = ptr;
				}
			}
		}
	//선택 노드 삭제
	public void removeCurrentNode() {
		remove(crnt);
	}
	//모든 노드를 삭제
	public void clear() {
		while(head != null)
			removeFirst();
		crnt = null;
	}
	
	//선택 노드를 하나 뒤쪽으로 이동
	public boolean next() {
		if( crnt == null || crnt.next == null)
			return false;
		crnt = crnt.next;
		return true;
	}
	
	//선택 노드를 출력
	public void printCurrentNode() {
		if(crnt == null)
			System.out.println("선택한 노드가 없습니다.");
		else
			System.out.println(crnt.data);
	}
	
	//모든 노드를 출력
	public void dump() {
		Node<E> ptr = head;
		
		while(ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
}
