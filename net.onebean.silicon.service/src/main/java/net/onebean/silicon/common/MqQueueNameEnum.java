package net.onebean.silicon.common;

public enum MqQueueNameEnum {
    ;
    private String name;

    MqQueueNameEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}