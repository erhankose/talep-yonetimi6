package com.erhankose.talep_yonetimi.dto;

import lombok.Data;
import org.modelmapper.internal.bytebuddy.utility.nullability.NeverNull;
@Data
public class ProjeDto {

    private Long id;
    @NeverNull
    private String pad;
    @NeverNull
    private String pkodu;

}
