package cn.org.faster.framework.admin.auth.error;

import cn.org.faster.framework.web.exception.model.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zhangbowen
 */
@AllArgsConstructor
@Getter
public enum AuthError implements ErrorCode {
    USER_NOT_EXIST(1100, "用户未注册"),
    PASSWORD_ERROR(1101, "密码错误"),
    NOT_HAVE_PERMISSION(1102, "权限不足"),
    CAPTCHA_ERROR(1103, "验证码错误或已过期"),;

    private int value;
    private String description;
}
