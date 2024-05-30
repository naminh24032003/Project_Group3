package org.swp391.valuationdiamond.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.swp391.valuationdiamond.dto.EvaluationRequestDTO;
import org.swp391.valuationdiamond.entity.EvaluationRequest;
import org.swp391.valuationdiamond.mapper.EvaluationRequestMapper;
import org.swp391.valuationdiamond.reponsitory.EvaluationRequestReponsitory;

@Service
public class EvaluationRequestImp implements IEvaluationRequest{

  @Autowired
  private EvaluationRequestReponsitory evaluationRequestReponsitory;

  // Ở hàm này, tui muốn tạo một cái ID với định dạng là
  // ER(Evaluation Request) + số thứ tự request + ngày tháng năm hiện tại
  @Override
  public String generateRequestId() {
    long count = evaluationRequestReponsitory.count();
    String dateTime = LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyyyy"));
    String requestId = "ER" + count + dateTime;
    return requestId;
  }

  @Override
  public EvaluationRequestDTO createEvaluationRequest(EvaluationRequestDTO evaluationRequestDTO) {
    EvaluationRequest evaluationRequest = EvaluationRequestMapper.mapToEvaluationRequest(evaluationRequestDTO);
    evaluationRequest.setRequestId(generateRequestId());
    evaluationRequestReponsitory.save(evaluationRequest);
    return evaluationRequestDTO;
  }

  @Override
  public EvaluationRequestDTO updateEvaluationRequest(EvaluationRequestDTO evaluationRequestDTO) {
    return null;
  }

  @Override
  public boolean deleteEvaluationRequest(String requestId) {
    return false;
  }

  @Override
  public EvaluationRequestDTO getEvaluationRequest(String requestId) {
    return evaluationRequestReponsitory.findById(requestId)
        .map(EvaluationRequestMapper::mapToEvaluationRequestDTO)
        .orElse(null);
  }


}
