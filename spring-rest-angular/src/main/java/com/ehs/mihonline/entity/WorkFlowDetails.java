/**
 * 
 */
package com.ehs.mihonline.entity;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author vsubramaniyan
 *
 */
@Entity
@Table(name="tbl_Workflow_Details")
public class WorkFlowDetails  {

		/**
	 * @param workflowId
	 * @param applicationId
	 * @param roleId
	 * @param roleName
	 * @param status
	 * @param actionTakenBy
	 * @param appStatus
	 * @param startDate
	 * @param completedDate
	 */
	public WorkFlowDetails( Applications applications, int roleId, String roleName, String status,
			String actionTakenBy,  Date startDate, Date completedDate) {
		super();
		this.applications = applications;
		this.roleId = roleId;
		this.roleName = roleName;
		this.status = status;
		this.actionTakenBy = actionTakenBy;
		this.startDate = startDate;
		this.completedDate = completedDate;
	}
		public WorkFlowDetails(){
	}
	

	
	private int workflowId;
	private	Applications applications;
	private int roleId;
	private String roleName;
	private String status;
	private String actionTakenBy;
	private Date startDate; 
	private Date completedDate;
	
	/**
	 * @return the workflowId
	 */
	@Id
	@Column(name="Workflow_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getWorkflowId() {
		return workflowId;
	}
	/**
	 * @param workflowId the workflowId to set
	 */
	public void setWorkflowId(int workflowId) {
		this.workflowId = workflowId;
	}
	/**
	 * @return the applicationId
	 */
	//@ManyToOne
	//@JoinTable(name="tbl_Aplications",
	//joinColumns=@JoinColumn(name="Application_Id"))
	 //@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	 // @JoinColumn(name = "Application_Id", referencedColumnName = "Application_Id")
	 @ManyToOne
	 @JoinColumn(name = "Application_Id")
	public Applications getApplications() {
		return applications;
	}
	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplications(Applications applications) {
		this.applications = applications;
	}
	
	
	/**
	 * @return the startDate
	 */
	@Column(name="Start_Date")
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the completedDate
	 */
	@Column(name="Completed_Date")
	public Date getCompletedDate() {
		return completedDate;
	}
	/**
	 * @param completedDate the completedDate to set
	 */
	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}
	/**
	 * @return the roleId
	 */
	@Column(name="Role_Id")
	public int getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	/**
	 * @return the roleName
	 */
	@Column(name="Role_Name")
	public String getRoleName() {
		return roleName;
	}
	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	/**
	 * @return the status
	 */
	@Column(name="Status")
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the actionTakenBy
	 */
	@Column(name="Action_Taken_By")
	public String getActionTakenBy() {
		return actionTakenBy;
	}
	/**
	 * @param actionTakenBy the actionTakenBy to set
	 */
	public void setActionTakenBy(String actionTakenBy) {
		this.actionTakenBy = actionTakenBy;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actionTakenBy == null) ? 0 : actionTakenBy.hashCode());
		result = prime * result + ((applications == null) ? 0 : applications.hashCode());
		result = prime * result + ((completedDate == null) ? 0 : completedDate.hashCode());
		result = prime * result + roleId;
		result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + workflowId;
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
		WorkFlowDetails other = (WorkFlowDetails) obj;
		if (actionTakenBy == null) {
			if (other.actionTakenBy != null) {
				return false;
			}
		} else if (!actionTakenBy.equals(other.actionTakenBy)) {
			return false;
		}
		if (applications == null) {
			if (other.applications != null) {
				return false;
			}
		} else if (!applications.equals(other.applications)) {
			return false;
		}
		if (completedDate == null) {
			if (other.completedDate != null) {
				return false;
			}
		} else if (!completedDate.equals(other.completedDate)) {
			return false;
		}
		if (roleId != other.roleId) {
			return false;
		}
		if (roleName == null) {
			if (other.roleName != null) {
				return false;
			}
		} else if (!roleName.equals(other.roleName)) {
			return false;
		}
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		if (status == null) {
			if (other.status != null) {
				return false;
			}
		} else if (!status.equals(other.status)) {
			return false;
		}
		if (workflowId != other.workflowId) {
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
		builder.append("WorkFlowDetails [workflowId=");
		builder.append(workflowId);
		builder.append(", applications=");
		builder.append(applications);
		builder.append(", roleId=");
		builder.append(roleId);
		builder.append(", roleName=");
		builder.append(roleName);
		builder.append(", status=");
		builder.append(status);
		builder.append(", actionTakenBy=");
		builder.append(actionTakenBy);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", completedDate=");
		builder.append(completedDate);
		builder.append("]");
		return builder.toString();
	}

		
}
