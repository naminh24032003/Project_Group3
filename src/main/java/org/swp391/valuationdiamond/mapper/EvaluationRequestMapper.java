package org.swp391.valuationdiamond.mapper;

import org.swp391.valuationdiamond.dto.EvaluationRequestDTO;
import org.swp391.valuationdiamond.entity.EvaluationRequest;

public class EvaluationRequestMapper {
    public static EvaluationRequestDTO mapToEvaluationRequestDTO(EvaluationRequest evaluationRequest) {
        EvaluationRequestDTO evaluationRequestDTO = new EvaluationRequestDTO();
        evaluationRequestDTO.setRequestId(evaluationRequest.getRequestId());
        evaluationRequestDTO.setRequestDescription(evaluationRequest.getRequestDescription());
        evaluationRequestDTO.setRequestDate(evaluationRequest.getRequestDate());
        evaluationRequestDTO.setRequestEmail(evaluationRequest.getRequestEmail());
        evaluationRequestDTO.setGuestName(evaluationRequest.getGuestName());
        evaluationRequestDTO.setStatus(evaluationRequest.getStatus());
        evaluationRequestDTO.setPhoneNumber(evaluationRequest.getPhoneNumber());
        evaluationRequestDTO.setAccountId(String.valueOf(evaluationRequest.getAccountId()));
        evaluationRequestDTO.setServiceId(String.valueOf(evaluationRequest.getServiceId()));
        return evaluationRequestDTO;
    }

    public static EvaluationRequest mapToEvaluationRequest(EvaluationRequestDTO evaluationRequestDTO) {
        EvaluationRequest evaluationRequest = new EvaluationRequest();
        evaluationRequest.setRequestId(evaluationRequestDTO.getRequestId());
        evaluationRequest.setRequestDescription(evaluationRequestDTO.getRequestDescription());
        evaluationRequest.setRequestDate(evaluationRequestDTO.getRequestDate());
        evaluationRequest.setRequestEmail(evaluationRequestDTO.getRequestEmail());
        evaluationRequest.setGuestName(evaluationRequestDTO.getGuestName());
        evaluationRequest.setStatus(evaluationRequestDTO.getStatus());
        evaluationRequest.setPhoneNumber(evaluationRequestDTO.getPhoneNumber());
        return evaluationRequest;
    }

}
