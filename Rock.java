public class Rock extends Choice{

	public String isBeatenByRock(){

		return TIE;

	}

	public String isBeatenByPaper(){

		return YES;

	}

	public String isBeatenByScissors(){

		return NO;

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
