package Validators;

import static java.lang.Character.isUpperCase;

public class Password {

    String password;

    public Password(String password) {
        this.password = password;
    }

    public boolean compareLength(int minLength) {

        if(password.length()<minLength)
            return false;
        else
            return true;

    }
    public boolean hasUppercase() {
        char ch;
        for(int i=0;i<password.length();i++)
        {
            ch=password.charAt(i);
            if(Character.isUpperCase(ch))
                return true;
        }
        return false;
    }
    public boolean contains(char[] symbolArray) {

        char[] ch=password.toCharArray();
        for(int i=0;i<password.length();i++)
        {
            for(int j=0;j< symbolArray.length;j++)
            {
                if(ch[i]==symbolArray[j])
                    return true;
            }
        }
        return false;
    }

    public boolean CheckIfValid() {
        if (password == null)
            return false;
        else
            return true;
    }

}
