package i5.las2peer.services.AssessmentHandler.AssessmentContent;

import java.util.ArrayList;

public abstract class Assessment {
	private String topicName;
	private String quitIntent;
	private double marks;
	private int currentQuestion;
	private String currentWrongQuestions;
	private ArrayList<String> questions; 
	private ArrayList<String> textlevel;
	private ArrayList<Double> similarityScore;
	private ArrayList<String> textReference;
	private String type;
	private ArrayList<Double> questionWeight;
	
	public Assessment(String quitIntent, ArrayList<String> questions,private String type, ArrayList<String> textrefref) {
		this.quitIntent = quitIntent;
		this.questions = questions;
		this.marks = 0;
		this.currentQuestion = 0;
		this.currentWrongQuestions = "";
		this.textReference = textrefref;
		this.type = type;
	}
	public Assessment(String quitIntent, ArrayList<String> questions,private String type, ArrayList<String> textrefref,  ArrayList<Double> questionWeight ) {
		this.quitIntent = quitIntent;
		this.questions = questions;
		this.marks = 0;
		this.currentQuestion = 0;
		this.currentWrongQuestions = "";
		this.textReference = textrefref;
		this.type = type;
		this.questionWeight =questionWeight;
	}

	
	public String getType(){
		return this.type;
	}

	public String getQuitIntent() {
		return this.quitIntent;
	}
	
	public double getMarks() {
		return this.marks; 
	}
	
	public void incrementMark(double value) {
    	this.marks += (Math.round(value*100.0)/100.0);
    } 
	
	public int getCurrentQuestionNumber() {
		return this.currentQuestion;
	}
	
	public void incrementCurrentQuestionNumber() {
		this.currentQuestion++ ;
	}
	
	public int getAssessmentSize() {
		return this.questions.size();
	} 
	
	public String getWrongQuestions() {
		return this.currentWrongQuestions;	
	}
	
	public void addWrongQuestion(){
	    	this.currentWrongQuestions += questions.get(getCurrentQuestionNumber()) + "\n" ;
	} 
	
	public String getCurrentQuestion() {
		return this.questions.get(this.getCurrentQuestionNumber());
	}
	public Double getCurrentQuestionWeight() {
		return this.questionWeight.get(this.getCurrentQuestionNumber());
	}

	public void setLevel(String level){
		this.textlevel.set(this.getCurrentQuestionNumber(), level);
	}

	public void setSimilarity(double score){
		this.similarityScore.set(this.getCurrentQuestionNumber(), score);
	}
	public ArrayList<Double> getSimilarityScoreList(){
		return this.similarityScore;
	}
	public ArrayList<String> getLevelList(){
		return this.textlevel;
	}

	
	
	
	
}
