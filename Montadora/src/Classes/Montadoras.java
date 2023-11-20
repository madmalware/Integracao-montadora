/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Mad Malware
 */
public class Montadoras extends Individuo{
    
    private String perfil, tel, endereco;
    
    public Montadoras(){
        super(null, null, null);
    };
    
    public Montadoras(String nome, String endereco, String tel ,String email) {
        super(nome, null, email);
        this.tel = tel;
        this.endereco = endereco;
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
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
