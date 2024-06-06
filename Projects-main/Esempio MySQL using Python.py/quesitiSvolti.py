''''
//Clausola: where
1)Contare quanti studenti che seguono matematica hanno piu' di 17 anni.

2)Contare quanti studenti hanno piu' di 17 anni in ogni corso.

//Clausola: having
3)Selezionare i corsi che hanno un'età media < 18

4)Selezionare i corsi dove ci sono più di 4 studenti

5)Selezionare gli studenti che seguono piu' di due corsi

6)Seleziona i corsi dove l'età massima è pari a 19

//Clausola: in
7)Seleziona gli studenti aventi cognome rossi e bianchi

//Clausola: between
8)Seleziona gli studenti che hanno tra i 17 ed i 19 anni (compresi)

//Clausola: like
9)Selezionare gli studenti che nel loro cognome presentano "ss"

10)Selezionare gli studenti che nel loro cognome presentano "i" come ultima lettera

11)Selezionare gli studenti il cui nome inizia con "m"
'''

import pymysql

connection = pymysql.connect(host="localhost", port=3306, user="root", passwd="root",
database="test2")
cursor = connection.cursor()
scelta = 0
while scelta != 12:
    scelta = int(input("Inserisci un numero da 1 a 12: "))
    if scelta == 1:
        cursor.execute("select count(*) from v_corsi_studenti "
                    " where eta > 17 and nomeCorso = 'matematica' ")
        connection.commit()
        rows = cursor.fetchall()
        print (rows)
    elif scelta == 2:
        cursor.execute("select count(*) from v_corsi_studenti"
                        " where eta > 17 ")
        connection.commit()
        rows = cursor.fetchall()
        print (rows)
    elif scelta == 3:
        cursor.execute("select nomeCorso from v_corsi_studenti "
                        " group by nomeCorso having avg(eta) < 18")
        connection.commit()
        rows = cursor.fetchall()
        print (rows)
    elif scelta == 4:
        cursor.execute("select nomeCorso from v_corsi_studenti "
                        " group by nomeCorso having count(*) > 4 ")
        connection.commit()
        rows = cursor.fetchall()
        print (rows)
    elif scelta == 5:
        cursor.execute("select nome, cognome, eta from v_corsi_studenti "
                        "group by nome, cognome, eta having count(nomeCorso) > 2")
        connection.commit()
        rows = cursor.fetchall()
        print (rows)
    elif scelta == 6:
        cursor.execute("select nomeCorso from v_corsi_studenti "
                        "group by nomeCorso HAVING MAX(eta) = 19 ")
        connection.commit()
        rows = cursor.fetchall()
        print (rows)
    elif scelta == 7:
        cursor.execute("select id, nome, cognome, eta from v_corsi_studenti "
                        "where cognome in ('rossi', 'bianchi')")
        connection.commit()
        rows = cursor.fetchall()
        print (rows)
    elif scelta == 8:
        cursor.execute("select id, nome, cognome, eta from v_corsi_studenti "
                        "where eta between 17 and 19 ")
        connection.commit()
        rows = cursor.fetchall()
        print (rows)
    elif scelta == 9:
        cursor.execute("select id, nome, cognome, eta from v_corsi_studenti "
                        "where cognome like '%ss%' ")
        connection.commit()
        rows = cursor.fetchall()
        print (rows)
    elif scelta == 10:
        cursor.execute("select id, nome, cognome, eta from v_corsi_studenti "
                        "where cognome like '%i'")
        connection.commit()
        rows = cursor.fetchall()
        print (rows)
    elif scelta == 11:
        cursor.execute("select id, nome, cognome, eta from v_corsi_studenti "
                        "where nome like 'm%' ")
        connection.commit()
        rows = cursor.fetchall()
        print (rows)
    elif scelta == 12:
        print ("Fine programma")