package STUDY;

public class Java_0623_1 {
    public static <Java0602_2> void main(String[] args) {
        Java_0623_1 j = new Java_0623_1();

        String [] seoul = {"Jane", "Kim"};

        j.solution(seoul);
    }
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i <=seoul.length-1; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 "+i+"에 있다.";
            }
        }
        System.out.println(answer);
        return answer;
    }
}
