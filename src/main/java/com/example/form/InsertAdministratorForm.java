package com.example.form;





import com.example.validation.UniqueEmail;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "名前は必須です")
	@NotEmpty(message = "必ず入力してください")
	@Size(min=1,max=100,message = "名前は１００文字以内で入力してください")
	private String name;
	/** メールアドレス */
	@Size(min=1,max=100,message = "メールは１００文字以内で入力してください")
	@Email(message = "メール型で入力してください")
	@NotEmpty(message = "必ず入力してください")
	@UniqueEmail
	private String mailAddress;
	/** パスワード */
	@NotEmpty(message = "必ず入力してください")
	@Size(min=8,max=20,message="8文字以上20文字以下で入力してください")
	@Pattern(regexp="^(?=.*[A-Z])[a-zA-Z0-9_]{8,24}+$",message = "英大文字、小文字、数字をそれぞれ少なくとも1文字は使用")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ "]";
	}

}
