/**
 * Document class means that it is DB entity.
 * It should contains getter and setters which are automatically generated by Lombok framework.
 */
package org.opendap.harvester.entity.document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.time.LocalDateTime;

@Document
@Builder
public class HyraxInstance extends BaseEntity {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String reporterUrl;
    @Getter @Setter
    private Long ping = 0L;
    @Getter @Setter
    private Integer log = 0;
    @Getter @Setter
    private String versionNumber;
    @Getter @Setter
    private LocalDateTime registrationTime;
    @Getter @Setter
    private LocalDateTime lastAccessTime;
    @Getter @Setter
    private Boolean active = false;
}
