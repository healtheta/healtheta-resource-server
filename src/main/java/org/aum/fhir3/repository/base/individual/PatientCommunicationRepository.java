package org.aum.fhir3.repository.base.individual;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.aum.fhir3.model.base.individual.PatientCommunication;


@Repository
public interface PatientCommunicationRepository extends JpaRepository<PatientCommunication, Long> {

}