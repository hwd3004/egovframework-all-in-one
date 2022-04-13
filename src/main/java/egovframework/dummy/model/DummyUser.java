package egovframework.dummy.model;

public class DummyUser {

	private int id;

	private String userId;

	private String userPassword;

	private String confirmPassword;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "DummyUser [id=" + id + ", userId=" + userId + ", userPassword=" + userPassword + ", confirmPassword="
				+ confirmPassword + ", getId()=" + getId() + ", getUserId()=" + getUserId() + ", getUserPassword()="
				+ getUserPassword() + ", getConfirmPassword()=" + getConfirmPassword() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
