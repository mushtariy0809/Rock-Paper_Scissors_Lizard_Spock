public class Spock extends Choice{

	public String isBeatenByRock(){

		return NO;

	}

	public String isBeatenByPaper(){

		return YES;

	}

	public String isBeatenByScissors(){

		return NO;

	}

	public String isBeatenByLizard(){

		return YES;

	}

	public String isBeatenBySpock(){

		return TIE;

	}

	public String beats(Choice other){

		return other.isBeatenByRock();
		
	}



}
