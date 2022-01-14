package com.example.Scientific;

public class Interest {
    public int interest(int p, int r, int t) {
        if(p < 0 || r < 0 || t < 0)
            return -1;
        int si = (p*r*t)/100;
        return si;
    }
}
