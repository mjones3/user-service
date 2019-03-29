DROP TABLE IF EXISTS teacher_student;
DROP TABLE IF EXISTS instruments;
DROP TABLE IF EXISTS invitations;


-- Table: invitation
CREATE TABLE invitations (
   id varchar(100)  NOT NULL,
   email varchar(100)  NOT NULL,
   invited_by varchar(100)  NOT NULL,
   instrument_id varchar(100)  NOT NULL,
   sent date  NOT NULL,
   accepted boolean  NOT NULL,
   CONSTRAINT pk_invitation_id PRIMARY KEY (id)
);


INSERT INTO invitations (
	id, email, invited_by, instrument_id, sent, accepted)
	VALUES ('5fe4c590-c6e9-44a3-bc38-9fce9ffa6529', 
			'michellebda@hotmail.com', 
			'832f3a1b-22a9-4bb9-a147-e3f3cb4e98b4', 
			'81162a1c-4173-423a-9251-f3984875e4f1', 
			'02/22/2019', 
			true);


-- Table: teacher_student
CREATE TABLE teacher_student (
    teacher_student_id varchar(100)  NOT NULL,
    teacher_id varchar(100)  NOT NULL,
    student_id varchar(100)  NOT NULL,
    instrument_id varchar(100)  NOT NULL,
    invited boolean  NOT NULL,
    accepted boolean  NOT NULL,
    CONSTRAINT teacher_student_id_pk PRIMARY KEY (teacher_student_id)
);

INSERT INTO teacher_student(
	teacher_student_id, teacher_id, student_id, instrument_id, invited, accepted)
	VALUES ('eac44744-700b-48c9-9e1e-92f8bd06183b', '115d26cc-e748-40bc-9962-1ea6605c15dc', '832f3a1b-22a9-4bb9-a147-e3f3cb4e98b4', '81162a1c-4173-423a-9251-f3984875e4f1', true, true);

	INSERT INTO teacher_student(
	teacher_student_id, teacher_id, student_id, instrument_id, invited, accepted)
	VALUES ('25631c14-ac5b-4823-962b-0253a900d4e9', '115d26cc-e748-40bc-9962-1ea6605c15dc', '9db31989-42c8-4fb9-b645-6fa8d2f51855', '4044721c-1d8f-42ad-9e84-4bb8612b3ff8', true, true);
	
	

-- Table: instruments
CREATE TABLE instruments (
    instrument_id varchar(100)  NOT NULL,
    user_id varchar(100)  NOT NULL,
    instrument_name varchar(100)  NOT NULL,
    CONSTRAINT instruments_pk PRIMARY KEY (instrument_id)
);

INSERT INTO instruments(
	instrument_id, user_id, instrument_name)
	VALUES ('81162a1c-4173-423a-9251-f3984875e4f1', '832f3a1b-22a9-4bb9-a147-e3f3cb4e98b4', 'Piano');
	
INSERT INTO instruments(
	instrument_id, user_id, instrument_name)
	VALUES ('4044721c-1d8f-42ad-9e84-4bb8612b3ff8', '9db31989-42c8-4fb9-b645-6fa8d2f51855', 'Piano');
	
	
