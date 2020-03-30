package rost.pasportapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Passport
{
    private String name;
    private String city;
    private Integer age;

    public Passport(String name, String city, Integer age)
    {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCity()
    {
        return city;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }
}
