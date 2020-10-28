DROP TABLE IF EXISTS BANK_DETAILS;

CREATE TABLE BANK_DETAILS(ID INT AUTO_INCREMENT  PRIMARY KEY,
BANK_NAME VARCHAR(250) NOT NULL,
CITY VARCHAR(250) NOT NULL,
COUNTY VARCHAR(250) NOT NULL,
ZIP_CODE VARCHAR(250) NOT NULL
);



--INSERT INTO BANK_DETAILS (BANK_NAME,CITY,COUNTY,ZIP_CODE) VALUES
--('MidWestOne Bank','Iowa City','Johnson','52240'),
--('United Bank of Iowa','Ida Grove','Ida','51445'),
--('Fidelity Bank & Trust','Dubuque','Dubuque','52002'),
--('Bankers Trust Company','Des Moines','Polk','50309'),
--('Central Bank','Storm Lake','Buena Vista','50588'),
--('Bank Iowa','West Des Moines','Dallas','50266'),
-- ('Hills Bank and Trust Company','Hills','Johnson 1','14650')
