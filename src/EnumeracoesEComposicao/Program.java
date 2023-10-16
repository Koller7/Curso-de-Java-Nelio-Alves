package EnumeracoesEComposicao;

import java.util.Date;

import entities.enums.orderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), orderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		orderStatus os1 = orderStatus.DELIVERED;
		
		orderStatus os2 = orderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
