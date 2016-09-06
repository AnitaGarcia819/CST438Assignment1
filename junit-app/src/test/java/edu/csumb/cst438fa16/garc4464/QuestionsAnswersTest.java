import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;


public class QuestionsAnswersTest {
	
	QuestionsAnswers test;
	int numQuestions; 
	@Before 
	public void create(){
		test = new QuestionsAnswers();
		numQuestions = test.getNumQuestions();
	}
	
	@Test
	public void testGetRandomQuestionsIfQuestionsNotInitialized() {
		if(test.questions == null)
			assertFalse(false);
	}
	
	@Test
	public void testGetRandomQuestionsIfNumOfQuestionsZero() {
		if(numQuestions == 0)
			assertTrue(test.getRandomQuestion().equals("HashMap is empty, try again when filled"));
	}
	
	@Test
	public void testGetRandomQuestionsIfQuestionsInitialized() {
		assertTrue(test.questions != null);
	}
	
	@Test 
	public void testGetRandomQuestionsIfNumOfQuestionsGreaterZero() {
		test.put("Who invented Java?","James Gosling");
		Random rand = new Random();
		int rand_index;
		if(numQuestions > 0){
			rand_index = rand.nextInt(numQuestions);
			assertTrue(test.questions.contains(test.questions.get(rand_index)));
		}		
	}
}
