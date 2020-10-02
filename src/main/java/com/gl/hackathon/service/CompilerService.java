package com.gl.hackathon.service;

import com.gl.hackathon.constant.TestCaseType;
import com.gl.hackathon.dto.SubmissionResponseDto;
import com.gl.hackathon.entity.HackathonSubmission;
import com.gl.hackathon.entity.User;
import com.gl.hackathon.exception.ServiceException;
import com.gl.hackathon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CompilerService")
public class CompilerService {

    @Autowired
    UserRepository userRepository;

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

        User user = userRepository.findUserById(1);
        System.out.println(user);
        SubmissionResponseDto submissionResponseDto = new SubmissionResponseDto("","OK",123,10,7,5);
        return submissionResponseDto;

    }
}
