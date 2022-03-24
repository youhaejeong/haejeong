package p20220324.exercise;

// 상속 부모 클래스 있으면 밑의 자식 클래스에 상속 함
public class Cellphone {
//필드
	String model;
	String color;
	// 생성자

	// 메소드
	void powereOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");
	}

	void sendVoice(String message) {
		System.out.println("자기: " + message);
	}

	void resceiveVoice(String message) {
		System.out.println("상대방: " + message);
	}

	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
