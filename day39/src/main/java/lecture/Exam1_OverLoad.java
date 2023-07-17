package lecture;

// 70년대에 '소프트웨어의 위기' : 소프트웨어의 개발이 지연

// 생산성을 높인다 => 공장 => [부품]을 조립하여 재사용

// 객체 지향 - 부품의 설계도인 클래스를 작성 => 검증
//          => 객체 지향 구성 요소와 객체 지향 원칙
// 객체 지향 원칙
// 1. 캡슐화 - 필드를 모아 클래스를 만들어라
// 2. 정보 은닉 - 클래스 내부를 private 로 보호하라
//			   + 객체를 사용하는 public 메서드를 제공
// 3. 상속 - 부모 => 자식
// 4. 다형성 - 상황에 따라 동작이 달라질 수 있다.
//         - OverLoad, OverRide

public class Exam1_OverLoad {
//	메서드 OverLoad : 매개변수가 다르다면 메서드 이름은 같아도 상관없다.
//	프로그래밍에서 이름 : id 개념 => 겹치면 안된다.
//	그러나 함수의 경우, 매개변수가 다르다면 (타입 또는 개수) 이름이 같아도
//	상관없다.
	public int sum(int a, int b) {
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public long sum(long a) {
		return a;
	}
}
