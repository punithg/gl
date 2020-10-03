package com.gl.hackathon;

import com.gl.hackathon.constant.Language;
import com.gl.hackathon.dto.SubmissionResponseDto;
import com.gl.hackathon.entity.HackathonSubmission;
import com.gl.hackathon.entity.Submission;
import com.gl.hackathon.service.CompilerService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
class HackathonApplicationTests {

    @Autowired
    CompilerService compilerService;


    @Test
    public void whenCorrectObj_ispassed() {
        SubmissionResponseDto submissionResponseDto = new SubmissionResponseDto("","OK",123,10,7,5);

        HackathonSubmission hackathonSubmission = new HackathonSubmission();
        hackathonSubmission.setHackathonId(10);
        Submission submission = new Submission(Language.java, "8" ,"System.out.println(\"Hello World\")");
        hackathonSubmission.setSubmission(submission);


        Mockito.when(compilerService.submitResponse(hackathonSubmission)).thenReturn(submissionResponseDto);
        Integer codeId = compilerService.submitResponse(hackathonSubmission).getCodeId();
        String compileStatus = compilerService.submitResponse(hackathonSubmission).getCompileStatus();
        Integer passedCases = compilerService.submitResponse(hackathonSubmission).getPassedTestCases();

        Assert.assertEquals(new Integer(123), codeId);
        Assert.assertEquals("OK", compileStatus);
        Assert.assertEquals(new Integer(7), passedCases);
    }


    @Test
    public void whenIncorrectObj_ispassed() {
        SubmissionResponseDto submissionResponseDto = new SubmissionResponseDto("","OK",123,10,7,5);

        HackathonSubmission hackathonSubmission = new HackathonSubmission();
        hackathonSubmission.setHackathonId(10);
        Submission submission = new Submission(Language.java, "8" ,"System.out.println(\"Hello World\")");
        hackathonSubmission.setSubmission(submission);


        Mockito.when(compilerService.submitResponse(hackathonSubmission)).thenReturn(submissionResponseDto);
        Integer codeId = compilerService.submitResponse(hackathonSubmission).getCodeId();
        String compileStatus = compilerService.submitResponse(hackathonSubmission).getCompileStatus();
        Integer passedCases = compilerService.submitResponse(hackathonSubmission).getPassedTestCases();

        Assert.assertNotSame(new Integer(12), codeId);
        Assert.assertNotSame("FAILED", compileStatus);
        Assert.assertNotSame(new Integer(10), passedCases);
    }


}
