package com.restaurant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Document(collection = "homepage")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Homepage {
    @Id
    private String id;

    private String title;

    private String description;
    
    private List<String> galleryImages;
}
