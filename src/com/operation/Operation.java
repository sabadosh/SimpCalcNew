package com.operation;

import java.util.Map;

public interface Operation {

    public Map<String, Object> calculate(Map<String, Object> inputMap);

    public Boolean isBinary();

}
