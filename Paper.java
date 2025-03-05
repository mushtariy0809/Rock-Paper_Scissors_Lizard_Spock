public class Paper extends Choice{

	public String isBeatenByRock(){

		return NO;

	}

	public String isBeatenByPaper(){

                return TIE;

        }

        public String isBeatenByScissors(){

                return YES;

        }

        public String isBeatenByLizard(){

                return YES;

        }

        public String isBeatenBySpock(){

                return NO;

        }
	
	public String beats(Choice other){

		return other.isBeatenByPaper();

	}
}
