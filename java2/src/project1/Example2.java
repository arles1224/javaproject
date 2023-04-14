package project1;

public class Example2 {
	// 배열 + abstract 사용하기
	public static void main(String[] args) {
		// 추상 클래스를 사용하면 빠르게 객체를 로드할 수 있다.
		
		//추상 클래스명으로 배열을 생성해 new 클래스명()으로 해당 클래스 내부의 메소드 전체를 등록시킨다. 
		Box[] box = {new Abox(), new Abox2(), new Abox3()};
		
		// 배열값으로 각각의 메소드를 호출하는 방법
		// box[0].dataload();
		// box[1].dataload();
		// box[2].dataload();
		
		// 반복문으로 메소드를 호출하는 방법
		int w = 0;
		while(w < box.length) {
			if(w != 1) { // 노드 1번 데이터 제외
				box[w].dataload();
			}
			w++;
		}
	}

}

abstract class Box{
	public abstract void dataload();
}

class Abox extends Box {
	@Override
	public void dataload() {
		System.out.println("1번 데이터 로드");
	}
}

class Abox2 extends Box {
	@Override
	public void dataload() {
		System.out.println("2번 데이터 로드");
	}
}

class Abox3 extends Box {
	@Override
	public void dataload() {
		System.out.println("3번 데이터 로드");
	}
}