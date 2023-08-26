package com.thymeleaf.CourseApp.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseDto {
    Integer id;
    String name;
    String description;
    String type;
    List<String> topics;
    String thumbnail;
    UserDto userDto;
}
