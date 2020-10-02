package com.gl.hackathon.service;

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

@Service("leaderBoardService")
public class LeaderBoardService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    HackathonLeaderBoardRepository hackathonLeaderBoardRepository;
    @Autowired
    HackathonTeamRepository hackathonTeamRepository;


    public List<LeaderBoardResponseDto> getLeaderBoard(Integer hackathonId){

        List<HackathonLeaderboard> hackathonLeaderboards = hackathonLeaderBoardRepository.findByHackathonId(hackathonId);

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
