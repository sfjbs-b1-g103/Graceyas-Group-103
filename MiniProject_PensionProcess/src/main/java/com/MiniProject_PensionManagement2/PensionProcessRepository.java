package com.MiniProject_PensionManagement2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PensionProcessRepository extends CrudRepository<PensionProcess, Integer> {

}
