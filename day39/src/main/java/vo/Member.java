package vo;

import java.time.LocalDate;

// 필드 : 아이디, 비밀번호, 이메일, 가입 일자
// 시스템에서 초기화할 수 있는 값은 입력받지 않는다.

public class Member {
	private String username;
	private String password;
	private String email;
	private LocalDate dateOfSubscription = LocalDate.now();
	
	public Member() {
	}

	public Member(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
}
