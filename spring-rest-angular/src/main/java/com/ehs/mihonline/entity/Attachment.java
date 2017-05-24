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
@Table(name="tbl_Attachment")
public class Attachment {

	public Attachment(){
		
	}
	/**
	 * @param formType
	 * @param attachemntName
	 * @param attachmentDescr
	 * @param attachmentType
	 */
	public Attachment(String formType, String attachemntName, String attachmentDescr,
			String attachmentType) {
		super();
		this.formType = formType;
		this.attachemntName = attachemntName;
		this.attachmentDescr = attachmentDescr;
		this.attachmentType = attachmentType;
	}

	
	int attachmentId;
	String formType;
	String attachemntName;
	String attachmentDescr;
	String attachmentType;
	
	/**
	 * @return the attachmentId
	 */
	@Id
	@Column(name="Attachment_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getAttachmentId() {
		return attachmentId;
	}
	/**
	 * @param attachmentId the attachmentId to set
	 */
	public void setAttachmentId(int attachmentId) {
		this.attachmentId = attachmentId;
	}
	/**
	 * @return the formType
	 */
	@Column(name="Form_Type")
	public String getFormType() {
		return formType;
	}
	/**
	 * @param formType the formType to set
	 */
	public void setFormType(String formType) {
		this.formType = formType;
	}
	/**
	 * @return the attachemntName
	 */
	@Column(name="Attachment_Name")
	public String getAttachemntName() {
		return attachemntName;
	}
	/**
	 * @param attachemntName the attachemntName to set
	 */
	public void setAttachemntName(String attachemntName) {
		this.attachemntName = attachemntName;
	}
	
	/**
	 * @return the attachmentDescr
	 */
	@Column(name="Attachment_Description")
	public String getAttachmentDescr() {
		return attachmentDescr;
	}
	/**
	 * @param attachmentDescr the attachmentDescr to set
	 */
	public void setAttachmentDescr(String attachmentDescr) {
		this.attachmentDescr = attachmentDescr;
	}
	/**
	 * @return the attachmentType
	 */
	@Column(name="Attachment_Type")
	public String getAttachmentType() {
		return attachmentType;
	}
	/**
	 * @param attachmentType the attachmentType to set
	 */
	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attachemntName == null) ? 0 : attachemntName.hashCode());
		result = prime * result + ((attachmentDescr == null) ? 0 : attachmentDescr.hashCode());
		result = prime * result + attachmentId;
		result = prime * result + ((attachmentType == null) ? 0 : attachmentType.hashCode());
		result = prime * result + ((formType == null) ? 0 : formType.hashCode());
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
		Attachment other = (Attachment) obj;
		if (attachemntName == null) {
			if (other.attachemntName != null) {
				return false;
			}
		} else if (!attachemntName.equals(other.attachemntName)) {
			return false;
		}
		if (attachmentDescr == null) {
			if (other.attachmentDescr != null) {
				return false;
			}
		} else if (!attachmentDescr.equals(other.attachmentDescr)) {
			return false;
		}
		if (attachmentId != other.attachmentId) {
			return false;
		}
		if (attachmentType == null) {
			if (other.attachmentType != null) {
				return false;
			}
		} else if (!attachmentType.equals(other.attachmentType)) {
			return false;
		}
		if (formType == null) {
			if (other.formType != null) {
				return false;
			}
		} else if (!formType.equals(other.formType)) {
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
		builder.append("Attachment [attachmentId=");
		builder.append(attachmentId);
		builder.append(", formType=");
		builder.append(formType);
		builder.append(", attachemntName=");
		builder.append(attachemntName);
		builder.append(", attachmentDescr=");
		builder.append(attachmentDescr);
		builder.append(", attachmentType=");
		builder.append(attachmentType);
		builder.append("]");
		return builder.toString();
	}
}
