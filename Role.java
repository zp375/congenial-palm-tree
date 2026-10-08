import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Role {

    @Id
    private Long idSequence;
    
    @Column(name = "role_name")
    private String role;
    
    @Column( name = "ISRT_TMSTMP" )
    protected LocalDateTime creationTime;

    @Column( name = "ISRT_USER_ID" )
    protected String creationUser;

    @Column( name = "LST_UPD_TMSTMP" )
    protected LocalDateTime updateTime;

    @Column( name = "LST_UPD_USER_ID" )
    protected String updateUser;
}
