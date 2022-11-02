package ch20.boards;

//참고 https://mindols.tistory.com/245
import java.sql.Blob;
import java.util.Date;

import lombok.Data;

@Data
public class Board {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	private String bfilename;
    private Blob bfiledata;
	
}
