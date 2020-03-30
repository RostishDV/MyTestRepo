package rost.pasportapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataBase
{
    public ArrayList<Passport> passportList = new ArrayList<>();

    public void addPassport(Passport passport)
    {
        passportList.add(passport);
    }

    public String getPassports()
    {
        String passports = "{";
        for (Passport passport : passportList)
        {
            String string = "{" + passport.getCity() + " "
                    + passport.getName() + " "
                    + passport.getAge() + "}";
            passports += string;
        }
        passports += "}";
        return passports;
    }
}
