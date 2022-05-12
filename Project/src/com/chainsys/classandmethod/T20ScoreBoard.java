package com.chainsys.classandmethod;

public class T20ScoreBoard {
    private int CurrentScore;
    private final int target;
	public int getCurrentScore() {
		return CurrentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.CurrentScore += currentScore;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public static int getMaxOvers() {
		return max_Overs;
	}
	public int getCompleted_overs() {
		return Completed_overs;
	}
	public void setCompleted_overs(int completed_overs) {
		this.Completed_overs += completed_overs;
	}
	public int getRunrate() {
		return runrate;
	}
	public void setRunrate(int runrate) {
		this.runrate = runrate;
	}
	
	
	    private int runrate;
	    private final static int max_Overs = 20;
	    private int Completed_overs;
	    public T20ScoreBoard(int targetscore) {
	    	this.target = targetscore;
	    }
	    public int getCurrent
}
