package com.gl.hackathon.repository;

import com.gl.hackathon.entity.HackathonLeaderboard;
import com.gl.hackathon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HackathonLeaderBoardRepository extends JpaRepository<HackathonLeaderboard, Integer> {


    @Query("select L from HackathonLeaderboard L where hackathonId = :id")
    public List<HackathonLeaderboard> findByHackathonId(@Param("id") Integer hackathonId);

}
