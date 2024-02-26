CREATE TABLE IF NOT EXISTS registry(
    id SERIAL PRIMARY KEY,
	name varchar(20),
    email varchar(50),
	password varchar(50),
	gender varchar(10),
	note varchar(50),
	married boolean,
	birthday varchar(20),
	profession varchar(30)
);