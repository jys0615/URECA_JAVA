package ch11_exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.AlreadyBoundException;

public class COverRideSub extends COverRideSuper {

//	public void print() {} // ok - throws 제거
//	public void print() throws IOException {} // ok - 부모와 완전 같음
//	public void print() throws FileNotFoundException {} // ok - 부모 Exception의 하위(자식) Exception
//	public void print() throws Exception {} // error - 부모 Exception의 상위(부모) Exception
	public void print() throws AlreadyBoundException {} // ok - 형제 Exception

}
