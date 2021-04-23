package com.example.project_hotel_california.service;

import com.example.project_hotel_california.model.AppUser;

import java.util.List;

public interface IAccountService {

    AppUser save(AppUser appUser);

    List<AppUser> list();

    AppUser getCurrentUser();


}
