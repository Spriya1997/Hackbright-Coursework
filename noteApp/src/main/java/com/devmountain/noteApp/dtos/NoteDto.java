package com.devmountain.noteApp.dtos;

import java.io.Serializable;
//import java.util.*;

import com.devmountain.noteApp.entites.Note;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto implements Serializable {
    private Long id;
    private String body;
    //private UserDto userDto;

    public NoteDto(Note note){
        if(note.getId() != null){
            this.id = note.getId();
        }
        if(note.getBody() != null){
            this.body = note.getBody();
        }
    }

    
}
