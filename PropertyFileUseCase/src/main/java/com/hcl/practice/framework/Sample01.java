package com.hcl.practice.framework;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("SB1")
@ConfigurationProperties(prefix = "info.per")
public class Sample01 {

   private int id;
   private String pwd;
   
	
	  private int marks[]; 
	  private List<String> nickNames;
      private Set<Long> phoneNumbers;
	  
	  private Map<String, String> idCards; 
	  private Properties favFruits;
	  
	  private Address adrs;
	 
}
