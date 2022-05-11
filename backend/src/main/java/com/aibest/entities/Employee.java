package com.aibest.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private long id;

    private LocalDate uploadDate;
    @ManyToOne
    @JoinColumn(name = "company_id",
    referencedColumnName = "id")
    private Company company;
    private Integer year;
    private Integer month;
    private Integer anonymised_employee_id;
    private Integer employee_id;
    private LocalDate birthDate;
    private Integer sex;
    private Integer cor;
    private Integer corVersion = 9;
    private LocalDate consignmentDate;
    private String contractNumber;
    private String previousContractNumber;
    private LocalDate contractDate;
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
    // contractTimeType = nedeterminata / determinata
    private String contractTimeType;
    // normType = norma intreaga / partiala
    private String normType;
    // norm =  NormaIntreaga840,  NormaIntreaga630
    private String norm;
    //shiftDuration = 8, 7, 6 ore de lucru
    private Integer shiftDuration;
    //shiftType = orePeZi / orePeNoapte;
    private String shiftType;
    //allocationType = oreDeZi / oreDeNoapte
    private String allocationType;
    private String contractType;
    private Integer salary;
    private LocalDate endDate;
    private String legalTerminationGrounds;
    private LocalDate suspensionStartDate;
    private LocalDate suspensionEndDate;
    private String legalSuspensionGrounds;
    private LocalDate suspensionStopDate;
    private String currentCondition;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", uploadDate=" + uploadDate +
                ", company=" + company +
                ", year=" + year +
                ", month=" + month +
                ", anonymised_employee_id=" + anonymised_employee_id +
                ", employee_id=" + employee_id +
                ", birthDate=" + birthDate +
                ", sex=" + sex +
                ", cor=" + cor +
                ", corVersion=" + corVersion +
                ", consignmentDate=" + consignmentDate +
                ", contractNumber='" + contractNumber + '\'' +
                ", previousContractNumber='" + previousContractNumber + '\'' +
                ", contractDate=" + contractDate +
                ", contractStartDate=" + contractStartDate +
                ", contractEndDate=" + contractEndDate +
                ", contractTimeType='" + contractTimeType + '\'' +
                ", normType='" + normType + '\'' +
                ", norm='" + norm + '\'' +
                ", shiftDuration=" + shiftDuration +
                ", shiftType='" + shiftType + '\'' +
                ", allocationType='" + allocationType + '\'' +
                ", contractType='" + contractType + '\'' +
                ", salary=" + salary +
                ", endDate=" + endDate +
                ", legalTerminationGrounds='" + legalTerminationGrounds + '\'' +
                ", suspensionStartDate=" + suspensionStartDate +
                ", suspensionEndDate=" + suspensionEndDate +
                ", legalSuspensionGrounds='" + legalSuspensionGrounds + '\'' +
                ", suspensionStopDate=" + suspensionStopDate +
                ", currentCondition='" + currentCondition + '\'' +
                '}';
    }
}
