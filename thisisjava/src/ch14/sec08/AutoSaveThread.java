package ch14.sec08;

public class AutoSaveThread extends Thread {
	@Override
	public void run() {
       while(true) {
    	   try {
			  Thread.sleep(1000);//1분간 정지
		} catch (Exception e) {
			break;
		}
    	   save();//save()메소드 실행
       }
	}

	private void save() {
     System.out.println("작업 내용 저장");
	}
}
