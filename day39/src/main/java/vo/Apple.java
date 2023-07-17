package vo;

import java.time.LocalDate;

// 패키지 : 아주 잘게 자른다 => 패턴이 나온다.
// controller : 서블릿 - 작업을 시작한다.
// service : 처리하는 클래스
// vo : value object. 데이터를 저장하는 클래스들 (VO, DTO, Entity, Domain)

// 사과는 제품명, 가격, 생산일이라는 정보를 저장한다 => Value Object
// 자바는 객체를 만들기 전에 설계도부터 만든다 => 클래스
public class Apple {
	// 1. 필드
	private String name;
	private Long price;
	private LocalDate productDay;
	
	// 2. 생성자 : 클래스를 가지고 객체를 new하는 전용 메소드
	//			 생성자의 이름은 클래스와 같다
	//			 생성자는 리턴의 개념이 없다
	//			 생성자는 객체를 생성할 때만 사용가능하다 (호출 불가능)
	//			 객체 생성은 생성자를 통해서만 가능하다 (호출 불가능)	
		
	// 3. Getter (읽을 수 있다), Setter (변경할 수 있다)
	public Apple(String name, Long price, LocalDate productDay) {
		super();
		this.name = name;
		this.price = price;
		this.productDay = productDay;
	}
	public String getName() {
		return name;
	}
	public Long getPrice() {
		return price;
	}
	public LocalDate getProductDay() {
		return productDay;
	}
	public void setPrice(Long price) {
		this.price = price;
	}	

}