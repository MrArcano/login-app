# Accesso Utenti

Realizzare un programma `JavaFX` che gestisca l’accesso ad un servizio online.

## Esercizio 1

Il sistema deve richiede all’utente di indicare il suo nome e la sua password (campi
TextField) ed alla pressione del bottone “Accedi” deve controllare le informazioni
ricevute secondo le seguenti indicazioni:

1) sia il campo nome che il campo password devono essere entrambi compilati.
1) il campo password deve contenere almeno 7 caratteri tra i quali deve apparire
almeno un numero, almeno una lettera maiuscola, ed almeno un carattere tra !, ?,
@, #.

In tutti i casi specificati, se le condizioni non vengono rispettate, alla pressione del
bottone “Accedi”, una Label informa l’utente del problema.

Se invece tutte le condizioni sono rispettate, la Label informa l’utente del successo.

## Esercizio 2

Introdurre un sistema di controllo del numero dei tentativi consecutivi di accesso
effettuati dall’utente. Una volta inserito il nome, l’utente ha al massimo 3 tentativi per
inserire una password valida (cioè che rispetti le condizioni indicate sopra).

Se alla pressione del bottone “Accedi” la password risulta non valida, il campo nome
viene reso non editabile. L’utente può provare altre due volte a modificare la
password e ritentare con “Accedi”. Una Label informa l’utente indicandogli il numero
di tentativi rimasti.

Se tutti e tre i tentativi sono falliti, sarà necessario premere su un ulteriore bottone
“Clear” che pulirà i campi e renderà nuovamente il nome editabile. In questo modo la
procedura di accesso potrà ricominciare dall’inizio.