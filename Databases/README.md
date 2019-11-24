Put your database folders here after exporting databases to .sql format. 

First open command line as administrator

Then browse to C:\Program Files\MySQL\MySQL Server 5.7\bin in Windows (server names may differ and check ProgramFilesx86 if it is not there in Program Files).

Make an empty database before proceeding or you can use an already existing one as well.

Then write the following commands

**Export (before uploading) :**
```
mysqldump -u YourMySQLUserName -p DatabaseName > location_where_you_wish_to_save_the_.sqlfile\filename.sql
```

**Import (to use .sql locally after cloning) :**
```
mysql -u YourMySQLUserName -p DatabaseName < location_of_the_.sqlfile\filename.sql
```
