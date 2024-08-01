public class DependencyInjection {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);
        String customer = customerService.getCustomerById("001");
        System.out.println(customer);
    }
}
