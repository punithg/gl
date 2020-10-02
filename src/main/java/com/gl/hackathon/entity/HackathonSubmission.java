package com.gl.hackathon.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class HackathonSubmission {
    private Integer hackathonId;
    private Submission submission;
}
