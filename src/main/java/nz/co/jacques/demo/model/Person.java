package nz.co.jacques.demo.model;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

    @Id
    @Field
    private String id;

    @Field
    @NotBlank
    private String firstName;

    @Field
    @NotBlank
    private String lastName;
}
