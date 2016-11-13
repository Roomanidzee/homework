

public class Phone implements ReadInterface, WriteInterface, LoadMoreInterface{

        @Override
	public void readInfo(){//functions for phone

		System.out.println("Phone can read info from many users");

	}

	@Override
	public void writeInfo(){

                System.out.println("Phone can write info from many users");

	}

	@Override
	public void loadMoreInfo(){

		System.out.println("Phone can load info from many users");

	}

	@Override
	public void loadInfo(){

		System.out.println("Phone can load personal info from many users");

	}
    
}
