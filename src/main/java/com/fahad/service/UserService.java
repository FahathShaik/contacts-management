package com.fahad.service;import com.fahad.entityclasses.Contact;import com.fahad.entityclasses.User;import com.fahad.repositories.ContactsRepository;import com.fahad.repositories.UserRepository;import org.springframework.stereotype.Service;import java.util.List;@Servicepublic class UserService {    private final UserRepository userRepository;    private final ContactsRepository contactsRepository;    public UserService(UserRepository userRepository, ContactsRepository contactsRepository) {        this.userRepository = userRepository;        this.contactsRepository = contactsRepository;    }    public void addNewUser(User user) {        userRepository.save(user);    }    @SuppressWarnings("unused")    public List<User> getUsers() {        return userRepository.findAll();    }    public List<Contact> getAllContacts(Long id) {        return contactsRepository.findByUser_Id(id);    }    public void deleteUser(Long id) {        User user = findUserById(id);        userRepository.delete(user);    }    public User findUserById(Long id) {        return userRepository.findUserById(id);    }}