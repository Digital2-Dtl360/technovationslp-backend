package org.desarrolladorslp.technovation.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "resources")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resource implements Serializable {

    private static final long serialVersionUID = 6087371650632727123L;

    @Id
    private UUID id;

    @Column(name = "message_id")
    private UUID messageId;

    private String url;

    @Column(name = "mimetype")
    private String mimeType;
}
