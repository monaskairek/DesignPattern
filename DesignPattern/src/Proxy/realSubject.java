package Proxy;

public class realSubject extends subject {
	boolean imDoingSomething;
public realSubject () {
	imDoingSomething=false;
}
	@Override
	void request() {
		imDoingSomething=true;
		System.out.println("I'm the real Subject,  you are older than 18 ");
	}

	boolean isdoingSomething() {
		System.out.println("I'm the real Subject,you are younger than 18 ");
		
		return imDoingSomething;
	}

}
