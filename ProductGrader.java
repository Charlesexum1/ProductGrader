/*
 * ProductGrader.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * 
 */


public class ProductGrader {
	
	private String productName, productDescription, creatorName;
	private int creativeScore, scientificThoughtScore, thoroughnessScore,
	technicalSkillScore, clarityScore;
	
	public ProductGrader(String product, String description, String name){
		productName = product;
		productDescription = description;
		creatorName = name;
		creativeScore = 0;
		scientificThoughtScore = 0;
		thoroughnessScore = 0;
		technicalSkillScore = 0;
		clarityScore = 0;
		}
	
	public void setStrings(String product, String description, String name){
		productName = product;
		productDescription = description;
		creatorName = name;
		}
	
	public void setCreativeScore(int newScore){
		if (newScore > 0 && newScore <= 30) {
			creativeScore = newScore;
			System.out.println("You input: " + newScore + " for creativity.");
			}
		else {
			System.out.println("Invalid score, creativity not rated.");
			}	
		}
	public void setScientificThoughtScore(int newScore){
		if (newScore > 0 && newScore <= 30) {
			scientificThoughtScore = newScore;
			System.out.println("You input: " + newScore + " for scientific thought.");
			}
		else {
			System.out.println("Invalid score, scientific thought not rated.");
			}	
		}
	public void setThoroughnessScore(int newScore){
		if (newScore > 0 && newScore <= 15) {
			thoroughnessScore = newScore;
			System.out.println("You input: " + newScore + " for thoroughness.");
			}
		else {
			System.out.println("Invalid score, thoroughness not rated.");
			}	
		}	
	public void setTechnicalSkillsScore(int newScore){
		if (newScore > 0 && newScore <= 15) {
			technicalSkillScore = newScore;
			System.out.println("You input: " + newScore + " for technical skills.");
			}
		else {
			System.out.println("Invalid score, technical skill not rated.");
			}	
		}
	public void setClarityScore(int newScore){
		if (newScore > 0 && newScore <=10) {
			clarityScore = newScore;
			System.out.println("You input: " + newScore + " for clarity.");
			}
		else {
			System.out.println("Invalid score, clarity not rated.");
			}	
		}
	private int getScore(){
		return (creativeScore + scientificThoughtScore + thoroughnessScore
		+ technicalSkillScore + clarityScore);
		}
	private void formattedScore(){
		System.out.println();
		System.out.println("**Product Information**");
		System.out.println("Product Name: " + productName);
		System.out.println("Product Description: " + productDescription);
		System.out.println("Creator: " + creatorName);
		System.out.println();
		System.out.println("**Grades**");
		System.out.println("Creativity: " + creativeScore);
		System.out.println("Scientific Thought: " + scientificThoughtScore);
		System.out.println("Thoroughness: " + thoroughnessScore);
		System.out.println("Technical Skill: " + technicalSkillScore);
		System.out.println("Clarity: " + clarityScore);
		System.out.println();
		System.out.println("Total Score: " + this.getScore() + " out of 100" );
		}	
	public static void main (String args[]) {
		
		ProductGrader thingy = new ProductGrader("Ganoderma Sunshinicus", "A bio-engineered fungi " +
		"that eats plastic and metabolizes it into sunshine!", "CDE");
		thingy.setCreativeScore(29);
		thingy.setScientificThoughtScore(30);
		thingy.setThoroughnessScore(14);
		thingy.setTechnicalSkillsScore(15);
		thingy.setClarityScore(10);
		thingy.formattedScore();
		
	}
}

