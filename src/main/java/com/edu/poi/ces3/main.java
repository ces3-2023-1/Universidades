package com.edu.poi.ces3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class main {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new XmlMapper();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
