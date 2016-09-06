import java.util.*;

/**
*	A half-secretive map of	questions to answers (at most one answer per question).
*	Gives out random questions (keys) from the	map, and
*	can	be queried to test if a given question maps to a given answer.
*/
public	class QuestionsAnswers{
		
		public ArrayList<String> questions = new ArrayList<String>();
		private Map<String, String> answers = new HashMap<String, String>();
		private int numOfQuestions = 0;
		
		/**
		*	Maps	question	to	answer.
		*/
		void put(String	question,String	answer)	{
			// Lower case both questions and answer
			question = question.toLowerCase();
			answer = answer.toLowerCase();
			
			questions.add(question);
			answers.put(question, answer);
			numOfQuestions++;
		}
		/**
		*	Queries	if	question	maps	to	answer.
		*/
		boolean	testAnswer(String question,String answer){
			// Lower case both questions and answer
			question = question.toLowerCase();
			answer = answer.toLowerCase();
			
			return answer.equals(answers.get(question));	
		}
		/**
		*	Gives out a	random question from the key set.
		*/
		String getRandomQuestion(){
			Random rand = new Random();
			int rand_index;
			if(numOfQuestions > 0){
				rand_index = rand.nextInt(numOfQuestions);
				return questions.get(rand_index);
			}
			return "HashMap is empty, try again when filled";
		}
		/**
		*	Returns number of questions
		*/
		int getNumQuestions(){
			return numOfQuestions;
		}
}