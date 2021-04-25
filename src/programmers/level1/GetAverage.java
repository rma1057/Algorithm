package programmers.level1;

// 평균 구하기
public class GetAverage {
    public double solution(int[] arr) {
        double answer = 0;
        double sum=0;
        double num=arr.length;

        for (int i=0; i< arr.length; i++){
            sum+=arr[i];
        }//end for
        answer=sum/num;
        return answer;
    }
}
