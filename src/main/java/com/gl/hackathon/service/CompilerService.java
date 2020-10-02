package com.gl.hackathon.service;

import com.gl.hackathon.entity.HackathonSubmission;
import com.gl.hackathon.exception.ServiceException;
import org.springframework.stereotype.Service;

@Service("CompilerService")
public class CompilerService {

    public boolean submitResponse(HackathonSubmission submision) throws ServiceException {
        return true;

    }
}
