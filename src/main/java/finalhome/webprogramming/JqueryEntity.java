package finalhome.webprogramming;

import  com.beyzaacikgoz.data.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;

//lombok
@Data
@NoArgsConstructor

//Entity
@Entity
@Table(name = "jquery")
@CrossOrigin
public class JqueryEntity extends BaseEntity implements Serializable{
    //serileştirme
    public static final long serialVersionUID = 1L;

    @Column(name = "email")
    private String email;

    @Column(name = "password", columnDefinition = "varchar(255) default 'Hm123456@'")
    private String passwd;
}