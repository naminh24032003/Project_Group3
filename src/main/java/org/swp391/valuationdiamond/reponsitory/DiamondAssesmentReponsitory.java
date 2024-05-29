package org.swp391.valuationdiamond.reponsitory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.swp391.valuationdiamond.entity.DiamondAssessment;

@Repository
public interface DiamondAssesmentReponsitory extends JpaRepository<DiamondAssessment, String>{

}
