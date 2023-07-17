package vo;

import java.time.LocalDate;

// 객체를 생성하는 순서
// 1. 첫 번째로 실행되는 코드를 인스턴스 (instance) 초기화라고 한다.
//    => 모든 객체는 같은 값을 가진다.
// 2.
// 3. 생성자를 실행한다.

public class Apple4 {
//	필드
	private String name;
	
//	인스턴스 초기화
	private LocalDate receive = LocalDate.now();
	private Long price;
	
//	기본 생성자
	public Apple4() {
	}

	public Apple4(String name, Long price) {
		this.name = name;
		this.price = price;
	}
	
}
