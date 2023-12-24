package com.project.fanbase.api.entity;

public record UserCard(
        Long id, // Assuming a Long data type for the primary key
        String surname,
        String name,
        String email,
        String password) {
}

