package com.example.validation;

import com.example.service.AdministratorService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    private AdministratorService administratorService;

    @Override
    public void initialize(UniqueEmail constraintAnnotation) {
        // 初期化処理が必要な場合はここに記述
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if (email == null || email.isEmpty()) {
            return true; // nullや空文字は@NotBlankで別途チェック
        }
        return administratorService.findByMailAddress(email) == null;
    }
}
