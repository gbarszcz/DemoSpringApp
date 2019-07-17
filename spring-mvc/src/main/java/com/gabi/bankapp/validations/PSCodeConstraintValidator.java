package com.gabi.bankapp.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PSCodeConstraintValidator implements ConstraintValidator<PSCode, String> {

    public String codePrefix;

    @Override
    public void initialize(PSCode constraintAnnotation) {
        codePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext context) {
        return code == null || code.startsWith(codePrefix);
    }
}

