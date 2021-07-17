package Composit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class composit extends component {
	List<component> children;

	public composit() {
		children = new ArrayList<component>();
	}

	@Override
	void operation() {

		doSomething();
		Iterator<component> iteratoverchildren = children.iterator();
		while (iteratoverchildren.hasNext()) {
			component leaf = iteratoverchildren.next();
			leaf.doSomething();
		}
	}

}
