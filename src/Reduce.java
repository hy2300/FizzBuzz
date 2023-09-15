public class Reduce {

    public static void main(String[] args) {
    int n=100;
    int number_of_steps = 0;
    while(n != 0){
        if (n%2 == 0){
            n = n/2;
            number_of_steps +=1;
        }
        else {
            n-=1;
            number_of_steps +=1;
        }
    }
        System.out.println(number_of_steps);
    }
}
