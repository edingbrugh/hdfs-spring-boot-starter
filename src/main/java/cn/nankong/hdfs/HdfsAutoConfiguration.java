package cn.nankong.hdfs;


import cn.nankong.hdfs.properties.HdfsProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass(HdfsProperties.class)
@Configuration
public class HdfsAutoConfiguration {
}