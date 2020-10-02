package com.gl.hackathon.entity;

import com.gl.hackathon.constant.TestCaseType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestCaseInput {
    private TestCaseType type;
    private Object input;
}
