package jdbc1;
import java.util.Date;
public class Exc1 {
	int userinfo_id;
	String userid;
	String user_password;
	boolean activestatus;
	Date createdate;
	String createduser;
	Date updatedate;
	String updateduser;
	public int getUserinfo_id() {
		return userinfo_id;
	}
	public void setUserinfo_id(int userinfo_id) {
		this.userinfo_id = userinfo_id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public boolean isActivestatus() {
		return activestatus;
	}
	public void setActivestatus(boolean activestatus) {
		this.activestatus = activestatus;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getCreateduser() {
		return createduser;
	}
	public void setCreateduser(String createduser) {
		this.createduser = createduser;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public String getUpdateduser() {
		return updateduser;
	}
	public void setUpdateduser(String updateduser) {
		this.updateduser = updateduser;
	}
	
	
}
