package week3.Ex1.Stream;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class JavaReduce {

    public static void main(String[] args) {

        List<Invoice> invoices = Arrays.asList(
                new Invoice("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
                new Invoice("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
                new Invoice("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2))
        );

        BigDecimal sum = invoices.stream()
                .map(x -> x.getQty().multiply(x.getPrice()))    // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);      // reduce
        
        
        System.out.println(invoices.stream()
                .map(x -> x.getQty().multiply(x.getPrice())).reduce(BigDecimal.ZERO, BigDecimal::divide));
        
                
        
        
        System.out.println(sum);    // 49.955
        System.out.println(sum.setScale(2, RoundingMode.HALF_UP));  // 49.96

    }

}

class Invoice { // 송장이라는 뜻 널 송장으로 만들어버리겠다는 뜻 ㅋㅋ 뒤졌다 넌

    String invoiceNo;
    BigDecimal price;
    BigDecimal qty;
	public Invoice(String invoiceNo, BigDecimal price, BigDecimal qty) {
		super();
		this.invoiceNo = invoiceNo;
		this.price = price;
		this.qty = qty;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getQty() {
		return qty;
	}
	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

    
    // getters, stters n constructor
}