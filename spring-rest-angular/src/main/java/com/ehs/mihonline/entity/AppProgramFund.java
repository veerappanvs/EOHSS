package com.ehs.mihonline.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author vsubramaniyan
 *
 */
@Entity
@Table(name = "tbl_App_Program_Fund", catalog="MIH", schema="dbo")// last two parameters are optional
public class AppProgramFund{
 
	/**
	 * @param appId
	 * @param programFundId
	 * @param othersDescription
	 */
	public AppProgramFund(int appId, int programFundId, String othersDescription) {
		super();
		this.appId = appId;
		this.programFundId = programFundId;
		this.othersDescription = othersDescription;
	}

	public AppProgramFund(){
	}
	
	/**
	 * @param programFundName
	 */
	public AppProgramFund(String programFundName) {
		super();
		this.othersDescription = programFundName;
	}
	
	private int appId;
	private int programFundId;
    private String othersDescription;
    

	/**
	 * @return the appId
	 */
    @Id
	@Column(name="Application_Id")
	public int getAppId() {
		return appId;
	}

	/**
	 * @param appId the appId to set
	 */
	public void setAppId(int appId) {
		this.appId = appId;
	}

	/**
	 * @return the othersDescription
	 */
	@Column(name="Description")
	public String getOthersDescription() {
		return othersDescription;
	}

	/**
	 * @param othersDescription the othersDescription to set
	 */
	public void setOthersDescription(String othersDescription) {
		this.othersDescription = othersDescription;
	}

	/**
	 * @return the programFundId
	 */
	@Column(name="Program_Fund_Id")
	public int getProgramFundId() {
		return programFundId;
	}

	/**
	 * @param programFundId the programFundId to set
	 */
	public void setProgramFundId(int programFundId) {
		this.programFundId = programFundId;
	}

	/**
	 * @return the programFundName
	 */
	@Column(name="Program_Fund_name")
	public String getProgramFundName() {
		return othersDescription;
	}

	public void setProgramFundName(String othersDescription) {
		 this.othersDescription = othersDescription;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + appId;
		result = prime * result + ((othersDescription == null) ? 0 : othersDescription.hashCode());
		result = prime * result + programFundId;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AppProgramFund other = (AppProgramFund) obj;
		if (appId != other.appId) {
			return false;
		}
		if (othersDescription == null) {
			if (other.othersDescription != null) {
				return false;
			}
		} else if (!othersDescription.equals(other.othersDescription)) {
			return false;
		}
		if (programFundId != other.programFundId) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AppProgramFund [appId=");
		builder.append(appId);
		builder.append(", programFundId=");
		builder.append(programFundId);
		builder.append(", othersDescription=");
		builder.append(othersDescription);
		builder.append("]");
		return builder.toString();
	}


}

