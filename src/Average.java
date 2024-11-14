import java.util.Scanner;

public class Average {
    private int[] data = {0,0,0,0,0};
    private double mean = 0;

    public Average() {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score number "
                    + (i + 1) + ": ");
            this.data[i] = console.nextInt();
        }
        selectionSort();
        calculateMean();
    }

    public void calculateMean() {
        int sum = 0;
        for (int i = 0; i < 5;  i++) {
            sum += this.data[i];
        }
        this.mean = (double) (sum) / 5;
    }

    @Override
    public String toString() {
        String text = "Scores: ";
        for (int i = 0; i < 5; i++) {
            text += i == 4 ? this.data[i] + "\n" : this.data[i] + ", ";
        }
        text += "Mean: " + this.mean;
        return text;
    }

    public void selectionSort() {
        int replace;
        for (int i = 0; i < this.data.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < this.data.length; j++) {
                if (this.data[idx] < this.data[j]) {
                    idx = j;
                }
            }
            replace = this.data[i];
            this.data[i] = this.data[idx];
            this.data[idx] = replace;
        }
    }
}
