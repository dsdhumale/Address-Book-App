package com.bridgelabz.AddressBook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Contact")
public class AddressBookModel {
    @Id
    private long id;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String city;
    private String state;
    private long zipcode;
    
    public AddressBookModel(String name, String phoneNumber, String email, String address, String city, String state,
            long zipcode) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    
}
