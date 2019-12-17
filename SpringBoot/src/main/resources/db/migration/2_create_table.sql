CREATE TABLE customer 
  ( 
  	 aadhaar_id        BIGINT NOT NULL, 
     name 			  VARCHAR(31), 
     email_id          VARCHAR(25), 
     created_on		  DATE,
     PRIMARY KEY (aadhaar_id) 
  );
  
  CREATE TABLE applications 
  ( 
  	 id        BIGINT NOT NULL, 
     scheme_name 			  VARCHAR(31), 
     application_status          VARCHAR(25), 
     state          VARCHAR(25), 
     created_on		  DATE,
     PRIMARY KEY (id) 
  );