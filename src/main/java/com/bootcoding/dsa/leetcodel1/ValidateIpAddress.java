package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-468 WAP to Validate IP Address
Given a string queryIP, return "IPv4" if IP is a valid IPv4 address, "IPv6" if IP is a valid IPv6 address
or "Neither" if IP is not a correct IP of any type.
A valid IPv4 address is an IP in the form "x1.x2.x3.x4" where 0 <= xi <= 255 and xi cannot contain leading zeros.
For example, "192.168.1.1" and "192.168.1.0" are valid IPv4 addresses while "192.168.01.1", "192.168.1.00",
and "192.168@1.1" are invalid IPv4 addresses.
A valid IPv6 address is an IP in the form "x1:x2:x3:x4:x5:x6:x7:x8" where:
1 <= xi.length <= 4
xi is a hexadecimal string which may contain digits, lowercase English letter ('a' to 'f') and upper-case
English letters ('A' to 'F').
Leading zeros are allowed in xi.
For example, "2001:0db8:85a3:0000:0000:8a2e:0370:7334" and "2001:db8:85a3:0:0:8A2E:0370:7334" are valid IPv6 addresses,
while "2001:0db8:85a3::8A2E:037j:7334" and "02001:0db8:85a3:0000:0000:8a2e:0370:7334" are invalid IPv6 addresses.

 */
public class ValidateIpAddress {
    public static void main(String[] args) {
        String queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        //Method Calling
        String result = validIPAddress(queryIP);
        System.out.println(result);
    }

    //Method Definition
    public static String validIPAddress(String queryIP) {
        if (queryIP.chars().filter(ch -> ch == '.').count() == 3) {
            return isIPv4(queryIP) ? "IPv4": "Neither";
        }else if(queryIP.chars().filter(ch -> ch == ':').count() == 7){
            return isIPv6(queryIP) ? "IPv6": "Neither";
        }else{
            return "Neither";
        }
    }

    //helper method for ipv4
    private static boolean isIPv4(String ip) {
        int segments = 0;
        int length = ip.length();
        int i = 0;

        while(i < length){
            if(segments == 4) return false;

            int start = i;
            while(i < length && ip.charAt(i) != '.'){
                if(!Character.isDigit((ip.charAt(i)))) return false;
                i++;
            }

            if(start == i || i - start > 3) return false;
            String part = ip.substring(start, i);
            if(part.length() > 1 && part.charAt(0) == '0') return false;
            int num = Integer.parseInt(part);
            if(num > 255) return false;
            segments++;
            i++;
        }

        return segments == 4 && ip.charAt(length - 1) != '.';
    }

    //helper method for ipv6
    private static boolean isIPv6(String ip) {
        String[] parts = ip.split(":", -1);
        if(parts.length != 8) return false;
        for(String part: parts){
            if(part.length() == 0 || part.length() > 4) return false;
            for(char c: part.toCharArray()){
                if(!Character.isDigit(c) &&
                    !(c >= 'a' && c <= 'f') &&
                    !(c >= 'A' && c <= 'F')){
                    return false;
                }
            }
        }

        return true;
    }
}
