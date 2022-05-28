package com.shangyc.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author: shangyc
 * @date: 2022/5/28
 */

/**
 * InitializingBean的作用是Bean注入到Spring容器且初始化后，执行特定业务化的操作。
 * Spring允许容器中的Bean，在Bean初始化完成后或者Bean销毁前，执行特定业务化的操作，
 * 常用的实现方式有以下三种：
 *
 * 通过实现InitializingBean/DisposableBean接口来处理初始化后/销毁前的操作；
 * 通过标签的init-method/destroy-method属性处理初始化后/销毁前的操作；
 * 在指定方法上加上@PostConstruct或@PreDestroy注解来处理初始化后/销毁前的操作。
 */
@Component
public class ValidatorImpl implements InitializingBean {

    private Validator validator;

    //实现校验方法并返回校验结果
    public ValidationResult validate(Object bean){
        final ValidationResult result = new ValidationResult();
        Set<ConstraintViolation<Object>> constraintViolationSet = validator.validate(bean);
        if(constraintViolationSet.size() > 0){
            //有错误
            result.setHasErrors(true);
            constraintViolationSet.forEach(constraintViolation->{
                String errMsg = constraintViolation.getMessage();
                String propertyName = constraintViolation.getPropertyPath().toString();
                result.getErrorMsgMap().put(propertyName,errMsg);
            });
        }
        return result;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //将hibernate validator通过工厂的初始化方式使其实例化
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
}
