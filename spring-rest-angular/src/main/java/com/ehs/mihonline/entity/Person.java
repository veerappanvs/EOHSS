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
@Table(name="tbl_Person")
public class Person  {

	public Person(){
	}
	
	/**
	 * @param personName
	 * @param title
	 * @param phoneNumber
	 * @param emailId
	 * @param personType
	 */
	public Person(String personName, String title, long phoneNumber, String emailId, String personType) {
		super();
		this.personName = personName;
		this.title = title;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.personType = personType;
	}
	
	int personId;
	String personName;
	String title;
	long phoneNumber;
	String emailId;
	String personType;
	
	/**
	 * @return the personId
	 */
	@Id
	@Column(name="Person_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getPersonId() {
		return personId;
	}
	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	/**
	 * @return the personName
	 */
	@Column(name="Person_Name")
	public String getPersonName() {
		return personName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	/**
	 * @return the title
	 */
	@Column(name="Title")
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the phoneNumber
	 */
	@Column(name="Phone_Number")
	public long getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the emailId
	 */
	@Column(name="Email_Id")
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the personType
	 */
	@Column(name="Person_Type")
	public String getPersonType() {
		return personType;
	}
	/**
	 * @param personType the personType to set
	 */
	public void setPersonType(String personType) {
		this.personType = personType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + personId;
		result = prime * result + ((personName == null) ? 0 : personName.hashCode());
		result = prime * result + ((personType == null) ? 0 : personType.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Person other = (Person) obj;
		if (emailId == null) {
			if (other.emailId != null) {
				return false;
			}
		} else if (!emailId.equals(other.emailId)) {
			return false;
		}
		if (personId != other.personId) {
			return false;
		}
		if (personName == null) {
			if (other.personName != null) {
				return false;
			}
		} else if (!personName.equals(other.personName)) {
			return false;
		}
		if (personType == null) {
			if (other.personType != null) {
				return false;
			}
		} else if (!personType.equals(other.personType)) {
			return false;
		}
		if (phoneNumber != other.phoneNumber) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
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
		builder.append("Person [personId=");
		builder.append(personId);
		builder.append(", personName=");
		builder.append(personName);
		builder.append(", title=");
		builder.append(title);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", emailId=");
		builder.append(emailId);
		builder.append(", personType=");
		builder.append(personType);
		builder.append("]");
		return builder.toString();
	}

	
}
