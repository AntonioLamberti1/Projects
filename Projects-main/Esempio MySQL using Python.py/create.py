import pymysql

connection = pymysql.connect(host="localhost", port=3306, user="root", passwd="root",
database="test2")
cursor = connection.cursor()
cursor.execute("Create table studenti( "      
                "id int primary key AUTO_INCREMENT,"
                "nome varchar(100) not null,"
                "cognome varchar(100) not null,"
                "eta int not null"
                ")", end="\n")
connection.commit()
cursor.execute("Create table corsi( "      
                "id int primary key AUTO_INCREMENT,"
                "nomeCorso varchar(100) not null unique"
                ")")
connection.commit()
cursor.execute("Create table cross_studenti_corsi( "      
                "id int primary key AUTO_INCREMENT,"
                "id_studente int,"
                "id_corso int,"
                "CONSTRAINT fk_id_studente " # Inserire spazi o da errore
                "FOREIGN key (id_studente) "
                "REFERENCES studenti(id), "
                "CONSTRAINT fk_id_corso "
                "FOREIGN KEY (id_corso) "
                "REFERENCES corsi(id) "
                ")")
connection.commit()