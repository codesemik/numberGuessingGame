import java.util.Random;
import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		
			int number = random.nextInt(11);
			int guess = 0;
			int life = 3;
			int score = 0;
				while(guess != number && life != 0) {
					guess = input.nextInt();
						
					
					if(guess < number) {
						System.out.println("Reduce the number");
					}
					else if(guess > number) {
						System.out.println("İncrease the number");
					}
					else if(guess>10 && guess<0) {
						System.out.println("Enter a number between 10 and 0");
					}
					else {
						if(life==3) {
							score+=100;
							System.out.println("Congratulations, you guessed the number correctly. Your score"+ score);
						}
						else if(life==2) {
							score+=60;
							System.out.println("Congratulations, you guessed the number correctly. Your score"+ score);
						}
						else if(life==1) {
							score+=30;
							System.out.println("Congratulations, you guessed the number correctly. Your score"+ score);
						}
					}
					life--;
					if(life != 0) {
						System.out.println(life+" lives left");
					}
					if(life == 0) {
					System.out.println("Correct number: "+number);
					}}
		

	}
	}
