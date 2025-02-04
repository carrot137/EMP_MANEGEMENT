package com.example.form;



import java.sql.Date;

import com.example.validation.UniqueEmail;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * 従業員情報更新時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class UpdateEmployeeForm {
	@NotEmpty(message = "入力は必須です")
	@Size(max=20,message = "50文字以内で入力してください")
	private String name;
	@NotEmpty(message = "選択してください")
	private String gender;
	@NotEmpty(message = "入力してくださ")
	private Date hire_Date;
	@Size(max=50,message = "メールは50文字以内で入力してください")
	@Email(message = "メール型で入力してください")
	@NotEmpty(message = "必ず入力してください")
	@UniqueEmail
	private String mail_address;
	@Pattern(regexp = "^\\d{3}\\-?\\d{4}$",message = "郵便番号の方で入力してください")
	private String zip_code;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getHire_Date() {
		return hire_Date;
	}

	public void setHire_Date(Date hire_Date) {
		this.hire_Date = hire_Date;
	}

	public String getMail_address() {
		return mail_address;
	}

	public void setMail_address(String mail_address) {
		this.mail_address = mail_address;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	@Size(max=100,message = "１００文字以内で入力してください")
	private String address;
	@NotEmpty(message = "入力してください")
	@Pattern(regexp = "[0-9]{3}-[0-9]{4}",message = "＊＊＊ー＊＊＊＊で入力してください")
	private String telephone;
	@Size(min=0,max=1000000,message = "0~1,000,000の間で入力してください")
	private Integer salary;
	@Size(max=500,message = "500文字以内で入力してください")
	private String characteristics;
	/** id */
	private String id;
	/** 扶養人数 */
	@Pattern(regexp = "^[0-9]+$", message = "扶養人数は数値で入力してください")
	private String dependentsCount;

	/**
	 * IDを数値として返します.
	 * 
	 * @return 数値のID
	 */
	public Integer getIntId() {
		return Integer.parseInt(id);
	}

	/**
	 * 扶養人数を数値として返します.
	 * 
	 * @return 数値の扶養人数
	 */
	public Integer getIntDependentsCount() {
		return Integer.parseInt(dependentsCount);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDependentsCount() {
		return dependentsCount;
	}

	public void setDependentsCount(String dependentsCount) {
		this.dependentsCount = dependentsCount;
	}

	@Override
	public String toString() {
		return "UpdateEmployeeForm [name=" + name + ", gender=" + gender + ", hire_Date=" + hire_Date
				+ ", mail_address=" + mail_address + ", zip_code=" + zip_code + ", address=" + address + ", telephone="
				+ telephone + ", salary=" + salary + ", characteristics=" + characteristics + ", id=" + id
				+ ", dependentsCount=" + dependentsCount + "]";
	}

}
