package com.gl.hackathon.controller;

import com.gl.hackathon.dto.LeaderBoardResponseDto;
import com.gl.hackathon.dto.SubmissionResponseDto;
import com.gl.hackathon.entity.HackathonSubmission;
import com.gl.hackathon.exception.ServiceException;
import com.gl.hackathon.service.CompilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/hackathon")
public class HackathonController {

    @Autowired
    CompilerService compilerService;

    @PostMapping(value="/submit")
    public ResponseEntity<?> compileSubmission(@RequestBody HackathonSubmission submission){
        try{
            SubmissionResponseDto submissionResponseDto = new SubmissionResponseDto();
            submissionResponseDto = compilerService.submitResponse(submission);
            return new ResponseEntity<>(submissionResponseDto, HttpStatus.OK);
        }catch (Exception e){
            throw new ServiceException("Error submitting Hackathon response");
        }
    }

    @GetMapping(value="/leaderboard/{hackathonId}")
    public ResponseEntity<?> getLeaderboard(@PathVariable Integer hackathonId){
        try{
            List<LeaderBoardResponseDto> leaderBoardResponseDto = new ArrayList<>();
            leaderBoardResponseDto = compilerService.getLeaderBoard(hackathonId);
            return new ResponseEntity<>(leaderBoardResponseDto, HttpStatus.OK);
        }catch (Exception e){
            throw new ServiceException("Error submitting Hackathon response");
        }
    }



}
