package exception_project;

public class SalaryCheckException extends Exception {
	
	private String errorMsg;

	public SalaryCheckException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
