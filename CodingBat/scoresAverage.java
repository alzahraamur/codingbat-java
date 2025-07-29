public class scoresAverage {
    public int scoresAverage(int[] scores) {
        int firstHalfAvg = average(scores, 0, scores.length / 2);

        int secondHalfAvg = average(scores, scores.length / 2, scores.length);
        return Math.max(firstHalfAvg, secondHalfAvg);
    }


    public int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }

        return sum / (end - start);
    }

}
