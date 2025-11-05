import java.util.*;
import java.util.stream.Collectors;

public class SortAggregatedValue {

    public static class order{
        int customerId;
        int amount;
        String status;

        public order(int customerId, int amount, String status){
            this.amount = amount;
            this.customerId = customerId;
            this.status = status;
        }
    }

    public static void main(String[] args){
        List<order> orders = Arrays.asList(
                new order(12, 200, "Paid"),
                new order(12, 300, "Unpaid"),
                new order(12, 400, "Paid")
        );

        Map<Integer, Integer> aggregatedValue = orders.stream()
                .filter(o -> "Paid".equals(o.status))
                .collect(Collectors.groupingBy(o -> o.customerId, Collectors.summingInt(o -> o.amount)));

        aggregatedValue.forEach((customerId, totalPaid) ->
                System.out.println("Customer " + customerId + " totalPaid = " + totalPaid));
    }
}
