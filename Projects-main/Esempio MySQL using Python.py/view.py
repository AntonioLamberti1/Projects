import pymysql

connection = pymysql.connect(host="localhost", port=3306, user="root", passwd="root",
database="test2")
cursor = connection.cursor()
cursor.execute("create view v_corsi_studenti AS "
                "select cS.id, s.nome, s.cognome, s.eta, c.nomeCorso "
                "from cross_studenti_corsi as cS join studenti as s " 
                "on "
                "s.id = cS.id_studente "
                "join corsi as c " 
                "on " 
                "c.id = cS.id_corso ")
connection.commit()