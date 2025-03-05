public class Lizard extends Choice{

	public String isBeatenByRock(){

		return YES;

	}

	public String isBeatenByPaper(){

		return NO;

	}

	public String isBeatenByScissors(){

		return YES;

	}

	public String isBeatenByLizard(){

		return TIE;

	}

	public String isBeatenBySpock(){

		return NO;

	}

	public String beats(Choice other){

		return other.isBeatenByRock();
		
	}



}
