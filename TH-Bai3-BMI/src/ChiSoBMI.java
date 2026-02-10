
public class ChiSoBMI {

	public static void main(String[] args) {
		//BMI = cân nặng (kg) / (chiều cao (m) * chiều cao (m))
		
		double weight = 80;
		double height = 1.90;
		
		double bmi = weight / (height * height);
		
		System.out.println("Cân nặng: " + weight);
		System.out.println("Chiều cao: " + height);
		System.out.println("Chỉ số BMI: " + bmi);
		
		//Phân loại BMI
		if(bmi < 18.5) {
			System.out.println("Phân loại: Thiếu cân");
		} else if(bmi < 25) {
			System.out.println("Phân loại: Cân đối/Bình thường");
		} else if(bmi < 30) {
			System.out.println("Phân loại: Thừa cân");
		} else {
			System.out.println("Phân loại: Béo phì");
		}
		
	}

}
