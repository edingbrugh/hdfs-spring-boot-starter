package cn.nankong.hdfs.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hdfs")
public class HdfsProperties {

    private int maxTotal = 20;

    private int initialSize = 3;

    private int maxIdle = 5;

    private int minIdle = 2;

    private String defaultFs;

    private String nameServices;

    private String ha;

    private String rpcAddress;

    private String username;

    private String basePath;

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public String getDefaultFs() {
        return defaultFs;
    }

    public void setDefaultFs(String defaultFs) {
        this.defaultFs = defaultFs;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getHa() {
        return ha;
    }

    public void setHa(String ha) {
        this.ha = ha;
    }

    public String getRpcAddress() {
        return rpcAddress;
    }

    public void setRpcAddress(String rpcAddress) {
        this.rpcAddress = rpcAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public HdfsProperties(int maxTotal, int initialSize, int maxIdle, int minIdle, String defaultFs, String nameServices, String ha, String rpcAddress, String username, String basePath) {
        this.maxTotal = maxTotal;
        this.initialSize = initialSize;
        this.maxIdle = maxIdle;
        this.minIdle = minIdle;
        this.defaultFs = defaultFs;
        this.nameServices = nameServices;
        this.ha = ha;
        this.rpcAddress = rpcAddress;
        this.username = username;
        this.basePath = basePath;
    }

    public HdfsProperties() {
    }
}