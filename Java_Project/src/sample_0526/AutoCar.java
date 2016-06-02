package sample_0526;

public class AutoCar implements OperateCar {

	public void start()
	{
		System.out.println("자동차 출발");
	}
	
	public void stop()
	{
		System.out.println("자동차 정지");
	}
	
	public void setSpeed(int speed)
	{
		System.out.println("자동차 속도를 " +speed+"km/h로 바꿉니다");
	}
	
	public void turn(int degree)
	{
		System.out.println("자동차 방향을 " +degree + "도 만큼 바꿉니다");
	}
}
