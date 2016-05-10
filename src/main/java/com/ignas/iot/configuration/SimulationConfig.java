package com.ignas.iot.configuration;

import com.j256.ormlite.stmt.query.In;

/**
 * Created by ignas on 5/10/16.
 */
public class SimulationConfig {
    private Integer patientCount = 100;
    private Integer predefinedConditions = 1000000;

    private Integer threadCount = 5;
    private Integer workIterations = 1;

    // Must Be 100proc
    private Integer insertCondFreq = 100;
    private Integer findLatestFreq = 0;
    private Integer insertCondWithStatsFreq = 0;
    private Integer findLatestStatFreq = 0;
    private Integer dailyCondStatsFreq = 0;
    private Integer findLatestFromViewFreq = 0;

    public SimulationConfig(Integer patientCount, Integer predefinedConditions,
                            Integer threadCount, Integer workIterations, Integer insertCondFreq,
                            Integer findLatestFreq, Integer insertCondWithStatsFreq, Integer findLatestStatFreq,
                            Integer dailyCondStatsFreq, Integer findLatestFromViewFreq) {
        this.patientCount = patientCount;
        this.predefinedConditions = predefinedConditions;
        this.threadCount = threadCount;
        this.workIterations = workIterations;
        this.insertCondFreq = insertCondFreq;
        this.findLatestFreq = findLatestFreq;
        this.insertCondWithStatsFreq = insertCondWithStatsFreq;
        this.findLatestStatFreq = findLatestStatFreq;
        this.dailyCondStatsFreq = dailyCondStatsFreq;
        this.findLatestFromViewFreq = findLatestFromViewFreq;
    }

    public Integer getPatientCount() {
        return patientCount;
    }

    public Integer getPredefinedConditions() {
        return predefinedConditions;
    }

    public Integer getThreadCount() {
        return threadCount;
    }

    public Integer getWorkIterations() {
        return workIterations;
    }

    public Integer getInsertCondFreq() {
        return insertCondFreq;
    }

    public Integer getFindLatestFreq() {
        return findLatestFreq;
    }

    public Integer getInsertCondWithStatsFreq() {
        return insertCondWithStatsFreq;
    }

    public Integer getFindLatestStatFreq() {
        return findLatestStatFreq;
    }

    public Integer getDailyCondStatsFreq() {
        return dailyCondStatsFreq;
    }

    public Integer getFindLatestFromViewFreq() {
        return findLatestFromViewFreq;
    }
}
