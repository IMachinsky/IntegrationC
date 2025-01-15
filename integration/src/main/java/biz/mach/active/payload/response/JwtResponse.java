package biz.mach.active.payload.response;

import java.util.List;

public class JwtResponse {

	private String token;
	private String type = "Bearer";
	private Integer progUserId;
	private String progUserName;
	private String progUserFullName;
	private Integer peopleId;
	private List<String> roles;

	public JwtResponse() {
	}

	public JwtResponse(String accessToken,
                       Integer progUserId,
                       String progUserName,
                       String progUserFullName,
                       Integer peopleId,
                       List<String> roles) {
		this.token = accessToken;
		this.progUserId = progUserId;
		this.progUserName = progUserName;
		this.progUserFullName = progUserFullName;
		this.peopleId = peopleId;
		this.roles = roles;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public Integer getProgUserId() {
		return progUserId;
	}

	public void setProgUserId(Integer progUserId) {
		this.progUserId = progUserId;
	}

	public String getProgUserFullName() {
		return progUserFullName;
	}

	public void setProgUserFullName(String progUserFullName) {
		this.progUserFullName = progUserFullName;
	}

	public String getProgUserName() {
		return progUserName;
	}

	public void setProgUserName(String progUserName) {
		this.progUserName = progUserName;
	}

	public Integer getPeopleId() {
		return peopleId;
	}

	public void setPeopleId(Integer peopleId) {
		this.peopleId = peopleId;
	}

	public List<String> getRoles() {
		return roles;
	}
}
