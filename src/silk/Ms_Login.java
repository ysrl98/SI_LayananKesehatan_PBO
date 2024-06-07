/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package silk;

/**
 *
 * @author YSRL
 */
public class Ms_Login {
    private String username;
    private String password;
    private String member_id;
    
    public Ms_Login (String username, String password, String member_id) {
        this.username = username;
        this.password = password;
        this.member_id = member_id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getMember_id() {
        return member_id;
    }
}
