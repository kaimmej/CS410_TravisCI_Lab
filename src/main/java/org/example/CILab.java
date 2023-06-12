package org.example;

public class CILab implements CILabInterface {
    private String s;

    @Override
    public String getString() {
        return s;
    }

    @Override
    public void setString(String string) {
        s = string;
    }

    @Override
    public boolean detectCapitalUse() {
        char ch;
        for( int i=0 ; i<s.length() ; i++){
            ch = s.charAt(i);
            if (Character.isUpperCase(ch)){
                return true;
            }
        }
        return false;
    }

}

