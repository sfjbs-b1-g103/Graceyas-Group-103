package com.MiniProject_PensionManagement2;

import javax.persistence.Entity;

@Entity
public class PensionProcess {

	private Integer Id;
	private String BankName;
	private String BranchNumber;
	private String BankAddress;
	private Integer ServiceCharge;
	public PensionProcess(Integer id, String bankName, String branchNumber, String bankAddress, Integer serviceCharge) {
		super();
		Id = id;
		BankName = bankName;
		BranchNumber = branchNumber;
		BankAddress = bankAddress;
		ServiceCharge = serviceCharge;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getBranchNumber() {
		return BranchNumber;
	}
	public void setBranchNumber(String branchNumber) {
		BranchNumber = branchNumber;
	}
	public String getBankAddress() {
		return BankAddress;
	}
	public void setBankAddress(String bankAddress) {
		BankAddress = bankAddress;
	}
	public Integer getServiceCharge() {
		return ServiceCharge;
	}
	public void setServiceCharge(Integer serviceCharge) {
		ServiceCharge = serviceCharge;
	}
	@Override
	public String toString() {
		return "PensionProcess [Id=" + Id + ", BankName=" + BankName + ", BranchNumber=" + BranchNumber
				+ ", BankAddress=" + BankAddress + ", ServiceCharge=" + ServiceCharge + "]";
	}
	
}
