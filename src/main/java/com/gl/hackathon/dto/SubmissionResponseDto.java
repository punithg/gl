package com.gl.hackathon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SubmissionResponseDto {
    private String error;
    private String compileStatus;
    private Integer codeId;
    private Integer totalTestCases;
    private Integer passedTestCases;
    private Integer thresholdTestCases;
}
