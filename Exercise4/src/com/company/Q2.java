package com.company;

public class Q2 {
    public static String noTabs(String s, int tabPosition){
        StringBuilder ret=new StringBuilder();
        int tick=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='\t'){
                for (int j = 0; j < (tabPosition-tick%tabPosition); j++) {
                    ret.append('.');
                }
                tick=0;
            }
            else {ret.append(s.charAt(i));tick++;}
        }
        return ret.toString();
    }
}
