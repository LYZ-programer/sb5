package com.gs;

import org.apache.shiro.crypto.hash.Md5Hash;

public class CryptographyUtil {

    public String encMd5(String str,String salt, int n){
        return new Md5Hash(str,salt,n).toString();
    }
}