package ch15.sec03.exam01;

import java.util.Objects;

public class Board {
 private int bNo;
 private String subject;
 private String content;
 private String writer;
 
public Board(int bNo, String subject, String content, String writer) {
	this.bNo = bNo;
	this.subject = subject;
	this.content = content;
	this.writer = writer;
}

public int getbNo() {
	return bNo;
}

public void setbNo(int bNo) {
	this.bNo = bNo;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public String getWriter() {
	return writer;
}

public void setWriter(String writer) {
	this.writer = writer;
}

@Override
public String toString() {
	return "Board [bNo=" + bNo + ", subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
}

@Override
public int hashCode() {
	return Objects.hash(bNo, content, subject, writer);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Board other = (Board) obj;
	return bNo == other.bNo && Objects.equals(content, other.content) && Objects.equals(subject, other.subject)
			&& Objects.equals(writer, other.writer);
}



 
 
}
