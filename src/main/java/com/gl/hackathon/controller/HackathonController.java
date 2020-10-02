package com.gl.hackathon.controller;

import com.gl.hackathon.dto.SubmissionResponseDto;
import com.gl.hackathon.entity.HackathonSubmission;
import com.gl.hackathon.exception.ServiceException;
import com.gl.hackathon.service.CompilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hackathon")
public class HackathonController {

    @Autowired
    CompilerService compilerService;

    @PostMapping(value="/submit")
    public ResponseEntity<?> compileSubmission(@RequestBody HackathonSubmission submission){
        try{
            compilerService.submitResponse(submission);
            SubmissionResponseDto submissionResponseDto = new SubmissionResponseDto();
            return new ResponseEntity<>(submissionResponseDto, HttpStatus.OK);
        }catch (Exception e){
            throw new ServiceException("Error submitting Hackathon response");
        }
    }



}
