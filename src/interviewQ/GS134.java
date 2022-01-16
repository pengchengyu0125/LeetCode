package interviewQ;

public class GS134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumOil = 0;
        int sumCost = 0;
        for (int i = 0; i < gas.length; i++) {
            sumOil += gas[i];
            sumCost += cost[i];
        }
        if (sumOil < sumCost)
            return -1;
        sumOil = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            sumOil += gas[i] - cost[i];
            if (sumOil < 0) {
                sumOil = 0;
                index = i + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5}, cost = {3, 4, 5, 1, 2};
        GS134 gs134 = new GS134();
        System.out.println(gs134.canCompleteCircuit(gas, cost));
    }
}
