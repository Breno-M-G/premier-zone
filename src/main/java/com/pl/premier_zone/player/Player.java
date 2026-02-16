package com.pl.premier_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="premier_statistics")
public class Player {
    @Id
    @Column(name = "player_name", unique = true)
    private String name;
    private String nation;
    @Column(name = "position", unique = true)
    private String pos;
    private Integer age;
    @Column(name = "matches_played", unique = true)
    private Integer ap;
    private Integer starts;
    @Column(name = "minutes_played", unique = true)
    private Double min;
    @Column(name = "goals", unique = true)
    private Double gls;
    @Column(name = "assists", unique = true)
    private Double ast;
    @Column(name = "penalties_scored", unique = true)
    private Double pk;
    @Column(name = "yellow_cards", unique = true)
    private Double crdy;
    @Column(name = "red_cards", unique = true)
    private Double crdr;
    @Column(name = "expected_goals", unique = true)
    private Double xg;
    @Column(name = "expected_assists", unique = true)
    private Double xag;
    @Column(name = "team_name", unique = true)
    private String team;

    protected Player(){

    }

    public Player(String name, String nation, String pos, Integer age, Integer ap, Integer starts, Double min, Double gls, Double ast, Double pk, Double crdy, Double crdr, Double xg, Double xag, String team) {
        this.name = name;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.ap = ap;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.pk = pk;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xg = xg;
        this.xag = xag;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public String getPos() {
        return pos;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getAp() {
        return ap;
    }

    public Integer getStarts() {
        return starts;
    }

    public Double getMin() {
        return min;
    }

    public Double getGls() {
        return gls;
    }

    public Double getAst() {
        return ast;
    }

    public Double getPk() {
        return pk;
    }

    public Double getCrdy() {
        return crdy;
    }

    public Double getCrdr() {
        return crdr;
    }

    public Double getXg() {
        return xg;
    }

    public Double getXag() {
        return xag;
    }

    public String getTeam() {
        return team;
    }

    public void setName(String name) {
    }

    public void setPos(String pos) {
    }

    public void setNation(String nation) {
    }
}