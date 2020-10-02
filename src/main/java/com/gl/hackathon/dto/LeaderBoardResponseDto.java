package com.gl.hackathon.dto;

import com.gl.hackathon.entity.HackathonLeaderboard;
import com.gl.hackathon.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LeaderBoardResponseDto {
    private String name;
    private String teamName;
    private Integer position;
    private Integer submissionTime;
    private Integer totalTestCases;
    private Integer passedTestCases;

    public LeaderBoardResponseDto(User user, HackathonLeaderboard hackathonLeaderBoard, String teamName){
        this.name = user.getName();
        this.teamName = teamName;
        this.position = hackathonLeaderBoard.getPosition();
        this.submissionTime = hackathonLeaderBoard.getSubmissionTime();
        this.totalTestCases = hackathonLeaderBoard.getTotalTestCases();
        this.passedTestCases = hackathonLeaderBoard.getPassedTestCases();
    }

}
