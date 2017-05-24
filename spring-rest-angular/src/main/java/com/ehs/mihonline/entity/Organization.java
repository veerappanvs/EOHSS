/**
 * 
 */
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
@Table(name="tbl_Organization", catalog="MIH", schema="dbo")// last two parameters are optional
public class Organization {
	
	/**
	 * 
	 */
	public Organization() {
		super();
	}
	/**
	 * @param orgName
	 * @param orgAddressLine1
	 * @param orgAddressLine2
	 * @param city
	 * @param state
	 * @param zipCode
	 */
	public Organization(String orgName, String orgAddressLine1, String orgAddressLine2, String city, String state,
			String zipCode) {
		super();
		this.orgName = orgName;
		this.orgAddressLine1 = orgAddressLine1;
		this.orgAddressLine2 = orgAddressLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	int orgId;
	String orgName;
	String orgAddressLine1;
	String orgAddressLine2;
	String city;
	String state;
	String zipCode;
	
	/**
	 * @return the orgId
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Org_Id", unique = true, nullable = false)
	public int getOrgId() {
		return orgId;
	}
	/**
	 * @param orgId the orgId to set
	 */
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	/**
	 * @return the orgName
	 */
	@Column(name="Org_Name")
	public String getOrgName() {
		return orgName;
	}
	/**
	 * @param orgName the orgName to set
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * @return the orgAddressLine1
	 */
	@Column(name="Org_Address_Line1")
	public String getOrgAddressLine1() {
		return orgAddressLine1;
	}
	/**
	 * @param orgAddressLine1 the orgAddressLine1 to set
	 */
	public void setOrgAddressLine1(String orgAddressLine1) {
		this.orgAddressLine1 = orgAddressLine1;
	}
	/**
	 * @return the orgAddressLine2
	 */
	@Column(name="Org_Address_Line2")
	public String getOrgAddressLine2() {
		return orgAddressLine2;
	}
	/**
	 * @param orgAddressLine2 the orgAddressLine2 to set
	 */
	public void setOrgAddressLine2(String orgAddressLine2) {
		this.orgAddressLine2 = orgAddressLine2;
	}
	/**
	 * @return the city
	 */
	@Column(name="City")
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	@Column(name="State")
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zipCode
	 */
	@Column(name="Zipcode")
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((orgAddressLine1 == null) ? 0 : orgAddressLine1.hashCode());
		result = prime * result + ((orgAddressLine2 == null) ? 0 : orgAddressLine2.hashCode());
		result = prime * result + orgId;
		result = prime * result + ((orgName == null) ? 0 : orgName.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
		Organization other = (Organization) obj;
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (orgAddressLine1 == null) {
			if (other.orgAddressLine1 != null) {
				return false;
			}
		} else if (!orgAddressLine1.equals(other.orgAddressLine1)) {
			return false;
		}
		if (orgAddressLine2 == null) {
			if (other.orgAddressLine2 != null) {
				return false;
			}
		} else if (!orgAddressLine2.equals(other.orgAddressLine2)) {
			return false;
		}
		if (orgId != other.orgId) {
			return false;
		}
		if (orgName == null) {
			if (other.orgName != null) {
				return false;
			}
		} else if (!orgName.equals(other.orgName)) {
			return false;
		}
		if (state == null) {
			if (other.state != null) {
				return false;
			}
		} else if (!state.equals(other.state)) {
			return false;
		}
		if (zipCode == null) {
			if (other.zipCode != null) {
				return false;
			}
		} else if (!zipCode.equals(other.zipCode)) {
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
		builder.append("Organization [orgId=");
		builder.append(orgId);
		builder.append(", orgName=");
		builder.append(orgName);
		builder.append(", orgAddressLine1=");
		builder.append(orgAddressLine1);
		builder.append(", orgAddressLine2=");
		builder.append(orgAddressLine2);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", zipCode=");
		builder.append(zipCode);
		builder.append("]");
		return builder.toString();
	}
	


}
