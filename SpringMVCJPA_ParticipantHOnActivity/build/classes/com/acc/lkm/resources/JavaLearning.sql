create database MyTraining;

CREATE TABLE JavaLearning (
  Trainingid int(11) unsigned NOT NULL AUTO_INCREMENT,
  Training_name varchar(20) DEFAULT NULL,
  Location varchar(20) DEFAULT NULL,
  Company varchar(20) DEFAULT NULL,
  Training_startDate datetime DEFAULT NULL,
  Training_endDate datetime DEFAULT NULL,
  PRIMARY KEY (Trainingid)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8;

INSERT INTO JavaLearning (Trainingid, Training_name,Location, Company, Training_startDate, Training_endDate) VALUES
	(1001,  'SAP','Kolkata','Accenture', '2023-08-08', '2023-10-04'),
	(1002, 'Java','Jaipur','Accenture', '2023-08-08', '2023-09-04'),
	(1003,  'DotNet','Gurugram','Accenture', '2023-08-08', '2023-08-30');
commit;