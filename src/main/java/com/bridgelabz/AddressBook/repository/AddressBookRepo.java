package com.bridgelabz.AddressBook.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bridgelabz.AddressBook.model.AddressBookModel;

public interface AddressBookRepo extends MongoRepository<AddressBookModel, Long> {

    List<AddressBookModel> findByName(String name);

    List<AddressBookModel> findByCity(String city);

}
