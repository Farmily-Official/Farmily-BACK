package com.farmily.farmilyback.controller;

import com.farmily.farmilyback.data.dto.QnaDto;
import com.farmily.farmilyback.service.QnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qna")
public class QnaController {
    private final QnaService qnaService;

    @Autowired
    public QnaController(QnaService qnaService) {
        this.qnaService = qnaService;
    }

    @GetMapping("/{farmId}/qnaToday")
    public ResponseEntity<QnaDto> QnaToday(@PathVariable Long farmId) {
        return ResponseEntity.status(HttpStatus.OK).body(qnaService.GetQna(farmId));
    }
}
