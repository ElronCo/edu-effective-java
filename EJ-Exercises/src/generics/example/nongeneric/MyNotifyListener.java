package generics.example.nongeneric;

import java.util.ArrayList;
import java.util.List;

public class MyNotifyListener implements IListener {

	@Override
	public void notify(Object object) {
		ChildModel model = (ChildModel) object;

		//
		List<String> list = new ArrayList<String>();
		list.add("");
	}

}
