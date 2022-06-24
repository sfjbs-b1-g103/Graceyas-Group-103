package com.MiniProject_PensionManagement;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PensionerDetailsRepository extends CrudRepository<PensionerDetails, Integer> {

}
