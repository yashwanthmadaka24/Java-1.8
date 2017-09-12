package com.infomover.training.java8.part2;

import com.infomover.training.java8.ch10.command.Close;
import com.infomover.training.java8.ch10.command.Editor;
import com.infomover.training.java8.ch10.command.Macro;
import com.infomover.training.java8.ch10.command.Open;
import com.infomover.training.java8.ch10.command.Save;
import com.infomover.training.java8.ch10.command.SimpleEditor;

public class Ch10App0CommandPattern {

	public static void main(String[] args) {

		Editor editor = new SimpleEditor();
		Macro m = new Macro();
		
		// Java 1.7 way
		m.record(new Open(editor));
		m.record(new Save(editor));
		m.record(new Close(editor));

		/**
		 * Use a supplier style lambda. you can do away with the concrete
		 * command classes all-together. Please note that your Command is a
		 * functional interface
		 * 
		 */
//		m.record(() -> << call a function on SimpleEditor object  to open >>);
//		m.record(() -> << call a function on SimpleEditor object  to save >>);
//		m.record(() -> << call a function on SimpleEditor object  to close >>);

		
		/**  now use method reference of SimpleEditor object created above **/
//		m.record(<< use open method reference of editor >>);
//		m.record(<< use save method reference of editor >>);
//		m.record(<< use close method reference of editor >>);

		/** Uncomment Run and check **/
		// m.run();

	}
}
