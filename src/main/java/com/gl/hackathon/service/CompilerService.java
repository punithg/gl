package com.gl.hackathon.service;

import com.gl.hackathon.constant.TestCaseType;
import com.gl.hackathon.dto.LeaderBoardResponseDto;
import com.gl.hackathon.dto.SubmissionResponseDto;
import com.gl.hackathon.entity.HackathonLeaderboard;
import com.gl.hackathon.entity.HackathonSubmission;
import com.gl.hackathon.entity.HackathonTeam;
import com.gl.hackathon.entity.User;
import com.gl.hackathon.exception.ServiceException;
import com.gl.hackathon.repository.HackathonLeaderBoardRepository;
import com.gl.hackathon.repository.HackathonTeamRepository;
import com.gl.hackathon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("CompilerService")
public class CompilerService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    HackathonLeaderBoardRepository hackathonLeaderBoardRepository;
    @Autowired
    HackathonTeamRepository hackathonTeamRepository;

    public SubmissionResponseDto submitResponse(HackathonSubmission hackathonSubmission) throws ServiceException {
        /*
        Call the Compiler service for the specific language, ideally a separate
        microservice for each compiler. And a separate service in our backend for each Language
         */

        switch (hackathonSubmission.getSubmission().getLanguage()) {
            case java:
                /*
                Call the specific compilation Service
                 */
                break;
            case python:
                break;
            case javascript:
                break;
            case go:
                break;
            case kotlin:
                break;
            case swift:
                break;
        }

        SubmissionResponseDto submissionResponseDto = new SubmissionResponseDto("","OK",123,10,7,5);
        return submissionResponseDto;

    }

    public List<LeaderBoardResponseDto> getLeaderBoard(Integer hackathonId){

        List<HackathonLeaderboard> hackathonLeaderboards = hackathonLeaderBoardRepository.findByHackathonId(hackathonId);

        System.out.println(hackathonLeaderboards);

        List<LeaderBoardResponseDto> leaderBoardResponseDtos = new ArrayList<>();

        for(HackathonLeaderboard hackathonLeaderboard : hackathonLeaderboards){
            User user = userRepository.findUserById(hackathonLeaderboard.getUserId());
            HackathonTeam hackathonTeam = hackathonTeamRepository.findTeamById(user.getHackathonTeamId());
            LeaderBoardResponseDto leaderBoardResponseDto = new LeaderBoardResponseDto(user, hackathonLeaderboard,
                    hackathonTeam.getName());

            leaderBoardResponseDtos.add(leaderBoardResponseDto);

        }
        return leaderBoardResponseDtos;
    }

}
