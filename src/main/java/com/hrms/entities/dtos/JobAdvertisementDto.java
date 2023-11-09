package com.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {

    private String companyName;
    private String positionName;
    private int requiredPositionCount;
    private Date applicationDeadline;

}

