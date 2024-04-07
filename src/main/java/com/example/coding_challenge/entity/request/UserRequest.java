package com.example.coding_challenge.entity.request;

import com.example.coding_challenge.entity.Tag;
import lombok.Data;

import java.util.List;

@Data
public class UserRequest {
    private String name;
    private List<Tag> tags;
}