/**
 * 
 */
package com.ehs.mihonline.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @author vsubramaniyan
 *
 */
@Entity
@Table(name="tbl_Applications", catalog="MIH", schema="dbo")// last two parameters are optional
public class Applications {

	public Applications(){
		
	}
	/**
	 * @param uniquePDFAppId
	 * @param org
	 * @param submissionDate
	 * @param contactPersonId
	 * @param primaryMedicalDirectorId
	 * @param proposedprogramStartDate
	 * @param noOfEms
	 * @param noOfEMT
	 * @param affiliatedhealthCareorg
	 * @param formType
	 * @param applicationType
	 * @param createdDate
	 * @param modifiedDate
	 * @param updatedBy
	 * @param fileSubmissionDate
	 */
	public Applications(String uniquePDFAppId, Organization org, Date submissionDate, Person contactPersonId,
			Person primaryMedicalDirectorId, Date proposedprogramStartDate, int noOfEms, int noOfEMT,
			String affiliatedhealthCareorg, String formType, String applicationType, Date createdDate, Date modifiedDate,
			String updatedBy, Date fileSubmissionDate) {
		super();
		this.uniquePDFAppId = uniquePDFAppId;
		this.org = org;
		this.submissionDate = submissionDate;
		this.contactPersonId = contactPersonId;
		this.primaryMedicalDirectorId = primaryMedicalDirectorId;
		this.proposedprogramStartDate = proposedprogramStartDate;
		this.noOfEms = noOfEms;
		this.noOfEMT = noOfEMT;
		this.affiliatedHealthCareorg = affiliatedhealthCareorg;
		FormType = formType;
		this.applicationType = applicationType;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.updatedBy = updatedBy;
		this.fileSubmissionDate = fileSubmissionDate;
	}

	int appId;
	String uniquePDFAppId;
	Organization org;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM-dd-yyyy HH:mm a")
	Date submissionDate;
	Person contactPersonId;
	Person primaryMedicalDirectorId;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM-dd-yyyy HH:mm a")
	Date proposedprogramStartDate;
	int noOfEms;
	int noOfEMT;
	String affiliatedHealthCareorg;
	String FormType;
	String applicationType;
	Date createdDate;
	Date modifiedDate;
	String updatedBy;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM-dd-yyyy HH:mm a")
	Date fileSubmissionDate;
	
	
	
	


	/**
	 * @return the appId
	 */
	@Id
	@Column(name = "Application_Id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	 * @return the uniquePDFAppId
	 */
	@Column(name = "Unique_Id")
	public String getUniquePDFAppId() {
		return uniquePDFAppId;
	}



	/**
	 * @param uniquePDFAppId the uniquePDFAppId to set
	 */
	public void setUniquePDFAppId(String uniquePDFAppId) {
		this.uniquePDFAppId = uniquePDFAppId;
	}



	/**
	 * @return the orgId
	 */
	@ManyToOne(  cascade = CascadeType.ALL)
	@JoinColumn(name="Org_Id")
	//@ForeignKey(name="email")
	//@MapsId
	public Organization getOrganization() {
		return org;
	}



	/**
	 * @param orgId the orgId to set
	 */
	public void setOrganization(Organization org) {
		this.org = org;
	}



	/**
	 * @return the submissionDate
	 */
	@Column(name = "Date_Of_Submission")
	public Date getSubmissionDate() {
		return submissionDate;
	}



	/**
	 * @param submissionDate the submissionDate to set
	 */
	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}



	/**
	 * @return the contactPersonId
	 */
	@ManyToOne(  cascade = CascadeType.ALL)
	@JoinColumn(name="Contact_Person_Id")
	public Person getContactPersonId() {
		return contactPersonId;
	}



	/**
	 * @param contactPersonId the contactPersonId to set
	 */
	public void setContactPersonId(Person contactPersonId) {
		this.contactPersonId = contactPersonId;
	}



	/**
	 * @return the primarymedicalDirectorId
	 */
	@ManyToOne(  cascade = CascadeType.ALL)
	@JoinColumn(name="Primary_Medical_Director_Id")
	public Person getPrimarymedicalDirectorId() {
		return primaryMedicalDirectorId;
	}



	/**
	 * @param primarymedicalDirectorId the primarymedicalDirectorId to set
	 */
	public void setPrimarymedicalDirectorId(Person primarymedicalDirectorId) {
		this.primaryMedicalDirectorId = primarymedicalDirectorId;
	}



	/**
	 * @return the proposedprogramStartDate
	 */
	@Column(name = "Proposed_Program_Start_date")
	public Date getProposedprogramStartDate() {
		return proposedprogramStartDate;
	}



	/**
	 * @param proposedprogramStartDate the proposedprogramStartDate to set
	 */
	public void setProposedprogramStartDate(Date proposedprogramStartDate) {
		this.proposedprogramStartDate = proposedprogramStartDate;
	}



	/**
	 * @return the noOfEms
	 */
	@Column(name = "No_of_EMS")
	public int getNoOfEms() {
		return noOfEms;
	}



	/**
	 * @param noOfEms the noOfEms to set
	 */
	public void setNoOfEms(int noOfEms) {
		this.noOfEms = noOfEms;
	}



	/**
	 * @return the noOfEMT
	 */
	@Column(name = "No_of_EMT")
	public int getNoOfEMT() {
		return noOfEMT;
	}



	/**
	 * @param noOfEMT the noOfEMT to set
	 */
	public void setNoOfEMT(int noOfEMT) {
		this.noOfEMT = noOfEMT;
	}



	/**
	 * @return the afterhealthCareorg
	 */
	@Column(name = "Aff_Health_Care_Org")
	public String getAffiliatedrhealthCareorg() {
		return affiliatedHealthCareorg;
	}



	/**
	 * @param afterhealthCareorg the afterhealthCareorg to set
	 */
	public void setAffiliatedrhealthCareorg(String afterhealthCareorg) {
		this.affiliatedHealthCareorg = afterhealthCareorg;
	}



	/**
	 * @return the formType
	 */
	@Column(name = "Form_Type")
	public String getFormType() {
		return FormType;
	}



	/**
	 * @param formType the formType to set
	 */
	public void setFormType(String formType) {
		FormType = formType;
	}



	/**
	 * @return the applicationType
	 */
	@Column(name = "Application_Type")
	public String getApplicationType() {
		return applicationType;
	}



	/**
	 * @param applicationType the applicationType to set
	 */
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}



	/**
	 * @return the createdDate
	 */
	@Column(name = "Rowcreateddate")	
	public Date getCreatedDate() {
		return createdDate;
	}



	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}



	/**
	 * @return the modifiedDate
	 */
	@Column(name = "Rowupdateddate")
	public Date getModifiedDate() {
		return modifiedDate;
	}



	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}



	/**
	 * @return the updatedBy
	 */
	@Column(name = "Updatedby")
	public String getUpdatedBy() {
		return updatedBy;
	}



	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}



	/**
	 * @return the fileSubmissionDate
	 */
	@Column(name = "File_Submission_Date")
	public Date getFileSubmissionDate() {
		return fileSubmissionDate;
	}



	/**
	 * @param fileSubmissionDate the fileSubmissionDate to set
	 */
	public void setFileSubmissionDate(Date fileSubmissionDate) {
		this.fileSubmissionDate = fileSubmissionDate;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FormType == null) ? 0 : FormType.hashCode());
		result = prime * result + ((affiliatedHealthCareorg == null) ? 0 : affiliatedHealthCareorg.hashCode());
		result = prime * result + appId;
		result = prime * result + ((applicationType == null) ? 0 : applicationType.hashCode());
		result = prime * result + ((contactPersonId == null) ? 0 : contactPersonId.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((fileSubmissionDate == null) ? 0 : fileSubmissionDate.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + noOfEMT;
		result = prime * result + noOfEms;
		result = prime * result + ((org == null) ? 0 : org.hashCode());
		result = prime * result + ((primaryMedicalDirectorId == null) ? 0 : primaryMedicalDirectorId.hashCode());
		result = prime * result + ((proposedprogramStartDate == null) ? 0 : proposedprogramStartDate.hashCode());
		result = prime * result + ((submissionDate == null) ? 0 : submissionDate.hashCode());
		result = prime * result + ((uniquePDFAppId == null) ? 0 : uniquePDFAppId.hashCode());
		result = prime * result + ((updatedBy == null) ? 0 : updatedBy.hashCode());
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
		Applications other = (Applications) obj;
		if (FormType == null) {
			if (other.FormType != null) {
				return false;
			}
		} else if (!FormType.equals(other.FormType)) {
			return false;
		}
		if (affiliatedHealthCareorg == null) {
			if (other.affiliatedHealthCareorg != null) {
				return false;
			}
		} else if (!affiliatedHealthCareorg.equals(other.affiliatedHealthCareorg)) {
			return false;
		}
		if (appId != other.appId) {
			return false;
		}
		if (applicationType == null) {
			if (other.applicationType != null) {
				return false;
			}
		} else if (!applicationType.equals(other.applicationType)) {
			return false;
		}
		if (contactPersonId == null) {
			if (other.contactPersonId != null) {
				return false;
			}
		} else if (!contactPersonId.equals(other.contactPersonId)) {
			return false;
		}
		if (createdDate == null) {
			if (other.createdDate != null) {
				return false;
			}
		} else if (!createdDate.equals(other.createdDate)) {
			return false;
		}
		if (fileSubmissionDate == null) {
			if (other.fileSubmissionDate != null) {
				return false;
			}
		} else if (!fileSubmissionDate.equals(other.fileSubmissionDate)) {
			return false;
		}
		if (modifiedDate == null) {
			if (other.modifiedDate != null) {
				return false;
			}
		} else if (!modifiedDate.equals(other.modifiedDate)) {
			return false;
		}
		if (noOfEMT != other.noOfEMT) {
			return false;
		}
		if (noOfEms != other.noOfEms) {
			return false;
		}
		if (org == null) {
			if (other.org != null) {
				return false;
			}
		} else if (!org.equals(other.org)) {
			return false;
		}
		if (primaryMedicalDirectorId == null) {
			if (other.primaryMedicalDirectorId != null) {
				return false;
			}
		} else if (!primaryMedicalDirectorId.equals(other.primaryMedicalDirectorId)) {
			return false;
		}
		if (proposedprogramStartDate == null) {
			if (other.proposedprogramStartDate != null) {
				return false;
			}
		} else if (!proposedprogramStartDate.equals(other.proposedprogramStartDate)) {
			return false;
		}
		if (submissionDate == null) {
			if (other.submissionDate != null) {
				return false;
			}
		} else if (!submissionDate.equals(other.submissionDate)) {
			return false;
		}
		if (uniquePDFAppId == null) {
			if (other.uniquePDFAppId != null) {
				return false;
			}
		} else if (!uniquePDFAppId.equals(other.uniquePDFAppId)) {
			return false;
		}
		if (updatedBy == null) {
			if (other.updatedBy != null) {
				return false;
			}
		} else if (!updatedBy.equals(other.updatedBy)) {
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
		builder.append("Applications [appId=");
		builder.append(appId);
		builder.append(", uniquePDFAppId=");
		builder.append(uniquePDFAppId);
		builder.append(", org=");
		builder.append(org);
		builder.append(", submissionDate=");
		builder.append(submissionDate);
		builder.append(", contactPersonId=");
		builder.append(contactPersonId);
		builder.append(", primarymedicalDirectorId=");
		builder.append(primaryMedicalDirectorId);
		builder.append(", proposedprogramStartDate=");
		builder.append(proposedprogramStartDate);
		builder.append(", noOfEms=");
		builder.append(noOfEms);
		builder.append(", noOfEMT=");
		builder.append(noOfEMT);
		builder.append(", afterhealthCareorg=");
		builder.append(affiliatedHealthCareorg);
		builder.append(", FormType=");
		builder.append(FormType);
		builder.append(", applicationType=");
		builder.append(applicationType);
		builder.append(", createdDate=");
		builder.append(createdDate);
		builder.append(", modifiedDate=");
		builder.append(modifiedDate);
		builder.append(", updatedBy=");
		builder.append(updatedBy);
		builder.append(", fileSubmissionDate=");
		builder.append(fileSubmissionDate);
		builder.append("]");
		return builder.toString();
	}
	
	

	
	

	
	
}
