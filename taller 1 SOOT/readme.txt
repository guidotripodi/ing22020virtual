   Se instalo Java versión 8
   Se descargo la herramienta SOOT provista por la cátedra
   Se seteo $jre$ de la siguiente forma export JRE=/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar (Para poder correrlo correctamente se tuvo que modificar /etc/profile mas info en https://stackoverflow.com/a/18972665/2707557)
   Se compilo cada ejercicio por separado con el comando javac -g ex1.java javac -g ex2.java javac -g ex3.java
   Se ejecuto java -cp .:soot-3.3.0-jar-with-dependencies.jar:. soot.Main -cp .:JRE -f J ex1 -print-tags -p jap.rdtagger enabled:true -p jb use-original-names:true -p jb.cp off -keep-line-number para el analisis reaching definition.
   Analogamente para el ejercicio 2, se ejecuto luego de ser compilado el siguiente comando java -cp .:soot-3.3.0-jar-with-dependencies.jar:. soot.Main -cp . JRE -f J ex2 -print-tags -p jap.lvtagger enabled:true -p jb use-original-names:true -p jb.cp off -keep-line-number
   Por ultimo, para el ejercicio 3, se ejecuto luego de ser compilado el siguiente comando java -cp .:soot-3.3.0-jar-with-dependencies.jar:. soot.Main -cp . JRE -f J ex3 -print-tags -p jap.npc enabled:true -p jb use-original-names:true -p jb.cp off -keep-line-number