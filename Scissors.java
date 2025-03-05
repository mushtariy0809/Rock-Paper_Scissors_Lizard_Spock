public class Scissors extends Choice{

	public String isBeatenByRock(){

		return YES;

	}

	public String isBeatenByPaper(){

		return NO;

	}

	public String isBeatenByScissors(){

		return TIE;

	}

	public String isBeatenByLizard(){

		return NO;

	}

	public String isBeatenBySpock(){

		return YES;

	}

	public String beats(Choice other){

		return other.isBeatenByRock();
		
	}



}
