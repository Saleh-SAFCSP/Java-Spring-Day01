package com.example.test123.controllers;

import com.example.test123.model.Account;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AccountController {


    ArrayList <Account> accountsList=new ArrayList<>();

    @GetMapping("account")
    public ArrayList<Account> getAccounts(){
        return accountsList;
    }


    @PostMapping("account")
    public ArrayList<Account> addAccount(@RequestBody Account account){
        accountsList.add(account);
        return accountsList;
    }


    @PutMapping("account/{id}")
    public ArrayList<Account> updateAccount(@PathVariable String id,@RequestBody Account account){
        for (int i = 0; i < accountsList.size(); i++) {
            if(accountsList.get(i).getId().equals(id)){
                accountsList.set(i,account);
                break;
            }
        }
        return accountsList;
    }


    @DeleteMapping("account/{id}")
    public ArrayList<Account> deleteAccount(@PathVariable String id){
        for (int i = 0; i < accountsList.size(); i++) {
            if(accountsList.get(i).getId().equals(id)){
                accountsList.remove(i);
                break;
            }
        }
        return accountsList;
    }

    @PostMapping("account/deposit/{id}")
    public ArrayList<Account> deposit(@PathVariable String id,@RequestBody Double amount){
        for (int i = 0; i < accountsList.size(); i++) {
            if(accountsList.get(i).getId().equals(id)){
                Double oldBalance=accountsList.get(i).getBalance();
                accountsList.get(i).setBalance(oldBalance+amount);
                break;
            }
        }
        return accountsList;
    }

    @PostMapping("account/withdraw/{id}")
    public ArrayList<Account> withdraw(@PathVariable String id,@RequestBody Double amount){
        for (int i = 0; i < accountsList.size(); i++) {
            if(accountsList.get(i).getId().equals(id)){
                Double oldBalance=accountsList.get(i).getBalance();
                accountsList.get(i).setBalance(oldBalance-amount);
                break;
            }
        }
        return accountsList;
    }


}
