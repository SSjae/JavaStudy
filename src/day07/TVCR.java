package day07;

public class TVCR extends Tv{ // 상속
	VCR vcr = new VCR(); // 포함관계
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	public static void main(String[] args) {
		TVCR tvcr = new TVCR();
		tvcr.power();
		tvcr.channelDown();
		tvcr.channelUp();
		tvcr.play();
	}

}

class VCR {
	boolean power;
	int counter = 0;
	
	void power() {
		power = !power;
	}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}