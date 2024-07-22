package com.bootcoding.dsa.leetcodel1;
/*Leetcode Q-929 WAP to find unique email addresses
Every valid email consists of a local name and a domain name, separated by the '@' sign.
Besides lowercase letters, the email may contain one or more '.' or '+'
 */
public class UniqueEmailAddr {
    public static void main(String[] args) {
        //Declare and initialize the array
        String[] emails = {"a@leetcode.com","b@leetcode.com","test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        //Method calling
        int x = numUniqueEmails(emails);
        System.out.println(x);
    }

    //Method definition
    public static int numUniqueEmails(String[] emails) {
        int[] aRate = new int[emails.length];
        int[] plusInd = new int[emails.length];
        String[] newEmail = new String[emails.length];
        int count = newEmail.length;
        for(int i = 0; i < emails.length; i++){
            aRate[i] = emails[i].indexOf("@");
            plusInd[i] = emails[i].indexOf("+");
            if(plusInd[i] == -1){
                newEmail[i] = emails[i].substring(0,aRate[i]);
            }
            else {
                newEmail[i] = emails[i].substring(0, plusInd[i]);
            }
        }
        for(int i = 0; i < newEmail.length; i++){
            newEmail[i] = newEmail[i].replaceAll("\\.", "").concat(emails[i].substring(aRate[i]));
        }
        for(int i = 0; i < newEmail.length; i++){
            for (int j = i+1; j < newEmail.length; j++){
                if(newEmail[i].equals(newEmail[j])){
                    count--;
                    break;
                }
            }
        }

        return count;
    }
}
