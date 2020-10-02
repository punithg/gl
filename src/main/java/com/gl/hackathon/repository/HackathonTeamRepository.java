package com.gl.hackathon.repository;

import com.gl.hackathon.entity.HackathonLeaderboard;
import com.gl.hackathon.entity.HackathonTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HackathonTeamRepository extends JpaRepository<HackathonTeam, Integer> {

    public HackathonTeam findTeamById(Integer id);

}
