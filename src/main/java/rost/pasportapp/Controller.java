package rost.pasportapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class Controller
{
    @Autowired
    private DataBase dataBase;

    @RequestMapping("/home")
    public String index()
    {
        return "Welcome! To add new passport send post request to \"/post\" with params \"name\" \"city\" \"age\"\n"+
                "to get passport base send \"/get\"";
    }

    //TODO: переименовать метод
    @RequestMapping(path = "/post", method = POST)
    public Passport a(@RequestParam(value="name", required=false, defaultValue="Dick") String name,
                          @RequestParam(value="city", required=false, defaultValue="Cheboksary") String city,
                          @RequestParam(value="age", required=false, defaultValue="18") Integer age){
        Passport passport = new Passport(name, city, age);
        this.dataBase.addPassport(passport);
        return passport;
    }


    @RequestMapping("/get")
    public DataBase dataBase()
    {
        return this.dataBase;
    }
}
