import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Event implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Main.textArea.setText(Main.R2.toString(Main.R2));
	
	}

}
