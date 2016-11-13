

public class Computer implements ReadInterface, WriteInterface, LoadMoreInterface{

	@Override
	public void readInfo(){ // functions of computer

		System.out.println("Computer can read info from one user");

	}

	@Override
	public void writeInfo(){

                System.out.println("Computer can write info from one user");

	}

	@Override
	public void loadMoreInfo(){

		System.out.println("Computer can load info from one user");

	}

	@Override
	public void loadInfo(){

		System.out.println("Computer can load personal info from one user");

	}
    
}
