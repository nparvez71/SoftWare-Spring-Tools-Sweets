package com.coderbd.entity.core;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "core_setting_section" ,uniqueConstraints= @UniqueConstraint(columnNames={"sectionName", "instituteID"}))

public class CoreSettingSection {

	
	@Id
	@Column(name = "sectionID")
	private String sectionID;

	@Column(name="preDefineSectionID")
	private String preDefineSectionID;
	
	
	@Column(name = "sectionName")
	private String sectionName;
	
	@Column(name="preDefineStatus")
	private int preDefineStatus;
	
	@Column(name = "sectionSerial")
	private int sectionSerial;
	
	@Column(name = "instituteID")
	private String instituteID;

	@Column(name = "recordNote")
	private String recordNote;

	@Column(name = "userExecuted")
	private String userExecuted;

	@Column(name = "dateExecuted")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateExecuted;

	@Column(name = "ipExecuted")
	private String ipExecuted;

	@Column(name = "recordStatus")
	private int recordStatus;

	public CoreSettingSection() {
		
	}

	/**
	 * @param sectionID
	 * @param preDefineSectionID
	 * @param sectionName
	 * @param preDefineStatus
	 * @param instituteID
	 * @param recordNote
	 * @param userExecuted
	 * @param dateExecuted
	 * @param ipExecuted
	 * @param recordStatus
	 */
	public CoreSettingSection(String sectionID, String preDefineSectionID, String sectionName, int preDefineStatus,
			String instituteID, String recordNote, String userExecuted, Date dateExecuted, String ipExecuted,
			int recordStatus,int sectionSerial) {
	
		this.sectionID = sectionID;
		this.preDefineSectionID = preDefineSectionID;
		this.sectionName = sectionName;
		this.preDefineStatus = preDefineStatus;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
		this.sectionSerial =sectionSerial;
	}
	
	


	public String getSectionID() {
		return sectionID;
	}

	public void setSectionID(String sectionID) {
		this.sectionID = sectionID;
	}

	public String getPreDefineSectionID() {
		return preDefineSectionID;
	}

	public void setPreDefineSectionID(String preDefineSectionID) {
		this.preDefineSectionID = preDefineSectionID;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public int getPreDefineStatus() {
		return preDefineStatus;
	}

	public void setPreDefineStatus(int preDefineStatus) {
		this.preDefineStatus = preDefineStatus;
	}

	public String getInstituteID() {
		return instituteID;
	}

	public void setInstituteID(String instituteID) {
		this.instituteID = instituteID;
	}

	public String getRecordNote() {
		return recordNote;
	}

	public void setRecordNote(String recordNote) {
		this.recordNote = recordNote;
	}

	public String getUserExecuted() {
		return userExecuted;
	}

	public void setUserExecuted(String userExecuted) {
		this.userExecuted = userExecuted;
	}

	public Date getDateExecuted() {
		return dateExecuted;
	}

	public void setDateExecuted(Date dateExecuted) {
		this.dateExecuted = dateExecuted;
	}

	public String getIpExecuted() {
		return ipExecuted;
	}

	public void setIpExecuted(String ipExecuted) {
		this.ipExecuted = ipExecuted;
	}

	public int getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}

	public int getSectionSerial() {
		return sectionSerial;
	}

	public void setSectionSerial(int sectionSerial) {
		this.sectionSerial = sectionSerial;
	}

	
}


