import java.time.LocalDateTime;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class User {

    @Id
    private String username;
    
    @Column(name = "xxx")
    private String password;
    
    @Column( name = "ISRT_TMSTMP" )
    protected LocalDateTime creationTime;

    @Column( name = "ISRT_USER_ID" )
    protected String creationUser;

    @Column( name = "LST_UPD_TMSTMP" )
    protected LocalDateTime updateTime;

    @Column( name = "LST_UPD_USER_ID" )
    protected String updateUser;
    
    private Set<Role> roles; 
}
