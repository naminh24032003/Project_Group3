package org.swp391.valuationdiamond.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.swp391.valuationdiamond.entity.Account;

@Repository
public interface AcountReponsitory extends JpaRepository<Account, String> {

}
