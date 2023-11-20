/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Mad Malware
 */
public class Usuario extends Individuo {
    
    private String senha, confirmar;
    //idperfil
    
    public Usuario(){
        super(null, null, null);
    };
    
    public Usuario(String nome, String cpf, String email, String senha){
        super(nome, cpf, email);
        this.senha = senha;
    }
    
    @Override
    public String getNome() {
        return super.getNome();
    }

    /**
     * @param nome the nome to set
     */
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    /**
     * @return the cpf
     */
    @Override
    public String getCpf() {
        return super.getCpf();
    }

    /**
     * @param cpf the cpf to set
     */
    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    /**
     * @return the email
     */
    @Override
    public String getEmail() {
        return super.getEmail();
    }

    /**
     * @param email the email to set
     */
    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    /**
     * @return the id
     */
    @Override
    public int getId() {
        return super.getId();
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the confirmar
     */
    public String getConfirmar() {
        return confirmar;
    }

    /**
     * @param confirmar the confirmar to set
     */
    public void setConfirmar(String confirmar) {
        this.confirmar = confirmar;
    }

}
