  import java.util.Scanner;
  import java.util.Locale;
  import java.util.InputMismatchException;


public class ContaTerminal{

  @SuppressWarnings("unused")
  private static final String NumberFormat = null;
  
    /**
     * @param args
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Conta conta = criarConta(scanner);
        
            System.out.println("\nOlá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco," +
                            " sua agência é " + conta.getNumeroAgencia() + ", conta " + conta.getNumeroAgencia());

                               System.out.println("\nOlá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco," +
                                   " sua agência é " + conta.getNumeroAgencia() + ", conta " + conta.getNumeroAgencia() +
                                   " e seu saldo " + " já está disponível para saque.");
          
              scanner.close(); 
            }
          
            @SuppressWarnings("unused")
            private static Locale locale(String string, String string2) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'locale'");
          }
      
            private static Conta criarConta(Scanner scanner) {
        Conta conta = new Conta();
    
        while(true) {
          try {
            System.out.println("Digite o número da agência:");
            conta.setNumeroConta(scanner.nextInt());
    
            System.out.println("Digite o número da conta:");
            conta.setNumeroConta(scanner.nextInt());
            
                    System.out.println("Digite o nome do cliente:");
                    scanner.nextLine();
                    conta.setNomeCliente(scanner.nextLine());
                    
                            System.out.println("Digite o saldo inicial:");
                            conta.setSaldo(scanner.nextDouble());
                                    
                                            if(
                                              conta.getNumeroAgencia() <= 0 || conta.getNumeroAgencia() <= 0 || conta.getSaldo() <= 0);
                                                                  throw new IllegalArgumentException("Número de agência, número de conta ou saldo inválidos.");

                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Entrada inválida. Por favor, digite um número válido.");
                                                                scanner.nextLine(); // Limpar o buffer
                                                            } catch (IllegalArgumentException e) {
                                                                System.out.println(e.getMessage());
                                                              }
                                                              }
                                                            }
                                                        }
                                                        
                                                        class Conta {
                                                        @SuppressWarnings("unused")
                                                        private int numeroAgencia;
                                                        @SuppressWarnings("unused")
                                                        private int numeroConta;
                                                        @SuppressWarnings("unused")
                                                        private String nomeCliente;
                                                        @SuppressWarnings("unused")
                                                        private double saldo;
                                                        public int getNumeroAgencia() {
                                                          // TODO Auto-generated method stub
                                                          throw new UnsupportedOperationException("Unimplemented method 'getNumeroAgencia'");
                                                        }
                                                        public String getNomeCliente() {
                                                          // TODO Auto-generated method stub
                                                          throw new UnsupportedOperationException("Unimplemented method 'getNomeCliente'");
                                                        }
                                                        public void setNumeroConta(int nextInt) {
                                                      // TODO Auto-generated method stub
                                                      throw new UnsupportedOperationException("Unimplemented method 'setNumeroConta'");
                                                    }
                                                    public void setSaldo(double nextDouble) {
                                              // TODO Auto-generated method stub
                                              throw new UnsupportedOperationException("Unimplemented method 'setSaldo'");
                                            }
                                            public void setNomeCliente(String nextLine) {
                              // TODO Auto-generated method stub
                              throw new UnsupportedOperationException("Unimplemented method 'setNomeCliente'");
                            }
                            public int getSaldo() {
                      // TODO Auto-generated method stub
                      throw new UnsupportedOperationException("Unimplemented method 'getSaldo'");
                    }
}