package org.swp391.valuationdiamond.service;

import org.swp391.valuationdiamond.dto.EvaluationRequestDTO;
import org.swp391.valuationdiamond.entity.EvaluationRequest;

public interface IEvaluationRequest {

  public String generateRequestId();

  public EvaluationRequestDTO createEvaluationRequest(EvaluationRequestDTO evaluationRequestDTO);

  public EvaluationRequestDTO updateEvaluationRequest(EvaluationRequestDTO evaluationRequestDTO);

  public boolean deleteEvaluationRequest(String requestId);

  public EvaluationRequestDTO getEvaluationRequest(String requestId);

}
