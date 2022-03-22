package com.edu.interfaces;
//implements 인터페이스 불러옴 
public class OracleDao implements Dao{
	//구현클래스 

	@Override
	public void select() {
		System.out.println("OracleDB에서 조회합니다.");
		
	}

	@Override
	public void insert() {
		System.out.println("OracleDB에서 입력합니다");
		
	}

	@Override
	public void update() {
		System.out.println("OracleDB에서 수정합니다");
	}

	@Override
	public void delete() {
		System.out.println("OracleDB에서 삭제합니다");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

}
