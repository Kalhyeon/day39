package vo;

import java.time.LocalDate;

public class Apple2 {
	private Long name;
	private Long price;
	private LocalDate receive;
	
//	생성자가 [없으면] 자바가 생성자를 하나 추가한다
//	(기본 생성자 - Default Constructor).
//	기본 생성자는 매개변수 없이 비어있는 생성자이다.
//	public Apple2() {
//		나중에 스프링쪽 기술들이 기본 생성자를 필수로 요구한다.
//	}
	
	public Apple2(Long name, Long price, LocalDate receive) {
		this.name = name;
		this.price = price;
		this.receive = receive;
	}
	
}
