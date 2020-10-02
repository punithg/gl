package com.gl.hackathon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
@Table( name = "hackathon_team")
public class HackathonTeam {
    @Id
    @Column (name = "id")
    private Integer id;
    @Column (name = "name")
    private String name;
}
