package com.csi.oops;

class Employee {
	private int empId;

	private String emapName;

	private double empSalary;

	private long empContactNumber;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmapName() {
		return emapName;
	}

	public void setEmapName(String emapName) {
		this.emapName = emapName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public long getEmpContactNumber() {
		return empContactNumber;
	}

	public void setEmpContactNumber(long empContactNumber) {
		this.empContactNumber = empContactNumber;
	}

}

public class EncapsulationConcept {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setEmpId(121);
		e1.setEmapName("JERRY");
		e1.setEmpSalary(45447.62);
		e1.setEmpContactNumber(45874571157L);

		System.out.println("\n Employee Id:" + e1.getEmpId() + "\n Employee Name:" + e1.getEmapName()
				+ "\n Employee Salary:" + e1.getEmpSalary() + "\n Employee Contact Number:" + e1.getEmpContactNumber());

	}

}
