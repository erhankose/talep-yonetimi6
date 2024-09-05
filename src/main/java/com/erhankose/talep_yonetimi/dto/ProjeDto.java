package com.erhankose.talep_yonetimi.dto;

import org.modelmapper.internal.bytebuddy.utility.nullability.NeverNull;

public class ProjeDto {

    private Long id;
    @NeverNull
    private String pad;
    @NeverNull
    private String pkodu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPad() {
        return pad;
    }

    public void setPad(String pad) {
        this.pad = pad;
    }

    public String getPkodu() {
        return pkodu;
    }

    public void setPkodu(String pkodu) {
        this.pkodu = pkodu;
    }
}
