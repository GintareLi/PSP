package Validators;

import java.util.ArrayList;
import java.util.List;

public class Email {

    String email;
    String symbolArray;


    public Email(String email) {
        this.email = email;
        symbolArray = "!#$%&'*+-/=?^`{|";
    }

    public boolean CheckIfValid() {
        if (email == null)
            return false;
        else
            return true;
    }

    public boolean hasAtSymbol() {

        if (email.contains("@"))
            return true;
        else
            return false;
    }

    public boolean hasNotAllowedSymbols() {

        char [] em=email.toCharArray();
        char [] smb=symbolArray.toCharArray();

        for(int i=0;i<symbolArray.length();i++)
        {
            for(int j=0;j<email.length();j++)//keistai sucodintas testas laukia kad grazintu false
            {
                if(smb[i]==em[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasCorrectDomainAndTLD() {

        char [] em=email.toCharArray();
        int i=0;
        if(em[email.length()-1]=='.')
        {
            return false;//jeigu paskutinis simbolis yra taskas tada tld yra nevalidus
        }
        while(i<email.length())//tikrina visa emaila
        {
            if(em[i]=='@')//kai suranda eta pradeda tikrinti domaina
            {
                if(em[i+1]=='.')
                {
                    return false;//jeigu po etos is karto eina taskas tada emailas nera validus, nes nera domaino
                }

                for(int j=i+1;j<email.length();j++)
                {
                    if(em[j]=='.')//kai randa taska vadinasi yra tld
                    {
                        return true;
                    }
                }
                return false;
            }
            i++;
        }

        return false;
    }
}