package com.farmily.farmilyback.service;

import com.farmily.farmilyback.data.dto.QnaDto;
import com.farmily.farmilyback.data.entity.Farm;
import com.farmily.farmilyback.data.entity.Qna;
import com.farmily.farmilyback.data.repository.QnaRepository;
import com.farmily.farmilyback.data.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QnaService {

    private final QnaRepository qnaRepository;
    private final FarmRepository farmRepository;

    @Autowired
    public QnaService(QnaRepository qnaRepository, FarmRepository farmRepository) {
        this.qnaRepository = qnaRepository;
        this.farmRepository = farmRepository;
    }

    public QnaDto GetQna(Long farmId) {
        Farm farmInfo = farmRepository.getReferenceById(farmId);
        Long qnaNumber = farmInfo.getQna();

        QnaDto qnaDto = new QnaDto();
        Qna qna = qnaRepository.getReferenceById(qnaNumber);

        return qnaDto;
    }

}
