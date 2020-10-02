package com.gl.hackathon.entity;

import com.gl.hackathon.constant.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Submission {
    private Language language;
    private String version;
    private String code;
}
