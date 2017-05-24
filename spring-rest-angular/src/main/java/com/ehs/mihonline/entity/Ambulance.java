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
@Table(name = "tbl_Ambulance", catalog="MIH", schema="dbo")// last two parameters are optional
public class Ambulance{
 

	private int ambulanceId;
    private String LocalJusrisdication;
    private String LicenseNumber;
    private String serviceName;
    private String contactPerson;
    private String personTitle;
    private long contactNumber;
    private String emailID;



    /**
	 * @param ambulanceId
	 * @param localJusrisdication
	 * @param licenseNumber
	 * @param serviceName
	 * @param contactPerson
	 * @param personTitle
	 * @param contactNumber
	 * @param emailID
	 */
	public Ambulance(int ambulanceId, String localJusrisdication, String licenseNumber, String serviceName,
			String contactPerson, String personTitle, long contactNumber, String emailID) {
		super();
		this.ambulanceId = ambulanceId;
		this.serviceName = serviceName;
		this.LocalJusrisdication = localJusrisdication;
		this.LicenseNumber = licenseNumber;
		this.contactPerson = contactPerson;
		this.personTitle = personTitle;
		this.contactNumber = contactNumber;
		this.emailID = emailID;
	}

	public Ambulance() {

    }

 	public Ambulance(String serviceName,  String localJusrisdication, String licenseNumber, 
 			String contactPerson, long contactNumber, String emailID) {
 		super();
 		this.serviceName = serviceName;
 		this.LocalJusrisdication = localJusrisdication;
 		this.LicenseNumber = licenseNumber;
 		this.contactPerson = contactPerson;
 		this.contactNumber = contactNumber;
 		this.emailID = emailID;
 	}
 	
 	
    @Id
    //@GenericGenerator(name = "native_generator", strategy = "native")
    //@GeneratedValue(generator = "native_generator")
    //@GeneratedValue(generator = "sequence", strategy=GenerationType.SEQUENCE)
    //@SequenceGenerator(name = "sequence", allocationSize = 10)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Ambulance_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getAmbulanceId() {
        return ambulanceId;
    }

    public void setAmbulanceId(int ambulanceId) {
        this.ambulanceId = ambulanceId;
    }

	/**
	 * @return the localJusrisdication
	 */
    @Column(name="Ambulance_Local_Jurisdiction")
	public String getLocalJusrisdication() {
		return LocalJusrisdication;
	}

	/**
	 * @param localJusrisdication the localJusrisdication to set
	 */
	public void setLocalJusrisdication(String localJusrisdication) {
		LocalJusrisdication = localJusrisdication;
	}

	/**
	 * @return the licenseNumber
	 */
	@Column(name="Ambulance_License_Number")
	public String getLicenseNumber() {
		return LicenseNumber;
	}

	/**
	 * @param licenseNumber the licenseNumber to set
	 */
	public void setLicenseNumber(String licenseNumber) {
		LicenseNumber = licenseNumber;
	}

	/**
	 * @return the serviceName
	 */
	@Column(name="Ambulance_Service_Name")
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the contactPerson
	 */
	@Column(name="Ambulance_Contact_Person")
	public String getContactPerson() {
		return contactPerson;
	}

	/**
	 * @param contactPerson the contactPerson to set
	 */
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	/**
	 * @return the personTitle
	 */
	@Column(name="Ambulance_Person_Title")
	public String getPersonTitle() {
		return personTitle;
	}

	/**
	 * @param personTitle the personTitle to set
	 */
	public void setPersonTitle(String personTitle) {
		this.personTitle = personTitle;
	}

	/**
	 * @return the contactNumber
	 */
	@Column(name="Ambulance_Contact_Number")
	public long getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the emailID
	 */
	@Column(name="Ambulance_Email_Id")
	public String getEmailID() {
		return emailID;
	}

	/**
	 * @param emailID the emailID to set
	 */

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((LicenseNumber == null) ? 0 : LicenseNumber.hashCode());
		result = prime * result + ((LocalJusrisdication == null) ? 0 : LocalJusrisdication.hashCode());
		result = prime * result + ambulanceId;
		result = prime * result + (int) (contactNumber ^ (contactNumber >>> 32));
		result = prime * result + ((contactPerson == null) ? 0 : contactPerson.hashCode());
		result = prime * result + ((emailID == null) ? 0 : emailID.hashCode());
		result = prime * result + ((personTitle == null) ? 0 : personTitle.hashCode());
		result = prime * result + ((serviceName == null) ? 0 : serviceName.hashCode());
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
		Ambulance other = (Ambulance) obj;
		if (LicenseNumber == null) {
			if (other.LicenseNumber != null) {
				return false;
			}
		} else if (!LicenseNumber.equals(other.LicenseNumber)) {
			return false;
		}
		if (LocalJusrisdication == null) {
			if (other.LocalJusrisdication != null) {
				return false;
			}
		} else if (!LocalJusrisdication.equals(other.LocalJusrisdication)) {
			return false;
		}
		if (ambulanceId != other.ambulanceId) {
			return false;
		}
		if (contactNumber != other.contactNumber) {
			return false;
		}
		if (contactPerson == null) {
			if (other.contactPerson != null) {
				return false;
			}
		} else if (!contactPerson.equals(other.contactPerson)) {
			return false;
		}
		if (emailID == null) {
			if (other.emailID != null) {
				return false;
			}
		} else if (!emailID.equals(other.emailID)) {
			return false;
		}
		if (personTitle == null) {
			if (other.personTitle != null) {
				return false;
			}
		} else if (!personTitle.equals(other.personTitle)) {
			return false;
		}
		if (serviceName == null) {
			if (other.serviceName != null) {
				return false;
			}
		} else if (!serviceName.equals(other.serviceName)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ambulance [ambulanceId=" + ambulanceId + ", LocalJusrisdication=" + LocalJusrisdication
				+ ", LicenseNumber=" + LicenseNumber + ", serviceName=" + serviceName + ", contactPerson="
				+ contactPerson + ", personTitle=" + personTitle + ", contactNumber=" + contactNumber + ", emailID="
				+ emailID + "]";
	}


}

