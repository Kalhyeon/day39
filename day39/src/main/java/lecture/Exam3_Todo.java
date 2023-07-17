package lecture;

import vo.Todo;

public class Exam3_Todo {
	public static void main(String[] args) {
		Todo todo = new Todo("자바 공부");
		
//		자바의 모든 클래스는 객체의 정보를 문자열로 출력하는
//		toString() 이라는 메서드를 가진다.
//		todo 를 출력하라고 하면 자돟으로 todo.toString() 으로
//		바뀌어 출력된다.
//		작성자가 적절히 바꾸어 사용해야한다.
		System.out.println(todo);
	}
}
