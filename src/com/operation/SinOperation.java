package com.operation;

import java.util.HashMap;
import java.util.Map;

public class SinOperation implements Operation {

    @Override
    public Map<String, Object> calculate (Map<String, Object> inputMap){
        Double x = (Double) inputMap.get("arg1");
        Double result = Math.sin(x);
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);
        return resultMap;
    }
    @Override
    public Boolean isBinary(){
        return false;

    }
}
