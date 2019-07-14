package com.qaagility.controller;

public class Count {

    public int compare (int first, int second) {
      // file changed
        if (second == 0)
        {
          return Integer.MAX_VALUE;
        }

        else
        {
          return first / second;
        }

    }

}
