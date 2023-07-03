package exception_project;

public class NameCheckException extends Exception {

	private String errMsg;

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public NameCheckException(String errMsg) {
		super();
		this.errMsg = errMsg;
	}
	
}
