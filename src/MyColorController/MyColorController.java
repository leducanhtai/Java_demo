package MyColorController;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import MyColorView.MyColorView;

public class MyColorController implements ActionListener{
	private MyColorView mcv;
	public MyColorController(MyColorView mcv) {
		this.mcv = mcv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		System.out.println(src);
		if(src.equals("RED TEXT")) {
			this.mcv.changeTextColor(Color.RED);
		}else if(src.equals("YELLOW TEXT")) {
			this.mcv.changeTextColor(Color.YELLOW);
		}else if(src.equals("GREEN TEXT")) {
			this.mcv.changeTextColor(Color.GREEN);
			
		}else if(src.equals("RED BACKGROUND")) {
			this.mcv.changeBackGroundColor(Color.RED);
		}else if(src.equals("YELLOW BACKGROUND")) {
			this.mcv.changeBackGroundColor(Color.YELLOW);
		}else{
			this.mcv.changeBackGroundColor(Color.GREEN);
		}
	}

}
