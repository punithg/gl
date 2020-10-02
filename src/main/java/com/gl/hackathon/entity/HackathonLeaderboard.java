package com.gl.hackathon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "hackathon_leaderboard")
public class HackathonLeaderboard {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "hackathon_id")
    private Integer hackathonId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "position")
    private Integer position;
    @Column(name = "submission_time")
    private Integer submissionTime;
    @Column(name = "total_test_cases")
    private Integer totalTestCases;
    @Column(name = "passed_test_cases")
    private Integer passedTestCases;
}
