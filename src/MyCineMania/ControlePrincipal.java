

package MyCineMania;


public class ControlePrincipal {
    
    private Banco banco;
    private LocalizadorFuncionario locFuncionario;
    private LocalizadorAdministrador locAdministrador;
    private LocalizadorParticipante locParticipante; 
   
    public ControlePrincipal() { //Construtor

        this.banco = new Banco();
        banco.conectaBanco();
        
       this.locFuncionario = new LocalizadorFuncionario();
       this.locFuncionario.setConnection(this.banco.pegaConexao());
       
       this.locAdministrador = new LocalizadorAdministrador();
       this.locAdministrador.setConnection(this.banco.pegaConexao());
       
       this.locParticipante = new LocalizadorParticipante();
       this.locParticipante.setConnection(this.banco.pegaConexao());
    }
    
    public void Inicia(){
       frPrincipal principal = new frPrincipal(this);
       if(banco.isFuncionando()){
           principal.conexaoEstabelecida(); // se nao for validado falha a conexao no evento formWindowOpened 
       }
        principal.setVisible(true);
    }
    
}
