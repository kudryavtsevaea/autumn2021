package com.natcracker.domain.enims;

public enum Season {
    WINTER("�������"),
    SPRING("�����"),
    SUMMER("�����"),
    AUTUMN("��������");

    private String description;

    Season(String description) {this.description = description;}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
