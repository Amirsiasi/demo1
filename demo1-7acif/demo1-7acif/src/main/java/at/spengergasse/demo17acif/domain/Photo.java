package at.spengergasse.demo17acif.domain;

import lombok.Data;

import java.time.LocalDate;


@Data
public class Photo {
    private String filename;
    private String name;
    private LocalDate creationTs;
    private Integer width;
    private Integer height;
    private Oriention oriention;
}
