import pymysql

connection = pymysql.connect(host="localhost", port=3306, user="root", passwd="root",
database="test2")
cursor = connection.cursor()
cursor.execute("insert into studenti(nome, cognome, eta)"
                "VALUES ('pippo','rossi',18),"
                "('marco','bianchi',15),"
                "('gino','tortora',19),"
                "('pippo','rossi',18),"
                "('marco','bianchi',15),"
                "('gino','tortora',19)")
connection.commit()
cursor.execute("insert into corsi(nomeCorso)"
                "values ('matematica'),"
                "('informatica'),"
                "('letteratura')")
connection.commit()
cursor.execute("insert into cross_studenti_corsi(id_studente, id_corso)"
"values (1,2),"
"(1,3),"
"(2,1),"
"(2,2),"
"(2,3), (3,1), (3,3), (4,2), (4,3),"
"(5,1), (5,2), (5,3), (6,1), (6,3)")
connection.commit()