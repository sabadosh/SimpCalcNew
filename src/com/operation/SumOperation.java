package com.operation;

import java.util.HashMap;
import java.util.Map;

public class SumOperation implements Operation {

    @Override
    public Map<String, Object> calculate(Map<String, Object> inputMap) {
        Double x = (Double) inputMap.get("arg1");
        Double y = (Double) inputMap.get("arg2");
        Double result = x + y ;
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);
        return resultMap;
    }

    @Override
    public Boolean isBinary() {
        return true;
    }

}
