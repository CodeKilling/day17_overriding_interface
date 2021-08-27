package quiz01;

import java.time.Duration;
import java.time.LocalDateTime;

public class Quiz01_Timer02 extends Quiz01_Timer{

	LocalDateTime startTime = null;
	public Quiz01_Timer02()
	{
		this.startTime = LocalDateTime.now();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Duration du = Duration.between(this.startTime, LocalDateTime.now());
		String time = String.valueOf(du.getSeconds());
		super.label.setText(time);
	}
}
