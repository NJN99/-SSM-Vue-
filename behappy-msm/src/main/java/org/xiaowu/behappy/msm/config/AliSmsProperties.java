package org.xiaowu.behappy.msm.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 阿里云sms配置模板
 *
 * @author xiaowu
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "aliyun.sms")
public class AliSmsProperties {

    private String accessKeyId;

    private String accessKeySecret;

    private String signName;

    private String templateCode;

}
