package vo;

import java.time.LocalDate;

// 시스템에서 정해주는 것이 바람직한 필드
// = tno, dateOfWrite

public class Todo {
//	sequence : 1씩 자동 증가하는 값
	private Long tno;
	private String job;
	private LocalDate dateOfWrite = LocalDate.now();
	private Boolean finish = false;
	
//	사용자에게는 job 만 받는다.
//	객체를 생성할 때 dateOfWrite 와 finish 의 인스턴스가 초기화된다.
//	일련번호 tno 는 오라클 sequence 에 의해 DB 쪽에서 채워질 것이다.
	
	public Todo() {
	}

	public Todo(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Todo [tno=" + tno + ", job=" + job + ", dateOfWrite=" + dateOfWrite + ", finish=" + finish + "]";
	}

	public Long getTno() {
		return tno;
	}

	public void setTno(Long tno) {
		this.tno = tno;
	}

	public Boolean getFinish() {
		return finish;
	}

	public void setFinish(Boolean finish) {
		this.finish = finish;
	}

	public String getJob() {
		return job;
	}

	public LocalDate getDateOfWrite() {
		return dateOfWrite;
	}
	
	

}
