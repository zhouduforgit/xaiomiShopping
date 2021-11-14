package com.zhoudu.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO 响应数据的封装
 * @Author 周都
 * @Date 2021/10/25 12:20
 */
public class ResponseMsg {
    private String errorCode;
    private String errorMsg;
    private Map<String,Object> objectMap = new HashMap<>();

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Map<String, Object> getObjectMap() {
        return objectMap;
    }

    public void setObjectMap(Map<String, Object> objectMap) {
        this.objectMap = objectMap;
    }
    // 往响应对象里加上对象
    public ResponseMsg addObejct(String key, Object value){
        this.objectMap.put(key, value);
        return this;
    }

    public static ResponseMsg success() {
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg.setErrorCode("111");
        responseMsg.setErrorMsg("处理成功");
        return responseMsg;
    }

    public static ResponseMsg fail() {
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg.setErrorCode("222");
        responseMsg.setErrorMsg("处理失败");
        return responseMsg;
    }
}
