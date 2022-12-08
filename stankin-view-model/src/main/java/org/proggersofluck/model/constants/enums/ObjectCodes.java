package org.proggersofluck.model.constants.enums;

public enum ObjectCodes {
    AUDIENCE(0),
    STAIR(1),
    LIFT(2),
    ENTRY(3);

    private final int code;

    ObjectCodes(int code){
        this.code = code;
    }

    public static int getAudience(){
        return AUDIENCE.code;
    }

    public static int getStair(){
        return STAIR.code;
    }

    public static int getLift(){
        return LIFT.code;
    }

    public static int getEntry(){
        return ENTRY.code;
    }

}
