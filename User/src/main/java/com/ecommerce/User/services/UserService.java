package com.ecommerce.User.services;

import com.ecommerce.User.dto.AddressDTO;
import com.ecommerce.User.dto.UserRequest;
import com.ecommerce.User.dto.UserResponse;
import com.ecommerce.User.models.Address;
import com.ecommerce.User.models.User;
import com.ecommerce.User.models.UserRole;
import com.ecommerce.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserResponse> fetchAllUsers(){
        return userRepository.findAll().stream()
                .map(this::mapToUserResponse)
                .collect(Collectors.toList());
    }

    public void addUser(UserRequest userRequest){
        User user = new User();
        updateUserFromRequest(user, userRequest);
        userRepository.save(user);
    }

    public Optional<UserResponse> fetchUser(String id) {
       return userRepository.findById(id)
               .map(this::mapToUserResponse);
    }

    public boolean updateUser(String id, UserRequest updatedUserRequest){
        return userRepository.findById(id)
                .map(existingUser->{
                    updateUserFromRequest(existingUser, updatedUserRequest);
                    userRepository.save(existingUser);
                    return true;
                }).orElse(false);
    }

    private void updateUserFromRequest(User user, UserRequest userRequest) {
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setEmail(userRequest.getEmail());
        user.setPhone(userRequest.getPhone());
        if (userRequest.getAddress()!=null){
            Address address = new Address();
            address.setStreet(userRequest.getAddress().getStreet());
            address.setCity(userRequest.getAddress().getCity());
            address.setCountry(userRequest.getAddress().getCountry());
            address.setZipcode(userRequest.getAddress().getZipcode());
            address.setState(userRequest.getAddress().getState());
            user.setAddress(address);
        }

    }

    private UserResponse mapToUserResponse(User user){
        UserResponse response = new UserResponse();
        response.setId(String.valueOf(user.getId()));
        response.setFirstName(user.getFirstName());
        response.setLastName(user.getLastName());
        response.setEmail(user.getEmail());
        response.setPhone(user.getPhone());
        response.setRole(user.getRole());

        if (user.getAddress() != null) {
            AddressDTO addressDTO = new AddressDTO();
            addressDTO.setStreet(user.getAddress().getStreet());
            addressDTO.setCity(user.getAddress().getCity());
            addressDTO.setState(user.getAddress().getState());
            addressDTO.setCountry(user.getAddress().getCountry());
            addressDTO.setZipcode(user.getAddress().getZipcode());
            response.setAddress(addressDTO);
        }
        return response;
    }
}
