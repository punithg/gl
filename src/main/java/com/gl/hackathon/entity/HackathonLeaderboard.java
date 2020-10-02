package com.gl.hackathon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class HackathonLeaderboard {
    private Integer id;
    private Integer hackathonId;
    private Integer userId;
    private Integer position;
    private Integer submissionTime;
    private Integer totalTestCases;
    private Integer passedTestCases;
}
