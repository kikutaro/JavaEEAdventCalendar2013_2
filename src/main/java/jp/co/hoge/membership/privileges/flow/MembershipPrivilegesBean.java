package jp.co.hoge.membership.privileges.flow;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;


/**
 * 会員特典選択ページの管理対象Bean
 * @author kikutaro
 */
@Named(value = "membershipPrivilegesBean")
@FlowScoped("privilegesFlow")
public class MembershipPrivilegesBean implements Serializable{
    
    @Getter @Setter
    private String firstName;

    @Getter
    private Map<String, String> privilegeMap;
    
    @Getter @Setter
    private String code;
    
    @PostConstruct
    public void init(){
        privilegeMap = new HashMap<>();
        privilegeMap.put("特典A", "code1");
        privilegeMap.put("特典B", "code2");
        privilegeMap.put("特典C", "code3");
    }
    
    public void startMembershipPrivileges(){
        System.out.println("会員特典フローの開始");
    }
}
