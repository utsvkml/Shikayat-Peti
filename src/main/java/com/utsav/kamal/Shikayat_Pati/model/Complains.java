package com.utsav.kamal.Shikayat_Pati.model;

import com.utsav.kamal.Shikayat_Pati.enums.ComplainStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Complains {

    private Long cId;
    private String cTitle;
    private String cDescription;
    private ComplainStatus cStatus;
    private String cCategory;
    private String resolutionRemark;

//     to Link the User to the Complain
    private Long userId;
}
