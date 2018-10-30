package com.aurea.testgenerator.conditionalreturn.reference.assignment1;

import com.aurea.testgenerator.conditionalreturn.reference.AnyType;

public class SingleCondition {

    public static final String CONST_STRING = "Const string";

    private int integerField;
    private boolean booleanField;
    private String stringField;
    private long longField;

    public AnyType testAndReturn(String stringParam, int intParam) {
        if (CONST_STRING.equals(stringParam) && intParam > 30) {
            System.out.println("Returning default");
            return AnyType.DEFAULT;
        } else {
            return null;
        }
    }

    public AnyType testAndReturnNoElse(int intParam) {
        if (this.booleanField && intParam == this.integerField) {
            int intVar = intParam + integerField;
            return new AnyType(intVar);
        }
        System.out.println("returning null");
        return null;
    }

    public String testAndReturnComplex(String stringParam, int intParam, long longParam) {
        if ((!stringParam.equals(CONST_STRING) || intParam > 30) && (45 < this.integerField ^ longParam < longField)) {
            return CONST_STRING;
        } else {
            return "literal string";
        }
    }



    public String testAndReturnFieldOrParam(String stringParam, boolean booleanParam) {
        if (booleanParam) {
            return stringParam;
        } else {
            return stringField;
        }
    }

    public void nonSupportedVoid() {

    }

    public AnyType nonSupportedNoIf(String stringParam) {
        System.out.println(stringParam);
        return AnyType.DEFAULT;
    }

    public AnyType nonSupportedIfNotReturning(String stringParam) {
        if(CONST_STRING.equals(stringParam)){
            System.out.println(stringParam);
        }
        return AnyType.DEFAULT;
    }

    public int getIntegerField() {
        return integerField;
    }

    public void setIntegerField(int integerField) {
        this.integerField = integerField;
    }

    public boolean isBooleanField() {
        return booleanField;
    }

    public void setBooleanField(boolean booleanField) {
        this.booleanField = booleanField;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }
}
