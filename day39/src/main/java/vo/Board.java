package vo;

import java.time.LocalDate;

// 글의 번호, 제목, 내용, 작성일, 조회수

public class Board {
	private Long bno;
	private String title;
	private String content;
	private LocalDate dateOfWrite = LocalDate.now();
	private Long view = 0L;
	
	public Board() {
	}

	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public Long getBno() {
		return bno;
	}

	public void setBno(Long bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getView() {
		return view;
	}

	public void setView(Long view) {
		this.view = view;
	}

	public LocalDate getDateOfWrite() {
		return dateOfWrite;
	}
	
}
