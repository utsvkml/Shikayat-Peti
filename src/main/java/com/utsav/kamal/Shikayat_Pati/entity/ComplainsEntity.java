package com.utsav.kamal.Shikayat_Pati.entity;

import com.utsav.kamal.Shikayat_Pati.enums.ComplainStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ComplainsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cId;
    private String cTitle;
    private String cDescription;

    @Enumerated(EnumType.STRING)
    private ComplainStatus cStatus;
    private String cCategory;
    private String resolutionRemark;

    //     to Link the User to the Complain
    private Long userId;
}
